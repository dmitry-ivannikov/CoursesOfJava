import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Facade14 {
    public static void main(String[] args) throws IOException {
        FileReadFacade fileReadFacade = new FileReadFacade();
        System.out.println(fileReadFacade.readFile("text.txt"));
    }
}

class FileReadFacade{
    String readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuffer stringBuffer = new StringBuffer();
        int j = 0;
        while ((j = reader.read()) != -1){
            stringBuffer.append((char)j);
        }
        return stringBuffer.toString();
    }
}