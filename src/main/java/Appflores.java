import javax.swing.*;
import java.awt.*;

public class Appflores {


    public void crearUI() {
        JFrame f = new JFrame();
        f.setSize(500, 500);


        JButton fleD = new JButton(">");
        JButton fleI = new JButton("<");
        fleD.setBounds(50, 10, 45, 30);
        fleI.setBounds(10, 10, 45, 30);
        f.add(fleD);
        f.add(fleI);

        JTextField id = new JTextField();
        id.setBounds(200, 10, 100, 30);
        f.add(id);
        Label lId = new Label("ID");
        lId.setBounds(170, 10, 30, 30);
        f.add(lId);


        JTextField nombre = new JTextField();
        nombre.setBounds(100, 60, 200, 30);
        f.add(nombre);
        Label lnombre = new Label("Nombre");
        lnombre.setBounds(50, 60, 100, 30);
        f.add(lnombre);

        JComboBox color = new JComboBox();
        color.setBounds(100, 90, 200, 30);
        f.add(color);
        Label lcolor = new Label("Color");
        lcolor.setBounds(50, 90, 100, 30);
        f.add(lcolor);

        /*JScrollPane scp = new JScrollPane();
        scp.setBounds(100,90,100,50);
        f.add(scp);*/

        f.setLayout(null);
        f.setVisible(true);
    }
}
