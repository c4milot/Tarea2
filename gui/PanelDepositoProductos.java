package gui;

import javax.swing.*;
import java.awt.*;

public class PanelDepositoProductos extends JPanel {
    public PanelDepositoProductos(){

    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillRect(80,80,20,20);
    }
}
