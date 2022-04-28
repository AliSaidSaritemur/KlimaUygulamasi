

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLSurucu implements IVeritabaniRepository {

	Ekran ekran =new Ekran();
	
	
	
	 private Connection baglan(){

	        Connection conn=null;
	    	try {
				 conn = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/klima",
	                    "postgres", "12345");
				 System.out.println("Veritabanýna baðlandý!");
				
			}
			catch(Exception e) {
				System.out.println("Baglanti sirasinda bir hata olustu !!!");
			}
	        return conn;
	    }
	
	
	
	@Override
	public KullaniciHesap kullaniciDogrula(String kullaniciAdi, String sifre) {
		
		KullaniciHesap kullaniciHesabi =null;

	        System.out.println("banka bilgi sistemi kullanýcýyý doðruluyor...");
	        Araclar.bekle(2000);
	        System.out.println("veritabanýna baðlandý (postgresql veritabaný yönetim sistemi) ve kullanýcýyý sorguluyor...");
	        Araclar.bekle(2000);

	        Connection conn=this.baglan();
	        
	        try
	        {

//	            String sql= "SELECT *  FROM kullanici\" WHERE \"kullaniciAdi\"="+ kullaniciAdi;
	        	// String sql="SELECT * FROM kullanici";

	            
	            Statement selectStmt = conn.createStatement();
	            ResultSet rs = selectStmt
	              .executeQuery("SELECT * FROM kullanici WHERE kullaniciadi = "+"'"+kullaniciAdi+"'");
	       
	           
	            if(!rs.next()) {
	             ekran.mesajGoruntule("Bu kullanici adina sahip biri bulunamamkta !!!");       	
	            }
	            else {
	                 ekran.mesajGoruntule("simdilik OK");    		            	
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

}
