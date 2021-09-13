package Work07.EX02;

public class Coder extends Person{
    public Coder(String id, double salary) {
        super(id, salary);
    }

    public Coder() {
        super();
    }

    @Override
    public void work() {
        System.out.println(this.getId()+" "+this.getSalary());

    }
}
