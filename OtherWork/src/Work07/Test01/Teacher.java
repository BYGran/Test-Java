package Work07.Test01;

public class Teacher extends Person{
    @Override
    public void work() {
        super.work();
        System.out.println("老师的工作是要好好讲课");
    }
}
