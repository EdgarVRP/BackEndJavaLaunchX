package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.TreeMap;
/*
 * Ejemplo de escritura de 1 caracter en archivo con hilos
 * */
public class IOTest2 {
    public static void main(String[] args) {
        Runnable t1=new Runnable() {
            @Override
            public void run() {
                try{
                    FileOutputStream fos=new FileOutputStream("C:\\holaHilo.txt");
                    fos.write(65);
                    fos.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread writeFile = new Thread(t1);
        writeFile.start();
    }
}
