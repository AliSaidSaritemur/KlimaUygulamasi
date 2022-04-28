

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLSurucu implements IVeritabaniRepository {

	Ekran ekran =new Ekran();
	AgArayuz agArayuz =new AgArayuz();
	TusTakimi tusTakimi = new TusTakimi();
	
	 private Connection baglan(){

	        Connection conn=null;
	    	try {
				 conn = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/klima",
	                    "postgres", "12345");
				 System.out.println("Veritaban�na ba�land�!");
				
			}
			catch(Exception e) {
				System.out.println("Baglanti sirasinda bir hata olustu !!!");
			}
	        return conn;
	    }
	
	
	
	@Override
	public KullaniciHesap kullaniciDogrulaIs�m() {
			
		KullaniciHesap kullaniciHesabi =null;

	       ekran.mesajGoruntule("banka bilgi sistemi kullan�c�y� do�ruluyor...");
	        Araclar.bekle(2000);
	        ekran.mesajGoruntule("veritaban�na ba�land� (postgresql veritaban� y�netim sistemi) ve kullan�c�y� sorguluyor...");
	        Araclar.bekle(2000);

	        Connection conn=this.baglan();
	        
	        try
	        {
	        	ekran.mesajGoruntule("Kullanici adinizi giriniz..");
	        		String kullaniciAdi = tusTakimi.veriAlString();
	            
	            Statement selectStmt = conn.createStatement();
	            ResultSet rs = selectStmt
	              .executeQuery("SELECT * FROM kullanici WHERE kullaniciadi = "+"'"+kullaniciAdi+"'");
	  
	           
	            if(!rs.next()) {
	            	
	             ekran.mesajGoruntule("Bu kullanici adina sahip biri bulunamamkta !!!"); 
	             
	             kullaniciDogrulaIs�m();
	            }
	            else {
	    	                
	            	kullaniciDogrulaSifre(selectStmt,kullaniciAdi);
	                 
	            } 
	        
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        
		return null;
	}

	@Override
	public void hesapGuncelle(KullaniciHesap musteriHesabi) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void kullaniciDogrulaSifre(Statement selectStmt,String kullaniciAdi) {
		
		
		 ekran.mesajGoruntule("Sifrenizi giriniz..");
 		String sifre = tusTakimi.veriAlString();
 		try {
 		ResultSet  rs = selectStmt
        .executeQuery("SELECT * FROM kullanici WHERE kullaniciadi = '"+kullaniciAdi+"' AND sifre = '"+sifre+"'");
      
      if(!rs.next()) {
      	 ekran.mesajGoruntule("Sifre hatali !!!"); 	
      	kullaniciDogrulaSifre( selectStmt, kullaniciAdi);
          }
      
      else {
      	ekran.mesajGoruntule("Kullanici onaylandi"); 
      	ekran.mesajGoruntule("Secim ekraninina yonlendiriliyor..."); 
      	Araclar.bekle(100);
      	agArayuz.secimEkraniGetir();
      }
		}
		
		catch(Exception e) {
	ekran.mesajGoruntule("Veri tabaninda bir hata olustu  !!!!");
			
		}
	
	}

}
