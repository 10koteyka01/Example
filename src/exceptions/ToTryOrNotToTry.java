package exceptions;

import java.io.*;
import java.sql.SQLException;
import java.util.zip.ZipException;

public class ToTryOrNotToTry {


    public void tryWithFinally() {
        BufferedReader reader = null;


        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("")));
        } catch (Exception e) {

            //
        } finally {

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void tryWithResources() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("")))) {
            //reader
            if (reader == null)
                throw new SQLException("");
            else
                throw new IndexOutOfBoundsException("");
        } catch (FileNotFoundException | SQLException | IndexOutOfBoundsException e) {
            System.out.println();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//какой-то код

    }
}
