package Demo;

import java.util.ArrayList;
import java.util.Date;
import Demo.Student;

public class Test01 {
    public static void main(String[] args) {
        int a[]={100,200,300};
        System.out.println(a);
        double[] b ={11.1,22.2,33.3};
        System.out.println(b);
        ArrayList<Student> list=new ArrayList<>();
        Student st=new Student("aaa","csacac");
        list.add(st);
        for (int i=0;i<list.size();i++){
            Student x=list.get(i);
            System.out.println(x.getName()+" "+x.getInfo());
        }

    }
}
