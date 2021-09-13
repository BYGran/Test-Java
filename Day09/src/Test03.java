import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五试试");
        list.add("赵六刚刚");
        list.add("周七");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()==4){
                list.remove(i);
                i--;

            }
        }
        System.out.println(list);
    }
}
