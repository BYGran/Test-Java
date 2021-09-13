import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener, ActionListener {
    int lo[][]=new int[4][4];
//    int lo[][]={
//        {2,2,4,16},
//        {2,32,2,8},
//        {128,2,256,2},
//        {512,8,1024,2048}
//};
    int score=0;
    int checklose=1;
    char skin='B';

    JMenuItem item1=new JMenuItem("经典");
    JMenuItem item2=new JMenuItem("霓虹");
    JMenuItem item3=new JMenuItem("糖果");
    JMenuItem item4=new JMenuItem("重新开始");
    JMenuItem item5=new JMenuItem("退出");

    public MainFrame() throws HeadlessException {
        setFrame();
        setview();
//        初始化菜单
        setMenu();
//        为窗体添加监听事件
        this.addKeyListener(this);
//        可视化窗体
        setVisible(true);
    }

    public void setMenu() {
//        长条
        JMenuBar menuBar=new JMenuBar();
//        栏目
        JMenu menu1=new JMenu("选项");
        JMenu menu2=new JMenu("换肤");
        JMenu menu3=new JMenu("关于我们");

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        menu1.add(item4);
        menu1.add(item5);

        menu2.add(item1);
        menu2.add(item2);
        menu2.add(item3);
//        给窗体设置菜单，super可省略
        super.setJMenuBar(menuBar);

        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
        item4.addActionListener(this);
        item5.addActionListener(this);
    }

    //    窗体初始化
    public void setFrame(){
//        super.setTitle()中super省略
        setTitle("2048");
        setSize(514,538);
//        窗体居中
        setLocationRelativeTo(null);
        setBackground(Color.lightGray);
//        取消默认布局
        setLayout(null);


    }

//    初始化界面
    public void setview(){
//        移除界面图片内容
        getContentPane().removeAll();
        URL url1= MainFrame.class.getResource("/pic/"+skin+"-Lose.png");
        assert url1 != null;
        JLabel los=new JLabel(new ImageIcon(url1));
        los.setBounds(90,100,354,233);
        if(checklose==0)
        getContentPane().add(los);

        //      图片编号对应数组索引
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                URL url2= MainFrame.class.getResource("/pic/"+skin+"-"+lo[i][j]+".png");
                assert url2 != null;
                JLabel img=new JLabel(new ImageIcon(url2));
                img.setBounds(50+100*j,50+100*i,100,100);
//                调用Jframe方法，super也可省略
                super.getContentPane().add(img);
            }
        }

        URL url3= MainFrame.class.getResource("/pic/"+skin+"-Background.jpg");
        assert url3 != null;
        JLabel backgrd=new JLabel(new ImageIcon(url3));
        backgrd.setBounds(40,40,420,420);
        super.getContentPane().add(backgrd);

        JLabel jLabel=new JLabel("得分："+score);
        jLabel.setBounds(50,20,100,20);
        getContentPane().add(jLabel);

//        刷新界面
        getContentPane().repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        if(key==37){
            System.out.println("左");
            left(lo,1);
            moveset();
        }else if(key==38){
            System.out.println("上");
            top(lo,1);
            moveset();
        }else if(key==39){
            System.out.println("右");
            right(lo,1);
            moveset();
        }else if(key==40){
            System.out.println("下");
            bottom(lo,1);
            moveset();
        }else {
            return;
        }

        check();
        //            刷新页面
        setview();
    }

//    左移
    public void left(int a[][],int flag){
        int b[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            int l=0;
            for (int j = 0; j < 4; j++) {
                if(a[i][j]!=0){
                    b[i][l++]=a[i][j];
                }
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length-1; j++) {
                if(b[i][j]==b[i][j+1]){
                    b[i][j]*=2;
                    if(flag==1){
                        score+=b[i][j];
                    }
                    for(int k=j+1;k<b.length-1;k++){
                        b[i][k]=b[i][k+1];
                    }
                    b[i][3]=0;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                lo[i][j]=b[i][j];
//                System.out.print(lo[i][j]);
            }
//            System.out.println();
        }

    }

//    反转
    public void reverse(int a[][]){
        int re[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >=0; j--) {
                re[i][j]=a[i][3-j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                lo[i][j]=re[i][j];
            }
        }
    }

//    右移
    public void right(int a[][],int flag){
        reverse(a);
        left(lo,flag);
        reverse(lo);
    }

//    左旋转
    public void lChange(int a[][]){
        int c[][]=new int[4][4];

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j]=a[j][3-i];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               lo[i][j]=c[i][j];
            }
        }

    }

//    右旋转
    public void rChange(int a[][]){
        int c[][]=new int[4][4];

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j]=a[3-j][i];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                lo[i][j]=c[i][j];
            }
        }
    }

//    上移
    public void top(int a[][],int flag){
        lChange(a);
        left(lo,flag);
        rChange(lo);
    }

//    下移
    public void bottom(int a[][],int flag){
        rChange(a);
        left(lo,flag);
        lChange(lo);
    }

//    随机生成“2”
    public void moveset(){
        int a[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int b[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int count=0;
        for (int i = 0; i < lo.length; i++) {
            for (int j = 0; j < lo[i].length; j++) {
                if(lo[i][j]==0){
                    a[count]=i;
                    b[count]=j;
                    count++;
                }
            }
        }
        if(count!=0){
            Random r=new Random();
            int index=r.nextInt(count);
            int x=a[index];
            int y=b[index];
            lo[x][y]=2;
        }
    }

    public Boolean checkL(){
        int ch[][]=new int[4][4];
        boolean flag=false;
        copy(lo,ch);
        left(lo,2);
        xx:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(ch[i][j]!=lo[i][j]){
                    flag=true;
                    break xx;
                }
            }
        }
        copy(ch,lo);
        return flag;
    }
    public Boolean checkR(){
        int ch[][]=new int[4][4];
        boolean flag=false;
        copy(lo,ch);
        right(lo,2);
        xx:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(ch[i][j]!=lo[i][j]){
                    flag=true;
                    break xx;
                }
            }
        }
        copy(ch,lo);
        return flag;
    }
    public Boolean checkT(){
        int ch[][]=new int[4][4];
        boolean flag=false;
        copy(lo,ch);
        top(lo,2);
        xx:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(ch[i][j]!=lo[i][j]){
                    flag=true;
                    break xx;
                }
            }
        }
        copy(ch,lo);
        return flag;
    }
    public Boolean checkB(){
        int ch[][]=new int[4][4];
        boolean flag=false;
        copy(lo,ch);
        bottom(lo,2);
        xx:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(ch[i][j]!=lo[i][j]){
                    flag=true;
                    break xx;
                }
            }
        }
        copy(ch,lo);
        return flag;
    }
    public void check(){
        if(checkL()==false&&checkR()==false&&checkT()==false&&checkB()==false){
            checklose=0;
        }
    }

//    数组备份
    public void copy(int y[][],int co[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                co[i][j]=y[i][j];
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==item1){
            skin='A';
            setview();
        }else if(e.getSource()==item2){
            skin='B';
            setview();
        }else if(e.getSource()==item3){
            skin='C';
            setview();
        }else if(e.getSource()==item4){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    lo[i][j]=0;
                }
            }
            score=0;
            setview();
        }else if(e.getSource()==item5){
            System.exit(0);
        }
    }
}