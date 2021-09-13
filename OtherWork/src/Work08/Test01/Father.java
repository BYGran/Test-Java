package Work08.Test01;

public  class Father {
    public void aa(){
        System.out.println("method father");
    }
}

class Son extends Father{

    int age=10;
    public void show(){
        age=20;
        System.out.println(age);
    }
    @Override
    public void aa(){
        System.out.println("son method");
    }
}
class Test{
    public static void main(String[] args) {
        Father f=new Father();
        f.aa();

        Father s=new Son();
        s.aa();


    }
}