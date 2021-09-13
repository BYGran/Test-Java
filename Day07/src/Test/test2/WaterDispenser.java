package Test.test2;

public class WaterDispenser {
    // （品牌 brand）（颜色 color）（容量 capacity）（模式 model）
    private String brand;
    private String color;
    private int capacity;
    private String model;

    // 提供成员方法 show - 用于展示出所有成员变量所记录的值
    public void show(){
        System.out.println("品牌为:" + brand);
        System.out.println("颜色为:" + color);
        System.out.println("容量为:" + capacity + "L");
        System.out.println("模式为:" + model);
    }


    public WaterDispenser() {
    }

    public WaterDispenser(String brand, String color, int capacity, String model) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
