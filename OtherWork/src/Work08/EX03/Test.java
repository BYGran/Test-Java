package Work08.EX03;

public class Test {
    public static void main(String[] args) {
        useJDDog(new JiduDog());

    }
    public static void useJDDog(Animal a){
        JiduDog j=new JiduDog();
        j.jidu();
        a.wang();
    }
}
