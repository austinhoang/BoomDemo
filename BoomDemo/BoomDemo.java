/**
 * Simulates two particles flying apart in an explosion.
 *
 * @author TK Rogers
 * @version 7-28-11
 */
 
// Import statements add code to your programs from existing Java libraries
import java.awt.* ;
import javax.swing.* ;
import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;
import javax.swing.Timer ;

public class BoomDemo extends JFrame implements ActionListener {
    int dotHeight = 10,
         dotWidth  = 100,
         x = 255 ,
         x_coordinate1 = 250 ,
         y_coordinate1 = 250 ,
         x_coordinate2 = 250 ,
         y_coordinate2 = 250 ,
         x_coordinate3 = 250 ,
         y_coordinate3 = 250 , 
         x_coordinate4 = 250 , 
         y_coordinate4 = 250 , 
         x_coordinate5 = 250 ,
         y_coordinate5 = 250 , 
         x_coordinate6 = 250 ,
         y_coordinate6 = 250 ,
         x_coordinate7 = 250 ,
         y_coordinate7 = 250 ,
         x_coordinate8 = 250 ,
         y_coordinate8 = 250 ;
       
    // The timer will create an event every 10 milliseconds. This
    // event will trigger the actionPerformed method and cause
    // the screen to repaint itself.
    private Timer timer = new Timer ( 1 , this ) ;
 
     // Note: methods are small segments of code that perform specific tasks.
   // Methods can be reused repeatedly within a program.
       
    // The method below is called a constructor and must have the same
   // name as the class. Constructors set initial conditions.    
   BoomDemo ( ) {
       setSize ( 500, 500 ) ; // sets the size of the frame
       timer.start ( ) ;
   }
       
    // The main method starts up the program.  
    public static void main ( ) {
        BoomDemo boom = new BoomDemo ( ) ;
        boom.setVisible ( true ) ;
        boom.setBackground( new Color ( 255, 255, 255 ) ) ;
    }
       
   // The paint method automatically runs once. Afterwards it can
   // only be run using the repaint method.
   public void paint ( Graphics g ) {
        // In Java graphics, the origin is at the top left. increasing
        // the x-coordinate moves objects to the right. Increasing the 
        // y-coordinate moves objects downward.
      
        if ( x_coordinate1 == 500) {
         x_coordinate1 = 250 ;
         y_coordinate1 = 250 ;
         x_coordinate2 = 250 ;
         y_coordinate2 = 250 ;
         x_coordinate3 = 250 ; 
         y_coordinate3 = 250 ; 
         x_coordinate4 = 250 ; 
         y_coordinate4 = 250 ; 
         x_coordinate5 = 250 ;
         y_coordinate5 = 250 ;
         x_coordinate5 = 250 ;
         y_coordinate5 = 250 ; 
         x_coordinate6 = 250 ;
         y_coordinate6 = 250 ;
         x_coordinate7 = 250 ;
         y_coordinate7 = 250 ;
         x_coordinate8 = 250 ;
         y_coordinate8 = 250 ;
            x = 255 ;
        }
      
        // The next 2 lines of code paint over, hence, erase any dots drawn the
        // previous time repaint ( ) was run       
        g.setColor ( new Color ( x, x, x ) ) ;
        g.fillRect ( 0, 0, getSize ( ).width, getSize ( ).height ) ;
        
        g.setColor ( new Color (255, 0, 0) ) ; 
        g.fillRect (x_coordinate3, y_coordinate3, dotHeight, dotWidth);
        
        x_coordinate3 = x_coordinate3 + 1;
        y_coordinate3 = y_coordinate3;
        
        g.setColor ( new Color (255, 100, 2) ) ; 
        g.fillRect (x_coordinate4, y_coordinate4, dotHeight, dotWidth);
        
        x_coordinate4 = x_coordinate4 - 1;
        y_coordinate4 = y_coordinate4;
        
        g.setColor ( new Color (0, 100, 2) ) ; 
        g.fillRect (x_coordinate5, y_coordinate5, dotHeight, dotWidth);
        
        x_coordinate5 = x_coordinate5;
        y_coordinate5 = y_coordinate5 - 1;
        
        g.setColor ( new Color (145, 250, 2) ) ; 
        g.fillArc (x_coordinate6, y_coordinate6, dotHeight, dotWidth);
        
        x_coordinate6 = x_coordinate6;
        y_coordinate6 = y_coordinate6 + 1;
        
        g.setColor ( new Color (120, 100, 2) ) ; 
        g.fillRect (x_coordinate7, y_coordinate7, dotHeight, dotWidth);
        
        x_coordinate7++; 
        y_coordinate7--;
       
        g.setColor ( new Color (120, 100, 100) ) ; 
        g.fillRect (x_coordinate8, y_coordinate8, dotHeight, dotWidth);
        
        x_coordinate8--; 
        y_coordinate8++;
        
        g.setColor ( new Color ( 255, 255, 0 ) ) ;
        g.fillRect ( x_coordinate1, y_coordinate1, dotHeight, dotWidth ) ;
    // The next 2 lines of code cause the red dot to move along a 
  // diagonal line, downward and toward the right, away from the
  // center.
        x_coordinate1 = x_coordinate1 + 1 ; // The ++ operator adds 1 to x_Coordinate
        y_coordinate1 = x_coordinate1 ; // This is the Java version of the
  // equation y = mx + b where m or the slope = 1 and b = 0
           
        g.setColor (new Color ( 0, 0, 255 ) ) ;
        g.fillRect ( x_coordinate2, y_coordinate2, dotHeight, dotWidth );
  // The next 2 lines of code cause the blue dot to move along a
  // diagonal line, upward and toward the left away, from the center.
        x_coordinate2 = x_coordinate2- 1 ; // The -- operator subtracts 1 from x_Coordinate
        y_coordinate2 = x_coordinate2 ;
        x-- ;
    }
   
    // The below method is called every time the timer object creates an
    // event. The method is a "listener". It listens for events and when
    // they occur,takes appropriate actions.
    public void actionPerformed ( ActionEvent e ) {
             repaint ( ) ; // Reruns the paint method.
    }
}