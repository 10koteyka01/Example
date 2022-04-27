package codingEncoding;


import java.io.*;

public class Readers {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Zver\\Desktop\\Example\\Example\\src\\codingEncoding\\testfile.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))){
            System.out.println(reader.readLine());
        }
        catch (FileNotFoundException ex) {

        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStreamReader in = new InputStreamReader(new FileInputStream(fileName));
        while (in.ready()) {
            System.out.print((char) in.read());
        }
    }
}
