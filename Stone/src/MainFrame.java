import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener, ActionListener {
//    记录0索引
    int x=0,y=0;
    int suflag=0;
//    操作步数统计
    int count=0;

//    int s[][]={
//            {1,2,3,4},
//            {5,6,7,8},
//            {9,10,11,12},
//            {13,14,0,15}
//    };
    int s[][]=new int[4][4];

    JMenuItem item1 =new JMenuItem("重新开始");
    JMenuItem item2 =new JMenuItem("退出");

    public MainFrame() throws HeadlessException {
        setFrame();
//        初始随机打乱数组的值
        restart();

//        生成界面
        setView();

        setMenu();
//        监听事件
        addKeyListener(this);

//        显示窗体
        setVisible(true);
    }

//    设置窗体
    public void setFrame(){
        setTitle("石头");
        setSize(514,595);
        setLocationRelativeTo(null);
        setLayout(null);
    }

//    设置菜单
    public void setMenu(){
        JMenuBar jMenuBar=new JMenuBar();

        JMenu menu1=new JMenu("选项");

        jMenuBar.add(menu1);

        menu1.add(item1);
        menu1.add(item2);
        //        给窗体设置菜单，super可省略
        super.setJMenuBar(jMenuBar);

        item1.addActionListener(this);
        item2.addActionListener(this);

    }
//    界面显示
    public void setView(){

//        清空
        getContentPane().removeAll();
//        URL url1 = MainFrame.class.getClassLoader().getResource("./pic/win.png");
        URL url1= MainFrame.class.getResource("/pic/win.png");
        assert url1 != null;
        JLabel succeed=new JLabel(new ImageIcon(url1));
        succeed.setBounds(124,230,268,88);
        if(suflag==1){
            getContentPane().add(succeed);
//            通关移除监听事件
            removeKeyListener(this);
        }
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
//                URL url2 = MainFrame.class.getClassLoader().getResource("./pic/"+s[i][j]+".png");
                URL url2=MainFrame.class.getResource("/pic/"+s[i][j]+".png");
                assert url2 != null;
                JLabel img=new JLabel(new ImageIcon(url2));
                img.setBounds(50+100*j,90+100*i,100,100);
                getContentPane().add(img);
            }
        }

//        URL url3 = MainFrame.class.getClassLoader().getResource("./pic/background.png");
        URL url3=MainFrame.class.getResource("/pic/background.png");
        assert url3 != null;
        JLabel bcg = new JLabel(new ImageIcon(url3));
        bcg.setBounds(26,30,450,484);
        getContentPane().add(bcg);

        JLabel step=new JLabel("步数"+count);
        step.setBounds(50,20,100,20);
        getContentPane().add(step);
        //        刷新界面
        getContentPane().repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        int k=e.getKeyCode();
        if(k==37){
            System.out.println("左");
            left();
        }else if(k==38){
            System.out.println("上");
            top();
        }else if(k==39){
            System.out.println("右");
            right();
        }else if(k==40){
            System.out.println("下");
            bottom();
        }else if(k==89){
             s=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
        }else {
            return;
        }

        System.out.println(count);
//        检查是否通关
        success();
//        重置显示
        setView();
    }

//    记录"0"的索引
    public void positon0(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(s[i][j]==0){
                  x=i;
                  y=j;
                }
            }
        }
    }

//    左移
    public void left(){
        positon0();
        if(y<3){
            s[x][y]=s[x][y+1];
            s[x][y+1]=0;
            count++;
        }
    }

//    右移
    public void right(){
        positon0();
        if(y>0){
            s[x][y]=s[x][y-1];
            s[x][y-1]=0;
            count++;
        }
    }

//    上移
    public void top(){
        positon0();
        if(x<3){
            s[x][y]=s[x+1][y];
            s[x+1][y]=0;
            count++;
        }
    }

//    下移
    public void bottom(){
        positon0();
        if(x>0){
            s[x][y]=s[x-1][y];
            s[x-1][y]=0;
            count++;
        }
    }
//    获胜检查
    public void success(){
        int su[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(su[i][j]==s[i][j]){
//                    记录有多少相同元素
                    suflag++;
                }
            }
        }
        if(suflag==16){
            suflag=1;
            System.out.println("通关!");

        }else {
            suflag=0;
        }
    }

//    重开
    public void restart(){
        int x[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r=new Random();
        for (int i = 0; i < x.length; i++) {
            int index=r.nextInt(x.length);
            int t=x[index];
            x[index]=x[i];
            x[i]=t;
        }

        for (int i = 0; i < x.length; i++) {
            s[i/4][i%4]=x[i];
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==item1){
            suflag=0;
            count=0;
            restart();
            addKeyListener(this);
            setView();
        }else if(e.getSource()==item2){
            System.exit(0);
        }
    }
}
