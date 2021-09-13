package Work06;

public class MainApp {
    public static void main(String[] args) {
        Teacher t=new Teacher("t001","薛之谦",1,26,"Java");
        Course c=new Course("s001","Java","2007-2-2","Java学科！");
        System.out.println(t.getTid()+" "+t.getName()+" "+t.getSex()+" "+t.getAge()+" "+t.getSubject());
    }
}
class Teacher {
    private String tid;
    private String name;
    private Integer sex;
    private Integer age;
    private String subject;

    public Teacher(String tid, String name, Integer sex, Integer age, String subject) {
        this.tid = tid;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.subject = subject;
    }

    public Teacher() {
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class Course{
    private String cid;
    private String subject;
    private String date;
    private String info;

    public Course(String cid, String subject, String date, String info) {
        this.cid = cid;
        this.subject = subject;
        this.date = date;
        this.info = info;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Course() {
    }
}