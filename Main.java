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
    }); // end ActionListener button1

    // Button 2
    JButton button2 = new JButton("Second Button");

    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Different Pressed");
      }
    }); // end ActionListener button2

    // Button 3
    JButton button3 = new JButton("Third Button");

    button3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Ok this should work");
      }
    }); // end ActionListener button3

    // add components to panel1
    panel1.add(button1);
    panel1.add(button2);
    panel1.add(button3);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
  }
}