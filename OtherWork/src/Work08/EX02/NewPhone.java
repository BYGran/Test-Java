package Work08.EX02;

public class NewPhone extends Phone implements IPlay{
    @Override
    public void play() {
        System.out.println("玩好游戏");
    }
}
