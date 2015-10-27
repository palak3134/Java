package BasicIO;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CharacterStream {
	public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("/home/palak/Desktop/training.txt");
            outputStream = new FileWriter("/home/palak/Desktop/training.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
