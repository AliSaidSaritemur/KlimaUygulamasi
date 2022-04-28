import java.sql.Statement;

public interface IVeritabaniRepository {
	   public KullaniciHesap kullaniciDogrulaIsým();
	   public void kullaniciDogrulaSifre(Statement selectStmt,String kullaniciAdi);
	    public void hesapGuncelle(KullaniciHesap musteriHesabi);
}
