package top.ghang.panel;

import javax.swing.*;
import java.awt.*;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/23 23:47
 */
public class MacUiPanel extends JPanel {

    private static boolean aBoolean = false;
    private String title = "@liulai";

    public MacUiPanel() {
        this.setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(new Color(200, 200, 200));
        g2d.fillRoundRect(0, 0, this.getWidth(), 34, 10, 10);

        g2d.setColor(new Color(50, 50, 50));
        g2d.setFont(new Font("Hevetica Neue", Font.PLAIN, 14));
        g2d.drawString(title, this.getWidth() / 2 - title.length() * 4, 20);
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
