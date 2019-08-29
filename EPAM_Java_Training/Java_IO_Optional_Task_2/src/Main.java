import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String stringLine = "";
        List<String> arrayList = new ArrayList<String>();
        try {
            BufferedReader bufferedReader = new BufferedReader
                    (new FileReader("file.txt"));
            while (stringLine != null)
            {
                stringLine = bufferedReader.readLine();
                stringBuilder.append(stringLine);
                stringBuilder.append(System.lineSeparator());
                stringLine = bufferedReader.readLine();
                if (stringLine==null)
                    break;
                arrayList.add(stringLine);
                String[]  arrayLine = new String[arrayList.size()];

                arrayList.toArray(arrayLine);

                for (String  string : arrayLine) {
                    System.out.println(string.replace("public","private"));

                }
            }
            System.out.println( "ArrayList: " + arrayList);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

    }
}