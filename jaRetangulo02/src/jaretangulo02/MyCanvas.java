package jaretangulo02;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author EDGARD
 */
public class MyCanvas extends JComponent {
    
    
    Retangulo  rCanvas;
    
    MyCanvas()
    {
        
    }
    
    MyCanvas(Retangulo r)
    {
        rCanvas = r;
    }
    
    public void paint(Graphics g) {
      int b = (int) rCanvas.getBase(); // casting de double para int
      int a = (int) rCanvas.getAltura();
      g.drawRect (10, 10, b, a);  
  }
}
    
