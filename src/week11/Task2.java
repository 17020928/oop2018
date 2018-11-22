package week11;

public class Task2 {
    public static <T extends Comparable> T max(T[] a){
        if(a==null||a.length==0) return null;
        T max=a[0];
        for(int i=1;i<a.length;i++){
            if(max.compareTo(a[i])<0) max=a[i];
        }
        return max;
    }
    public static void main(String[] argv){
        Integer[] word = {5,0,3,4,1};
        System.out.print(Task2.<Integer>max(word)+" ");

        Short[] word1 = {5,0,3,4,1};
        System.out.print(Task2.<Short>max(word1)+" ");

        String[] word2 = {"Nghia","Nhanh","Thanh giao su","Kha"};
        System.out.print(Task2.<String>max(word2)+" ");
    }
}
