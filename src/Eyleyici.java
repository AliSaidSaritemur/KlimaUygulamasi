import java.util.concurrent.TimeUnit;

import include.IEyleyici;

public class Eyleyici implements IEyleyici {


	
	@Override
	public void sogutucuAc() {
		if(!Klima.klimaDurum) {
		
			 System.out.println("Sogutucu aciliyor...");
			 Araclar.bekle();
					 System.out.println("Sogutucu acildi...");	
					 Klima.klimaDurum=true;
		}
		else{ 
			System.out.println("Sogutucu acik !!!");	
		}  
	
		
	}

	@Override
	public void sogutucuKapat() {
		
if(Klima.klimaDurum) {
	 System.out.println("Sogutucu kapatiliyor...");
	
	 Araclar.bekle();
			 System.out.println("Sogutucu kapandi...");	
			 Klima.klimaDurum=false;

}
else{ 
	System.out.println("Sogutucu kapali !!!");	
}  
		
	}

}
