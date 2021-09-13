package ClassWork;

public class Test01 {
    public static void main(String[] args) {
        Student1 s=new Student1("阿道夫",16);
        System.out.println(s.name+" "+s.age);
    }
}

class Student1{
     String name;
     Integer age;

    public Student1() {
    }

    public Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    //    public Student1(String name,Integer age){
//        this.age=age;
//        this.name=name;
//    }
}