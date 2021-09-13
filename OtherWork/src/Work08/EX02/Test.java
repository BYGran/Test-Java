package Work08.EX02;

public class Test {
    public static void main(String[] args) {
        use(new OldPhone());
        System.out.println("-------");
        use(new NewPhone());
    }

    public static void use(Phone p){
        if(p instanceof OldPhone){
            p.call();
            p.send();
        }else if(p instanceof NewPhone){
            NewPhone x=new NewPhone();
            x.play();
        }
    }
}
