package fahrenheitpanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fahrenheitpanel extends JPanel{
	
private JLabel inputLabel, outputLabel,resultLabel;
private JTextField fahrenheit;
private JButton calculate;


	public fahrenheitpanel(){	
		inputLabel = new JLabel("Enter Fahrenheit Temperature:");
		outputLabel = new JLabel("Temperature in Celsius:");
		resultLabel = new JLabel("---");
		calculate=new JButton("Calculate");

		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener (new TempListener());
		calculate.addActionListener (new TempListener());
		add (inputLabel);
		add (fahrenheit);
		add(calculate);
		add (outputLabel);
		add (resultLabel);
		setPreferredSize (new Dimension(300, 75));
		setBackground (Color.yellow);
    }


private class TempListener implements ActionListener{
	
	public void actionPerformed (ActionEvent event){
		Integer fahrenheitTemp, celsiusTemp;
		String text = fahrenheit.getText();
		fahrenheitTemp = Integer.parseInt (text);
		celsiusTemp = (fahrenheitTemp-32) * 5/9;
		resultLabel.setText (Integer.toString (celsiusTemp));

		}
	}
}