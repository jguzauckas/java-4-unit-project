import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Assignment {
    public static String readIn(String filename) {
		BufferedReader in;
		String str = "";

		try {
			in = new BufferedReader(new FileReader(filename));
			str = in.readLine(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return str;
	}

    public static void main(String[] args) {
        String puzzleInput = readIn("string.txt");
        
        // Your work goes here!
    }
}
