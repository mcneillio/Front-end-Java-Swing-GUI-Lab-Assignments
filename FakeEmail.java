import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FakeEmail extends JPanel{
	
private JTextField to, cc, bcc, subject;
private JTextPane content;
private JButton send;


public FakeEmail(){
to = new JTextField(20);
cc= new JTextField(20);
bcc= new JTextField(20);
subject= new JTextField(20);
add(makecomponentWithLabel("to", to));
add(makecomponentWithLabel("cc", cc));
add(makecomponentWithLabel("bcc", bcc));
add(makecomponentWithLabel("subject", subject));
send= new JButton("Send");
add(send);
send.addActionListener(new SendListener());

setBackground (Color.red);
content = new JTextPane();
content.setPreferredSize(new Dimension(260, 200));
add(content);
}

public JPanel makecomponentWithLabel(String label, Component comp){
	
JPanel pan = new JPanel();
pan.setLayout(new BorderLayout());
pan.add(new JLabel(label, JLabel.RIGHT), BorderLayout.WEST);
pan.add(comp, BorderLayout.CENTER);
return pan;
}


private class SendListener implements ActionListener{
	


public void actionPerformed(ActionEvent event){
	
System.out.println("To: " + to.getText());
System.out.println("Cc: " + cc.getText());
System.out.println("Bcc: " + bcc.getText());
System.out.println("Subject: " + subject.getText());
System.out.println("\nMessage content here: \n");
System.out.println(content.getText());


}
}



public static void main(String[] args){


JFrame frame = new JFrame("Compose a Message");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

FakeEmail emailone = new FakeEmail();
frame.getContentPane().add(emailone);

frame.setSize(350, 470);

frame.setVisible(true);
}
}