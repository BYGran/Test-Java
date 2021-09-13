package Test01;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("火狐",17));
        list.add(new Student("发放",12));
        list.add(new Student("萨驰",19));
        list.add(new Student("那啊",28));

        ArrayList<Student> newl=check(list);

        for (int i = 0; i < newl.size(); i++) {
            System.out.println(newl.get(i).getName()+" "+newl.get(i).getAge());
        }
    }

    private static ArrayList<Student> check(ArrayList<Student> list) {
        ArrayList<Student> newl=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            if(s.getAge()<18){
                newl.add(s);
            }
        }
        return newl;
    }
}
