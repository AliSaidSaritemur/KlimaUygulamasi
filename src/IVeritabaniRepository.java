import java.sql.Statement;

public interface IVeritabaniRepository {
	   public KullaniciHesap kullaniciDogrulaIs�m();
	   public void kullaniciDogrulaSifre(Statement selectStmt,String kullaniciAdi);
	    public void hesapGuncelle(KullaniciHesap musteriHesabi);
}
