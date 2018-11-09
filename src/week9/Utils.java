package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) {
        BufferedReader br = null;
        String s = "",line;
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader in = new InputStreamReader(file);
            br = new BufferedReader(in);
            while ((line = br.readLine()) != null) {
                s = s + line + "\n";
            }
            br.close();

        } catch (IOException e) {
            System.out.println("IOException");
        }
        return s;
    }

    public static void writeContentToFile(String path)
    {
        BufferedWriter bw = null;
        String add = "DH Cong Nghe";
        try
        {
            FileOutputStream file = new FileOutputStream(path);
            OutputStreamWriter out = new OutputStreamWriter(file);
            bw = new BufferedWriter(out);
            bw.write(add);
            bw.newLine();
            bw.close();
        }catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
    public static void writeContentToFileC(String path)
    {
        BufferedWriter bw = null;
        String add = "continued...";
        try
        {
            FileOutputStream file = new FileOutputStream(path,true);
            OutputStreamWriter out = new OutputStreamWriter(file);
            bw = new BufferedWriter(out);
            bw.write(add);
            bw.newLine();
            bw.close();
        }catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
    public static File findFileByName(String folderPath, String fileName)
    {
        String path = folderPath + "\\" + fileName;
        File file = new File(path);
        if(file.exists())
            return file;
        else
            return null;
    }
    public static void main(String[] args)
    {
        String path = "C:\\Users\\Dell\\Desktop\\data.txt";
        writeContentToFileC(path);
        System.out.println(readContentFromFile(path));
        System.out.println(findFileByName("C:\\Users\\Dell\\Desktop","data.txt"));
    }
}