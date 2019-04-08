package lab4.IOO;

public class Main {
    public static void main(String[] args) {
        IOOperations ioo = new IOOperations();
        String text  = ioo.readFromFile("C:\\Users\\anama\\Documents\\GOOGLE_JAVA\\src\\lab4\\read.txt");
        System.out.println(text);
        ioo.readFromKeyboard();
    }
}
