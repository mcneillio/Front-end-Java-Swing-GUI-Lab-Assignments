import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StyleOptionsEnterText extends JPanel{
	
   private JLabel saying;
   private JCheckBox bold, italic;
   private JTextField txtFont;

   public StyleOptionsEnterText(){
      saying = new JLabel ("Say it with Style!");
      saying.setFont (new Font ("Helvetica", Font.PLAIN, 36));

      bold = new JCheckBox ("Bold");
      bold.setBackground (Color.cyan);
      italic = new JCheckBox ("Italic");
      italic.setBackground (Color.cyan);

      StyleListener listener = new StyleListener();
      bold.addItemListener (listener);
      italic.addItemListener (listener);
      txtFont=new JTextField(10);
      add (saying);
      add (bold);
      add (italic);
      add(new JLabel("Enter font size of text: "));
      add(txtFont);
      FontListener fontListener=new FontListener();
      txtFont.addActionListener(fontListener);

      setBackground (Color.cyan);
      setPreferredSize (new Dimension(300, 200));
   }

   private class FontListener implements ActionListener{
   
	   public void actionPerformed(ActionEvent e){
      
		   int fontSize=Integer.parseInt(txtFont.getText());
		   saying.setFont(new Font("TimesNewRoman", Font.PLAIN, fontSize));      
	   }
   }

  
   private class StyleListener implements ItemListener{
      
      public void itemStateChanged (ItemEvent event)
      {
         int style = Font.PLAIN;
         if (bold.isSelected())
            style = Font.BOLD;

         if (italic.isSelected())
            style += Font.ITALIC;

         saying.setFont (new Font ("Helvetica", style, 36));
      }
   }
}
