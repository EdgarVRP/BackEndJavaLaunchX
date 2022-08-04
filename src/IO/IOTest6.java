package IO;

import java.io.FileInputStream;

public class IOTest6 {
    public static void main(String[] args) {
        try{
            FileInputStream fis =new FileInputStream("C:\\magia.txt");
            int i=0;
            while ((i= fis.read())!=-1){
                System.out.println((char) i);
            }
            fis.close();
        }catch(){

        }
    }
}
