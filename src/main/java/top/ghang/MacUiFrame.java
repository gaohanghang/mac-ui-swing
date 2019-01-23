package top.ghang;

import top.ghang.button.GreenButtonUI;
import top.ghang.button.RedButtonUI;
import top.ghang.button.YellowButtonUI;
import top.ghang.panel.MacUiPanel;
import top.ghang.panel.Uspanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/23 23:46
 */
public class MacUiFrame extends JFrame {
    private int mx, my, jfx, jfy;
    private MacUiPanel headline;
    private JPanel Usp;

    public MacUiFrame() {
        this.setUndecorated(true);
        headline = new MacUiPanel();
        Usp = new Uspanel();

        this.setLayout(null);
        this.setSize(500, 170);
        setLocationRelativeTo(getOwner());  // 设置窗口居中
        headline.setBounds(0, 0, this.getWidth(), 30);
        Usp.setBounds(0, 30, this.getWidth(), getHeight() - 25);

        headline.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                setLocation(jfx + (e.getXOnScreen() - mx), jfy + (e.getYOnScreen() - my));

            }
        });
        headline.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mx = e.getXOnScreen();
                my = e.getYOnScreen();
                jfx = getX();
                jfy = getY();
            }
        });
        JButton button = new JButton();
        button.setUI(new RedButtonUI());
        button.setBorderPainted(false);
        button.setBounds(10, 7, 18, 18);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        headline.add(button);
        JButton button1 = new JButton();
        button1.setUI(new YellowButtonUI());
        button1.setBorderPainted(false);
        button1.setBounds(37, 7, 18, 18);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setExtendedState(ICONIFIED);
            }
        });
        headline.add(button1);
        JButton button2 = new JButton();
        button2.setUI(new GreenButtonUI());
        button2.setBorderPainted(false);
        button2.setBounds(64, 7, 18, 18);
        headline.add(button2);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        this.add(headline);
        add(Usp);
        setBackground(new Color(0, 0, 0, 0));
    }

    public void setSize(int width, int height) {
        super.setSize(width, height);
        setLocationRelativeTo(getOwner());// 设置窗体居中
        headline.setBounds(0, 0, this.getWidth(), 30);
        Usp.setBounds(0, 30, this.getWidth(), getHeight() - 25);
    }

    public Component join(Component component) {
        return Usp.add(component);
    }

    @Override
    public void setTitle(String title) {
        headline.setTitle(title);
    }
}