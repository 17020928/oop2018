package week7.task2;

import java.io.*;

public class Task2 {
    public int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Chia cho 0");
        } else {
            System.out.println("Kết quả là: ");
            return a / b;
        }
    }

    public void Show(int s[]) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i <= 5; i++) {
            System.out.println(s[i]);
        }
        throw new ArrayIndexOutOfBoundsException("Thừa chỗ");
    }

    public void Print() throws NullPointerException {
        String s=null;
        System.out.println(s);
        throw new NullPointerException("Con trỏ chịu");
    }

    public void ioException() throws IOException  {
        FileReader fr = new FileReader("C:\\Users\\Asus\\Desktop\\Ahigh\\bai1.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
        throw new IOException("IOException");
    }
    public void Filenot() throws FileNotFoundException{
        FileInputStream f = new FileInputStream("txt.txt");
        throw new FileNotFoundException("File thông tìm thấy");
    }
    public static void main(String[] argv){
        Task2 task2 = new Task2();
        /**
         * ArrayIndex
         */
//        int[] s = new int[3];
//        s[0]= 0;
//        s[1]= 1;
//        s[2]= 2;
//        try {
//            task2.Show(s);
//        } catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
        /**
         * Arithmetic
         */
//        try{
//            System.out.println(task2.div(10,0));
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//        }
        /**
         * NullPointer
         */
//        try {
//            task2.Print();
//        } catch (NullPointerException e){
//            e.printStackTrace();
//        }
        /**
         * ClassCast
         */
//        try{
//        Object obj = new Object();
//        Task2 task21 = (Task2)obj;
//        } catch (ClassCastException e){
//            e.printStackTrace();
//        }

        /**
         * File not found
         */
//        try{
//            task2.Filenot();
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        /**
         * IO
         */
//        try{
//            task2.ioException();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
