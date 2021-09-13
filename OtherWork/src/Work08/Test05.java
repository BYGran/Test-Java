package Work08;

public class Test05 {
    public static void main(String[] args) {

    }
}

class basicT{
    private String name;
    private Integer age;

    void teacch(){

    }
    public basicT() {
    }

    public basicT(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

abstract class teacher{
    String name;

    public teacher() {
    }

    String age;

    public teacher(String name, String age) {
        this.name = name;
        this.age = age;
    }
    abstract void teach();
}