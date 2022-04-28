

public class FirmaBilgiSistemi  implements IFirmaBilgiSistemi{

	private IVeritabaniRepository veritabani;
	
	public FirmaBilgiSistemi(IVeritabaniRepository veritabani) {
	        this.veritabani=veritabani;
	    }

	@Override
	public KullaniciHesap kullaniciDogrula(String kullaniciAdi, String sifre) {
		
		return veritabani.kullaniciDogrula(kullaniciAdi,  sifre);
	}

	@Override
	public void hesapGuncelle(KullaniciHesap kullaniciHesap) {
		   veritabani.hesapGuncelle(kullaniciHesap);
	}

}
