package Work07.Test03;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        Dog d=new Dog();
        d.eat();
        AnimalOperator A=new AnimalOperator();
        Animal a=new Animal();
        A.useeat(a);
    }
}
