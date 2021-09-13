package Work07.EX02;

public class JingL extends Person{
    private double others;

    public JingL(String id, double salary, double others) {
        super(id, salary);
        this.others = others;
    }

    public JingL() {
        super();
    }

    public double getOthers() {
        return others;
    }

    public void setOthers(double others) {
        this.others = others;
    }
    @Override
    public  void work(){
        System.out.println(this.getId()+" "+this.getSalary()+" "+this.getOthers());
    }
}
