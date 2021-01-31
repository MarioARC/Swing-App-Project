import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main
{
  public static void main(String args[])
  {
    JFrame frame1 = new JFrame("App");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(500, 500);
    frame1.setVisible(true);

    // Panel 1
    JPanel panel1 = new JPanel(new GridLayout(2, 2, 20, 20));

    // Button 1
    JButton button1 = new JButton("Button Test");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Pressed");
      }
    }); // end ActionListener

    panel1.add(button1);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
  }
}