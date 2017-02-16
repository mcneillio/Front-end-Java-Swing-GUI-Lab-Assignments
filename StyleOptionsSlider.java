import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsSlider extends JPanel{
	
   private JLabel saying;
   private JCheckBox bold, italic;
   private JSlider fontSlider;

   public StyleOptionsSlider(){
	   
      saying = new JLabel ("Say it with Style!");
      saying.setFont (new Font ("Helvetica", Font.PLAIN, 36));

      bold = new JCheckBox ("Bold");
      bold.setBackground (Color.cyan);
      italic = new JCheckBox ("Italic");
      italic.setBackground (Color.cyan);

      StyleListener listener = new StyleListener();
      bold.addItemListener (listener);
      italic.addItemListener (listener);
  
      fontSlider=new JSlider(JSlider.HORIZONTAL,1, 100,1);
      fontSlider.setPaintTicks(true);
      fontSlider.setMajorTickSpacing(10);
    
      add (saying);
      add (bold);
      add (italic);
      add(fontSlider);
    
      FontListenerSlider fontListener=new FontListenerSlider();
      fontSlider.addChangeListener(fontListener);

      setBackground (Color.cyan);
      setPreferredSize (new Dimension(300, 200));
   }

private class FontListenerSlider implements ChangeListener{

   public void stateChanged(ChangeEvent e) {
  
       int fontSize=fontSlider.getValue();
       saying.setFont(new Font("TimesNewRoman", Font.PLAIN, fontSize));  
   }  
 }

   private class StyleListener implements ItemListener{    
	   
      public void itemStateChanged (ItemEvent event){
         int style = Font.PLAIN;
         if (bold.isSelected())
            style = Font.BOLD;

         if (italic.isSelected())
            style += Font.ITALIC;

         saying.setFont (new Font ("Helvetica", style, 36));
      }
   }
}