package com.gaohanghang.button;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/23 23:49
 */
public class RedButtonUI extends BasicButtonUI {
    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);
        LookAndFeel.installProperty(b, "opaque", Boolean.FALSE);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        g.setColor(new Color(238, 106, 94));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(0, 0, 18, 18);
        super.paint(g, c);
    }

    public void paintButtonPressed(Graphics g, AbstractButton b) {
        g.setColor(new Color(255, 98, 89));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(0, 0, 18, 18);
        g2d.setColor(new Color(82, 3, 2));
        g2d.drawLine(5, 5, 13, 13);
        g2d.drawLine(13, 5, 5, 13);
    }
}
