package Work08.EX03;

 class Animal {

     void eat(){};
     void wang(){};
}

interface Jidu{
     abstract void jidu();
}

class JiduDog extends Animal{
     void jidu(){
         System.out.println("用鼻子侦测毒");
     }

    @Override
    void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    void wang() {
        System.out.println("汪汪叫");
    }

    public JiduDog() {
    }
}