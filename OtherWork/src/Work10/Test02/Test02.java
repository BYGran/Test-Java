package Work10.Test02;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        String a="91 27 46 38 50";
        String b[]=a.split(" ");
        int x[]=new int[b.length];
        for (int i = 0; i < x.length; i++) {
            x[i]=Integer.parseInt(b[i]);
        }
        Arrays.sort(x);
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            builder.append(x[i]);
        }
        System.out.println(builder.toString());
    }
}
