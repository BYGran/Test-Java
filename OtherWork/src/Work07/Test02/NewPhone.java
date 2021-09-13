package Work07.Test02;

public class NewPhone extends Phone{
    @Override
    public void call() {
        super.call();
        System.out.println("视频电话");
    }
}
