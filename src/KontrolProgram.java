import java.sql.Connection;
import java.sql.DriverManager;

public class KontrolProgram {

	public static void main(String[] args) {
	
	
		PostgreSQLSurucu postgreSQLSurucu =new PostgreSQLSurucu();
		postgreSQLSurucu.kullaniciDogrula("Said", "Gorg");
		
		
		
		
//		
//		Klima klima =new Klima(); 
//		klima.basla();
	}

}
