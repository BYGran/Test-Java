package Work08.EX01;

 class JingL extends F{

     public JingL(String name, String id, Integer salary, Integer others) {
         super(name, id, salary);
         this.others = others;
     }

     public Integer getOthers() {
         return others;
     }

     public void setOthers(Integer others) {
         this.others = others;
     }

     private Integer others;

     @Override
     void work() {
         System.out.println(getId()+" "+getName()+" "+getSalary()+" "+getOthers());
     }
 }

class Coder extends F{
    public Coder(String name, String id, Integer salary) {
        super(name, id, salary);
    }

    public Coder() {
    }

    @Override
    void work() {
        System.out.println(getId()+" "+getName()+" "+getSalary());
    }
}

class F{
    private String name;
    private String id;
    private Integer salary;

    public F() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public F(String name, String id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void work(){
        System.out.println(111);
    }
}