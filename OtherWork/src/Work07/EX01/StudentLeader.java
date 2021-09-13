package Work07.EX01;

public class StudentLeader extends Student{
    private String job;

    public StudentLeader(String name, String gender, Integer age, String nationality) {
        super(name, gender, age, nationality);
    }

    public StudentLeader() {
        super();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting(){
        System.out.println("学生干部喜欢开会！");
    }
}
