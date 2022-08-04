package IO;

import java.io.FileOutputStream;
import java.io.IOException;
/*
* Ejemplo de escritura de 1 caracter en un archivo
* */
public class IOTest {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\hola.txt");
            fos.write(65);
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
