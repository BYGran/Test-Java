package Work06.EX02;

public class Student {
    private String sname;
    private Integer sage;
    private String scontent;

    public Student(String sname, Integer sage, String scontent) {
        this.sname = sname;
        this.sage = sage;
        this.scontent = scontent;
    }

    public Student() {
    }

    void eat(){
        System.out.println("年龄为"+sage+"的"+sname+"同学正在吃饭....");
    }

    void study(){
        System.out.println("年龄为"+sage+"的"+sname+"同学正在听着"+scontent+".....");

    }
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent;
    }
}
