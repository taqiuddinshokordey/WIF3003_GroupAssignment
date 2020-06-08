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
    
    public Tasks(QuizGame r){
        ref = r;
    }
    
    @Override
    public void run(){
        
        System.out.println("");
    }
}
