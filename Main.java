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

    // Panel 1 for buttons
    JPanel panel1 = new JPanel(new GridLayout(2, 2, 20, 20));

    // Panel 2 for labels and textfields
    JPanel panel2 = new JPanel(new GridLayout(2, 2, 20, 20));

    // Label 1
    JLabel label1 = new JLabel("Greetings");

    // Label 2
    JLabel label2 = new JLabel("Waiting...");

    // TextField 1
    JTextField textfield1 = new JTextField(10);

    // TextField 2
    JTextField textfield2 = new JTextField(10);

    // Button 1 to change Label 1
    JButton button1 = new JButton("Change greeting");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        String[] phrases = {"Hello", "Hi!", "Howdy", "How's it going?", "Welcome", "Nice to meet you"};
        String newText = phrases[(int)(Math.random() * phrases.length)];
        label1.setText(newText);
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

    // add components to panel2
    panel2.add(label1);
    panel2.add(label2);
    panel2.add(textfield1);
    panel2.add(textfield2);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.SOUTH, panel2);
  }
}