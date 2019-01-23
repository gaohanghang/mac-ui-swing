import org.junit.Test;
import top.ghang.MacUiFrame;
import top.ghang.button.GreenButtonUI;
import top.ghang.panel.MacUiPanel;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/23 23:58
 */
public class MacUiTest {
    public static void main(String[] args) {
        MacUiFrame macUiFrame = new MacUiFrame();
        macUiFrame.setTitle("hello world!");
        macUiFrame.setSize(300, 170);
        macUiFrame.setVisible(true);
    }
}
