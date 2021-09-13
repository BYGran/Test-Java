package Work07.EX01;

public class Student extends Person{
    private String school;
    private String stuNum;

    public Student(String name, String gender, Integer age, String nationality) {
        super(name, gender, age, nationality);
    }

    public Student(String name, String gender, Integer age, String nationality, String school, String stuNum) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNum = stuNum;
    }

    public Student() {
        super();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    @Override
    void work() {
        System.out.println("学生的工作是学习");
    }
}
