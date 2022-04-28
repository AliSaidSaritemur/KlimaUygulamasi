

import java.util.Scanner; 
public class AgArayuz {
	
		 Scanner scan = new Scanner(System.in);
		 
	public AgArayuz() {
	Ekran ekran	= new Ekran();
		int secim=0;
	
		while(secim !=5) {
			
			
			ekran.mesajGoruntule("**********************************************");
			ekran.mesajGoruntule("Ana Menu");
			ekran.mesajGoruntule("1-Sogutucuyu Ac");
			ekran.mesajGoruntule("2-Sogutucuyu Kapat");
			ekran.mesajGoruntule("3-Sicaklik Goruntule");
			ekran.mesajGoruntule("4-Cikis");
			ekran.mesajGoruntule("Seciminiz:");
			secim= scan.nextInt();
			ekran.mesajGoruntule("**********************************************");
			
			
			
			if(secim==1) {
				
				
			}
			
			if(secim==2) {
				
				
			}
			
			if(secim==3) {
				ekran.mesajGoruntule("Sicaklik goruntuleniyor...");
				SicaklikAlgilayici sicaklikAlgilayici =new SicaklikAlgilayici();
				ekran.mesajGoruntule("Sicaklik :" +sicaklikAlgilayici.sicaklikOku()+" °C");
			}
			
			if(secim==4) {
				
				ekran.mesajGoruntule("Çýkýlýyor...");
				
				
			}
			
			
		}
		
		
		
		
		
	}
	
}
