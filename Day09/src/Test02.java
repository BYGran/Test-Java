import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("周七");
//        2
        list.add(1,"诸葛钢铁");
//        3
        System.out.println(list);
//        4
        list.remove(0);
//        5
        list.remove("赵六");
//        6
        System.out.println(list);
//        7
        list.set(0,"韩梅梅");
//        8
        System.out.println(list);
//        9
        System.out.println(list.get(3));
//        10
        System.out.println(list.size());
    }
}
