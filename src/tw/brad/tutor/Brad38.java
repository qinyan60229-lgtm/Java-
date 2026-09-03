package tw.brad.tutor;

import java.io.File;
import java.io.FileInputStream;

public class Brad38 {

    public static void main(String[] args) {
        File source = new File("dir1/file2.txt");
        byte[] buf = new byte[(int)source.length()];
        // 作用是作為硬碟與記憶體之間的「暫存空間」
        System.out.println(source); // dir1\file2.txt
        System.out.println((int)source.length()); // 6
        System.out.println(new byte[(int)source.length()]); // [B@28a418fc
        // 用 new 創造出一個全新的空陣列後，印出該陣列實體的記憶體位址
        
        try {
            FileInputStream fin = new FileInputStream(source);
            fin.read(buf);
            // b - the buffer into which the data is read.
            fin.close();
            
            System.out.println(new String(buf)); // 哈哈
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}