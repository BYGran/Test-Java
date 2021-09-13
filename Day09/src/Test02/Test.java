package Test02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("火狐",18));
        list.add(new Student("发放",12));
        list.add(new Student("萨驰",19));
        list.add(new Student("那啊",28));

        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            if(s.getAge()<18){
                System.out.println(s.getName()+" "+s.getAge());
            }
        }
    }
}
