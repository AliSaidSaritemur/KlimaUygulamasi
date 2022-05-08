import java.util.concurrent.TimeUnit;

import include.IEyleyici;

public class Eyleyici implements IEyleyici {


	
	@Override
	public void sogutucuAc() {
	
	SogutucuAcma acma =new SogutucuAcma();
	acma.islemYap();
		
	}

	@Override
	public void sogutucuKapat() {
		
		SogutucuKapa kapa =new SogutucuKapa();
		kapa.islemYap();
	}

}
