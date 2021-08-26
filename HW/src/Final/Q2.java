package Final;

import java.io.*;

public class Q2{
    public static void main(String[] args){
        try{
            FileInputStream f1 = new FileInputStream("hangeul-euc-kr.txt");
            byte[] b = f1.readAllBytes();
            
            String str1 = new String(b, "EUC-KR");
            byte[] u = str1.getBytes("UTF-8");
            
            String str2 = new String(u, "UTF-8");
            FileOutputStream f2 = new FileOutputStream("hangeul-utf8.txt");
            OutputStreamWriter output = new OutputStreamWriter(f2, "UTF-8");
            output.write(str2);
            output.close();
            f1.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
        
        try{
            FileInputStream file = new FileInputStream("hangeul-utf8.txt");
            InputStreamReader input =  new InputStreamReader(file, "UTF-8");
            
            char[] input1 = new char [1024];
            input.read(input1);
            System.out.println(input1);
            input.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
