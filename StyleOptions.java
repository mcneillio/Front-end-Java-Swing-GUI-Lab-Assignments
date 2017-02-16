import javax.swing.JFrame;

public class StyleOptions{

   public static void main (String[] args){
      JFrame frame = new JFrame ("Style Options");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      StyleOptionsEnterText panel = new StyleOptionsEnterText();
      frame.getContentPane().add (panel);
      
//Take away slashes to use slider instead!
      
    //StyleOptionsSlider panel2= new StyleOptionsSlider();
    //frame.getContentPane ().add(panel2);

      frame.pack();
      frame.setVisible(true);
   }
}
