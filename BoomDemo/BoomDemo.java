import java.awt.* ;
import javax.swing.* ;
import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;
import javax.swing.Timer ;
public class BoomDemo extends JFrame implements ActionListener {
    int dotHeight = 10,
    dotWidth = 10,
    x = 255,
    x_coordinate1 ,
    y_coordinate1 ,
    x_coordinate2 ,
    y_coordinate2 ,
    x_coordinate3 , 
    y_coordinate3 , 
    x_coordinate4 , 
    y_coordinate4 , 
    x_coordinate5 ,
    y_coordinate5 , 
    x_coordinate6 ,
    y_coordinate6 ,
    x_coordinate7 ,
    y_coordinate7 ,
    x_coordinate8 ,
    y_coordinate8 ;
    private Timer timer = new Timer ( 1 , this ) ;

    private void initObjects()
    {
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
        x_coordinate6 = 250 ;
        y_coordinate6 = 250 ;
        x_coordinate7 = 250 ;
        y_coordinate7 = 250 ;
        x_coordinate8 = 250 ;
        y_coordinate8 = 250 ;
    }

    BoomDemo ( ) {
        setSize ( 500, 500 ) ;
        timer.start ( ) ;
    }

    public static void main ( ) {
        BoomDemo boom = new BoomDemo ( ) ;
        boom.initObjects();
        boom.setVisible ( true ) ;
        boom.setBackground( new Color ( 255, 255, 255 ) ) ;
    }

    public void paint ( Graphics g ) {
        if ( x_coordinate1 == 500) {
            initObjects();
            x = 255 ;
        }
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
        g.fillRect(x_coordinate6, y_coordinate6, dotHeight, dotWidth);

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
        x_coordinate1 = x_coordinate1 + 1 ; 
        y_coordinate1 = x_coordinate1 ; 

        g.setColor (new Color ( 0, 0, 255 ) ) ;
        g.fillRect ( x_coordinate2, y_coordinate2, dotHeight, dotWidth );
        x_coordinate2 = x_coordinate2- 1 ; 
        y_coordinate2 = x_coordinate2 ;
        x-- ;
    }

    public void actionPerformed ( ActionEvent e ) {
        repaint ( ) ; 
    }
}