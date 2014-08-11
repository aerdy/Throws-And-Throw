
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ThrowsException {
	public static void main(String[] args) {
		try {
		methodTidakBertanggungJawab();
		} catch(FileNotFoundException ex){
		ex.printStackTrace();
		} catch(IOException ex) {
		ex.printStackTrace();
		}
		System.out.println("kode di dalam method main");
		}
		public static void methodTidakBertanggungJawab() throws FileNotFoundException,
		IOException {
		System.out.println("kode setelah buka file");
		}

}
