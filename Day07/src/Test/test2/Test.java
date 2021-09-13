package Test.test2;

public class Test {
    /*
        编写饮水机类 WaterDispenser
        定义四个成员变量（品牌 brand）（颜色 color）（容量 capacity）（模式 model）
        私有成员变量，提供 setXxx\getXxx 方法
        提供空参、带参构造方法
        提供成员方法 show - 用于展示出所有成员变量所记录的值

        编写测试类 Test
        使用带参构造方法创建对象，给属性赋值为（美的，红色，5L，手动净水）
        调用show方法执行
        将容量获取出来，并判断容量是否大于3L.
     */
    public static void main(String[] args) {
        WaterDispenser wd = new WaterDispenser("美的", "红色", 5, "手动净水");
        wd.show();

        int capacity = wd.getCapacity();

        if(capacity > 3){
            System.out.println("容量是大于3L的");
        }


    }
}
