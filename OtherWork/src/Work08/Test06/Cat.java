package Work08.Test06;

public class Cat extends Animal implements Jumpping{

    public Cat(String name, String age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println(this.getAge()+"  "+this.getName());
    }
}
