import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;

/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class BallDemo   
{
    private Canvas myCanvas;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
    }

    /**
     * Simulate two bouncing balls
     */
    public void bounce(int numBalls)
    {
        int ground = 400;   // position of the ground line
        ArrayList<BouncingBall> arrayBolas = new ArrayList<>();
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(101);
        myCanvas.setVisible(true);
       
        
        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground);

        // crate and show the balls
        for(int i=0; i < numBalls; i++)
        {
            BouncingBall ball = new BouncingBall(aleatorio.nextInt(100),aleatorio.nextInt(150),aleatorio.nextInt(200),Color.RED, ground, myCanvas);
            arrayBolas.add(ball);
           arrayBolas.get(i).draw();
        }
       
        boolean finished =  false;
         while(!finished) {
           myCanvas.wait(50);           
        for(int i=0; i<arrayBolas.size();i++)
        {
            arrayBolas.get(i).move();
           if(arrayBolas.get(i).getXPosition() >= 550)
           {
               finished = true;
            }
            } 
        }

    }
    
}
   
        
       
        


