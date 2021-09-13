package Work07.EX01;

public class Worker extends Person{
    private String unit;
    private Integer workAge;

    @Override
    void work() {
        System.out.println("工人的工作是盖房子");
    }
}
