package week11;

public class Task1 {
    public static <T extends Comparable> void sort(T[] a){
        if(a==null||a.length==0) return;
        for(int i = 0 ;i < a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].compareTo(a[j])>0){
                    T temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] argv){
        Integer[] word = {5,0,3,4,1};
        Task1.<Integer>sort(word);
        for (int i=0;i<word.length;i++)
        System.out.print(word[i]+" ");

        Short[] word1 = {5,0,3,4,1};
        Task1.<Short>sort(word1);
        for (int i=0;i<word1.length;i++)
            System.out.print(word1[i]+" ");

        String[] word2 = {"Nghia","Nhanh","Thanh giao su","Kha"};
        Task1.<String>sort(word2);
        for (int i=0;i<word2.length;i++)
            System.out.print(word2[i].toString()+" ");
    }
}
