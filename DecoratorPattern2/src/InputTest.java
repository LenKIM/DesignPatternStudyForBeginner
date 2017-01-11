import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by len on 2017. 1. 11..
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
      int c;
        try {
        InputStream in =
                new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("test.txt")
                        )
                );

        while ((c = in.read()) >= 0) {
            System.out.println((byte)c);
        }
        in.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
