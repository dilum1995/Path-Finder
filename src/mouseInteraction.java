
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author dilumdesilva
 */
public class mouseInteraction implements Runnable {
    
    private boolean pressedOnce = false;
    private int N;
    public mouseInteraction(int N){
        this.N = N;
    }
    
    @Override
    public void run() {
        while (true) {
            if (StdDraw.mousePressed()) {
                if (!pressedOnce) {
                    pathFinder.mouseClicked((StdDraw.mouseX()), (N - StdDraw.mouseY()));
                    pressedOnce = true;
                }
            } else {
                pressedOnce = false;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(mouseInteraction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
