import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.EventObject;
import java.util.Random;

public class MainFrame extends JFrame {
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        JButton btny = new JButton("是");
        JButton btnn = new JButton("不是");
        btny.setBounds(50, 50, 100, 30);
        mf.getContentPane().add(btny);
        btnn.setBounds(300, 50, 100, 30);
        mf.getContentPane().add(btnn);
        btnn.addMouseListener(new MouseListenerImpl());
        btny.addMouseListener(new ML());


    }

    public MainFrame() {
        initFrame();
        setVisible(true);
    }

    public void initFrame() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(3);
        setTitle("我是不是嫩爹");
    }
}

class ML extends MouseListenerImpl {
    @Override
    public void mouseReleased(MouseEvent e) {
        MainFrame secondFrame = new MainFrame();
        JLabel jl1 = new JLabel(new ImageIcon("D:\\预习资料\\02-2020JavaSE-2048\\附加资料\\石头迷阵\\资料\\mimage\\background.png"));
        jl1.setBounds(0, 0, 246, 271);
        secondFrame.getContentPane().add(jl1);
        /*JLabel jl2 = new JLabel("111");
        jl2.setBounds(100,100,100,100);
        secondFrame.getContentPane().add(jl2);
         */
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}

class MouseListenerImpl implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("真行啊你");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Random r = new Random();
        JButton btnn = (JButton) e.getSource();
        btnn.setBounds(r.nextInt(300) + 150, r.nextInt(440) + 80, 100, 30);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
