import java.sql.Statement;

public interface IVeritabaniRepository {
	   public KullaniciHesap kullaniciDogrulaIsým();
	   public KullaniciHesap kullaniciDogrulaSifre(Statement selectStmt,KullaniciHesap hesap);
	    public void veriTabaniBagla();
}
