import java.sql.Statement;

public interface IVeritabaniRepository {
	   public KullaniciHesap kullaniciDogrulaIs�m();
	   public KullaniciHesap kullaniciDogrulaSifre(Statement selectStmt,KullaniciHesap hesap);
	    public void veriTabaniBagla();
}
