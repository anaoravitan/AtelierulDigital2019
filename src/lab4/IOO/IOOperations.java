package lab4.IOO;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOOperations {
    public String readFromFile(String filePath) {
        String text = "";
        FileReader fr = null;
        try {
            fr = new FileReader(filePath);
            int c;
            while ((c = fr.read()) != -1) {
                text += (char)c;
            }
        } catch (FileNotFoundException exception) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException exception) {
            System.out.println("IO EXCEPTION");
        }finally {
            closeFile(fr);
        }
        return text;
    }

    private void closeFile(FileReader fr) {
        try {
            if (fr != null) fr.close();
        }catch (IOException e){
            System.out.println("Unable to access close stream");
        }
    }

    public void readFromKeyboard() {
        String text;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Insert a double: ");
        Double a = scanner.nextDouble();
        System.out.println("The inserted number is " + a);

    }
}
