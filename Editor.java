import java.io.*;
class Editor {
    public static void main(String[] args) throws Exception {
        String fileName = "notes.txt";

        FileWriter fw = new FileWriter(fileName);
        fw.write("Hello, this is my text file.");
        fw.close();

        FileReader fr = new FileReader(fileName);
        int ch;
        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);
        fr.close();
    }
}
