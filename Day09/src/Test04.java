import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("1");
        list.add("test");
        list.add("test");
        list.add("2");
//        for (int i = 0; i < list.size(); i++) {
//            if("test".equals(list.get(i))){
//                list.remove(i);
//                i--;
//            }
//        }
        list.removeAll(Collections.singleton("test"));

        System.out.println(list);
    }

}

class x extends ArrayList<Exception>{
    @Override
    public boolean removeAll(Collection c) {
        return super.removeAll(c);
    }
}
