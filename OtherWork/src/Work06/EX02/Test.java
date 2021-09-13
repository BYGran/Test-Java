package Work06.EX02;

public class Test {
    public static void main(String[] args) {
        Student st=new Student("韩光",18,"面向对象知识");
        Teacher t=new Teacher("周志鹏",30,"，面向对象知识");
        t.eat();
        t.talk();
        st.eat();
        st.study();
    }
}
