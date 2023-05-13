import javax.swing.*;
import java.awt.*;
import java.awt.*;
import javax.swing.JPanel;

public class PanelExpendedor extends JPanel {
    public void PanelExpendedor() {
        JRadioButton rB1 = new JRadioButton("Verde");
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillRect(40, 40, 600, 900);

        g.setColor(Color.black);
        g.drawRect(40, 40, 600, 900);

        g.setColor(Color.white);
        g.fillRect(70, 70, 400, 600);

        g.setColor(Color.black);
        g.drawRect(70, 70, 400, 600);

        g.setColor(Color.white);
        g.fillRect(120, 710, 300, 80);
        g.setColor(Color.black);
        g.drawRect(120, 710, 300, 80);

    }
}
