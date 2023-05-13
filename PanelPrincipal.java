import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal(){
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBackground(Color.white);
    }
    public void paint(Graphics g){
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    }
}
