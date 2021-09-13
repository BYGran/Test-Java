package Test01;

public class Test {
    public static void main(String[] args) {
        Student[] a=new Student[3];
        Student st1=new Student("方法",18);
        Student st2=new Student("渤海人寿",20);
        Student st3=new Student("还是v的",19);

        a[0]=st1;
        a[1]=st2;
        a[2]=st3;

        for (int i = 0; i < a.length; i++) {
            Student s=a[i];
            System.out.println(s.getName()+"------"+s.getAge());
        }
    }
}
