package IO;

import java.io.FileOutputStream;
import java.io.IOException;
/*
 * Ejemplo de escritura de cadena de texto en archivo con hilos
 * */
public class IOTest4 {
    public static void main(String[] args) {
        Runnable t1=new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream("C:\\magiaConHilos.txt");
                    String s = "Magia e Hilos!!!";
                    byte b[] = s.getBytes();
                    fos.write(b);
                    fos.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            };
        Thread writeFile = new Thread(t1);
        writeFile.start();
    }
}
