package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a,b
        if(a==0) return b;
        if(b==0) return a;
        if(a<0) a=-a;
        if(b<0) b=-b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else b = b - a;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0) return 0;
        if(n==1) return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] argv){
        System.out.println(gcd(90,-18));
        System.out.println(fibonacci(42));
    }
}