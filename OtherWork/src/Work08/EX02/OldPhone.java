package Work08.EX02;

public class OldPhone extends Phone{
    public OldPhone() {

    }

    @Override
    void call() {
        System.out.println("打电话");
    }

    @Override
    void send() {
        System.out.println("发短信");
    }
}
