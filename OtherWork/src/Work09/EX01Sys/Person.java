package Work09.EX01Sys;

public class Person {
    private String name;
    private Integer psw;
    private String birth;
    private String info;

    public Person(String name, Integer psw, String birth, String info) {
        this.name = name;
        this.psw = psw;
        this.birth = birth;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPsw() {
        return psw;
    }

    public void setPsw(Integer psw) {
        this.psw = psw;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Person() {
    }
}
