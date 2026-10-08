import java.io.*;
class Fitness {
    public static void main(String[] args) throws Exception {
        String fileName = "fitness.txt";
        String data = "Name: John\nAge: 25\nGoal: Weight Loss";
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(data.getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream(fileName);
        int ch;
        while ((ch = fis.read()) != -1)
            System.out.print((char) ch);
        fis.close();
    }
}
