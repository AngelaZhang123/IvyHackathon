import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileWriter; import java.io.PrintWriter;
import java.io.File; import java.io.FileNotFoundException;
import java.io.IOException;import java.util.Scanner;

public class Imm extends JPanel implements ActionListener{
    CardLayout lay;
    JPanel cards;

    public Imm(CardLayout x, JPanel y)
    {
        lay =x;
        cards=y;
        JTextField title = new JTextField("Immigration");
        add(title);

    }
    public void paintComponent(Graphics g) //the graphics for Main menu (the background pic)
    {
        super.paintComponent(g);

    }
    public void actionPerformed(ActionEvent e)
    {

    }
}
