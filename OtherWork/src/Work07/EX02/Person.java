package Work07.EX02;

public class Person {
    private String id;
    private double salary;

    public Person(String id, double salary) {
        super();
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person() {
        super();
    }
    public void work(){
        System.out.println("测试");
    }
}
