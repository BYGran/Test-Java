package Work11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<Student> c= new ArrayList<Student>();

        Student st1=new Student("爱吃的",18);
        Student st2=new Student("发发是",22);
        Student st3=new Student("给我发",24);

        c.add(st1);
        c.add(st2);
        c.add(st3);

        Iterator<Student> i=c.iterator();
        while(i.hasNext()){
            Student st=i.next();
            System.out.println(st.getName()+" "+st.getAge());
        }
    }
}
