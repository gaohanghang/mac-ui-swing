package top.ghang.button;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/23 23:55
 */
public class YellowButtonUI extends BasicButtonUI {
    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);
        LookAndFeel.installProperty(b, "opaque", Boolean.FALSE);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        g.setColor(new Color(246, 190, 79));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(0, 0, 18, 18);
        super.paint(g, c);
    }

    public void paintButtonPressed(Graphics g, AbstractButton b) {
        g.setColor(new Color(253, 181, 37));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(0, 0, 18, 18);
        g2d.setColor(new Color(134, 69, 2));
        g2d.drawLine(3, 9, 14, 9);
    }
}
