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

    // Panel 3 for images
    JPanel panel3 = new JPanel(new BorderLayout(10, 10));

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

    // Button 2 to combine textfield1 and textfield 2
    JButton button2 = new JButton("Get all text");

    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        String allText = textfield1.getText() + " " + textfield2.getText();

        label2.setText(allText);

        System.out.println(allText); // test if it adds the textfields together

        textfield1.setText("");
        textfield2.setText("");
      }
    }); // end ActionListener button2

    // Button 3 to clear label2
    JButton button3 = new JButton("Clear text");

    button3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        label2.setText("Waiting...");
      }
    }); // end ActionListener button3

    // Image 1 of a waving hand
    ImageIcon handImg = new ImageIcon("wave.png", "A hand waving");
    JLabel handLabelPic = new JLabel(handImg);

    // add components to panel1
    panel1.add(button1);
    panel1.add(button2);
    panel1.add(button3);

    // add components to panel2
    panel2.add(label1);
    panel2.add(label2);
    panel2.add(textfield1);
    panel2.add(textfield2);

    // add components to panel3
    panel3.add(handLabelPic);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.SOUTH, panel2);
    frame1.getContentPane().add(BorderLayout.CENTER, panel3);
  }
}