

public class AgArayuz {
	
TusTakimi tusTakimi= new TusTakimi();
		 Eyleyici eyleyici =new Eyleyici();
	public AgArayuz() {
	Ekran ekran	= new Ekran();
		int secim=0;
	
		while(true) {
			
			ekran.mesajGoruntule("**********************************************");
			ekran.mesajGoruntule("Ana Menu");
			ekran.mesajGoruntule("1-Sogutucuyu Ac");
			ekran.mesajGoruntule("2-Sogutucuyu Kapat");
			ekran.mesajGoruntule("3-Sicaklik Goruntule");
			ekran.mesajGoruntule("4-Cikis");
			ekran.mesajGoruntule("Seciminiz:");
			secim =tusTakimi.veriAl();
			ekran.mesajGoruntule("**********************************************");
								
			if(secim==1) {
				eyleyici.sogutucuAc();
				
			}
			
			if(secim==2) {
				eyleyici.sogutucuKapat();
				
			}
			
			if(secim==3) {
				ekran.mesajGoruntule("Sicaklik goruntuleniyor...");
				SicaklikAlgilayici sicaklikAlgilayici =new SicaklikAlgilayici();
				ekran.mesajGoruntule("Sicaklik :" +sicaklikAlgilayici.sicaklikOku()+" �C");
			}
			
			if(secim==4) {
				ekran.mesajGoruntule("��k�l�yor...");
				break;
							
			}
			else {
				ekran.mesajGoruntule("1-4 aras�nda bir say� girmelisiniz");			
			}
		}
			
		
	}
	
}
