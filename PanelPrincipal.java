import javax.swing.*;
import java.awt.*;


class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal(){
        setLayout(new GridLayout(1, 2)); // 2 filas, 1 columna
        exp = new PanelExpendedor();
        add(exp);
        com = new PanelComprador();
        add(com);
    }
}