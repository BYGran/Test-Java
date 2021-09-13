package LianXi.Manager;

public class Manager {
    private String name;
    private String gnum;
    private int gz;
    public Manager(){
    }
    public Manager(String name,String gnum,int gz){
        this.name=name;
        this.gnum=gnum;
        this.gz=gz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGnum() {
        return gnum;
    }

    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    public int getGz() {
        return gz;
    }

    public void setGz(int gz) {
        this.gz = gz;
    }
    void work(){
        System.out.println("工号为"+gnum+"基本工资为"+gz+"项目经理"+name+"正在努力的做着管理工作,分配任务,盯着程序员写代码...");
    }
}
