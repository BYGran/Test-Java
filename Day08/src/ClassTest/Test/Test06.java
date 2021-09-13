package ClassTest.Test;

public class Test06 {
    public static void main(String[] args) {
        String a="";
        long start = System.currentTimeMillis();
        StringBuilder b= new StringBuilder(a);
        for (int i = 0; i < 100000; i++) {
            b.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(b);
    }
}
