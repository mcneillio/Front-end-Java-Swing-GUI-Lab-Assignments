package fahrenheitpanel;
import javax.swing.JFrame;

public class Fahrenheit{

	public static void main(String[] args){
		JFrame frame = new JFrame("Fahrenheit");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		fahrenheitpanel panel = new fahrenheitpanel();		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}