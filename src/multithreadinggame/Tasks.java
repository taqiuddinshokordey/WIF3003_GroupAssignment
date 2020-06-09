/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadinggame;

/**
 *
 * @author User
 */
public class Tasks implements Runnable {
    QuizGame ref;
    int ply;
    boolean end;
      
    public Tasks(QuizGame r, int i, boolean b){
        ref = r;
        ply = i;
        end = b;
    }
    
    @Override
    public void run(){
        ref.checkScore(ply, end);
    }
}
