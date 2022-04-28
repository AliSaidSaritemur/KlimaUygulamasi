import java.sql.Connection;
import java.sql.DriverManager;

public class KontrolProgram {

	public static void main(String[] args) {
	
	Ekran ekran = new Ekran();
		PostgreSQLSurucu postgreSQLSurucu =new PostgreSQLSurucu();
	
		postgreSQLSurucu.kullaniciDogrulaIsým();
	}

}
