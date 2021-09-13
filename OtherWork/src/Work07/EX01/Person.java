package Work07.EX01;

public class Person {
    private String name;
    private String gender;
    private Integer age;
    private String nationality;

    public Person(String name, String gender, Integer age, String nationality) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }
    void eat(){

    }
    void sleep(){

    }
    void work(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Person() {
        super();
    }
}
