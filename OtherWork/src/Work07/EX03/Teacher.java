package Work07.EX03;

public class Teacher extends Person{

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher() {
    }
    @Override
    void eat(){
        System.out.println("教师吃饭");
    }
    void teach(){
        System.out.println(this.getAge()+"岁的"+this.getName()+"在讲课");
    }
}
