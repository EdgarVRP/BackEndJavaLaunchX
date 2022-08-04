package IO;

import java.io.FileOutputStream;
import java.io.IOException;
/*
 * Ejemplo de escritura de cadena de texto en archivo
 * */
public class IOTest3 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\magia.txt");
            String s="Magia!!!";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
