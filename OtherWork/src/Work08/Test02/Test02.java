package Work08.Test02;

public class Test02 {
    public static void main(String[] args) {
//        Animal a=new Animal();
        Animal a=new Cat();
        a.eat();
    }
}

 abstract class Animal{
    abstract void eat();
    void sleep(){
        System.out.println("睡觉");
    }
 }

// class Dog extends Animal{
//
// }

class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }
}