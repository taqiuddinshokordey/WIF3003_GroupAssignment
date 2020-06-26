/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadinggame;

import static java.lang.Thread.sleep;
import java.util.concurrent.Callable;

/**
 *
 * @author User
 */
public class Tasks implements Runnable {
    QuizGame ref;
//    int ply;
//    boolean end;
      
    public Tasks(QuizGame r){
        ref = r;
//        ply = i;
//        end = b;
    }
    
    @Override
    public void run(){
        ref.checkScore();
    }
}

class timerTasks implements Runnable {
    
    QuizUI ref;
    int ply;
    public timerTasks(QuizUI r, int i){
        ref = r;
        ply = i;
    }
    
    @Override
    public void run(){
        
            ref.timer(ply);
    }
}
