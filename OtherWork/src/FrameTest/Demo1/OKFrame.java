package FrameTest.Demo1;

import javax.swing.*;
import java.awt.*;

public class OKFrame {
    public static void main(String[] args) {
        new Test();
    }
}

class Test extends JFrame {
    public Test() throws HeadlessException {
        setFrame();
        setMenu();
        setView();
        setVisible(true);
    }

    public void setFrame(){
        setTitle("能买给你生瓜蛋子?");
        setSize(500,600);
        setLocationRelativeTo(null);
        setLayout(null);
    }

    public void setMenu(){
        JMenuBar j=new JMenuBar();
        JMenu menu1=new JMenu("吸铁石");
        JMenu menu2=new JMenu("萨日朗");
        JMenuItem item1=new JMenuItem("我");
        JMenuItem item2=new JMenuItem("开");
        JMenuItem item3=new JMenuItem("水");
        JMenuItem item4=new JMenuItem("果");
        JMenuItem item5=new JMenuItem("摊");
        JMenuItem item6=new JMenuItem("的");
        JMenuItem item7=new JMenuItem("欸");
        JMenuItem item8=new JMenuItem("华");
        JMenuItem item9=new JMenuItem("强");


        setJMenuBar(j);
        j.add(menu1);
        j.add(menu2);

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        menu1.add(item5);
        menu1.add(item6);

        menu2.add(item7);
        menu2.add(item8);
        menu2.add(item9);
    }
    public void setView(){
        getContentPane().removeAll();
        JLabel a=new JLabel(new ImageIcon("E:\\1.png"));
        a.setBounds(110,20,258,292);
        getContentPane().add(a);

        JLabel b=new JLabel(new ImageIcon("E:\\2.png"));
        b.setBounds(50,400,117,122);
        getContentPane().add(b);
        JLabel c=new JLabel(new ImageIcon("E:\\2.png"));
        c.setBounds(170,400,117,122);
        getContentPane().add(c);
        JLabel d=new JLabel(new ImageIcon("E:\\2.png"));
        d.setBounds(290,400,117,122);
        getContentPane().add(d);

    }
}