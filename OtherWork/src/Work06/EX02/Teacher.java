package Work06.EX02;

public class Teacher {
    private String tname;
    private Integer age;
    private String content;

    public Teacher() {
    }
    void eat(){
        System.out.println("年龄为"+age+"的"+tname+"老师正在吃饭....");
    }

    void talk(){
        System.out.println("年龄为"+age+"的"+tname+"老师正在讲着"+content+".....");

    }
    public Teacher(String tname, Integer age, String content) {
        this.tname = tname;
        this.age = age;
        this.content = content;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String ontent) {
        this.content = ontent;
    }
}
