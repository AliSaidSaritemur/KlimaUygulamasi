import java.sql.Connection;
import java.sql.DriverManager;

public class KontrolProgram {

	public static void main(String[] args) {
	
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/klima",
                    "postgres", "12345");
			
			
		}
		catch(Exception e) {
			System.out.println("Baglanti sirasinda bir hata olustu !!!");
		}
		
//		
//		Klima klima =new Klima(); 
//		klima.basla();
	}

}
