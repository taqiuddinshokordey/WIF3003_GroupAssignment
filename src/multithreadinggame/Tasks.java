/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadinggame;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author User
 */
public class Tasks implements Runnable {
    ThreadGame ref;
    boolean end;
    int failCntr;
    int successCntr;
    String tName;
    int tNum;
    double runtime;
    boolean Success;
    boolean Fail;
    boolean finish;
    ReentrantLock lock = new ReentrantLock();

      
    public Tasks(ThreadGame r){
        ref = r;
    }
    
    @Override
    public void run(){
        synchronized(ref){
            String t = Thread.currentThread().getName();
            String s[] = t.split("-");
            tName = "Thread " + s[3];
            tNum = Integer.parseInt(s[3]);
            System.out.println("-----\nStarting : " + tName);
            try{
                //while the attempts have not more than 20 and game is not finish and time limit has passed
                while(failCntr < 20 && !timeLimit()&& !finish){
                    pairingEdges();
                    if (Success){
                        successCntr++;
                    }
                    else if (Fail){
                        failCntr++;
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    public void pairingEdges(){
        try{
            Success = false;
            Fail = false;
            finish = false;
            
            //lock other threads
            lock.lock();
            
            //number of possible edges
            int i = ref.coordinates.size() / 2;
            
            //taking coordinate
            if(ref.Edges.size() < i ){
                Coordinate one = ref.coordinates.get(new Random().nextInt(ref.coordinates.size()));
                Coordinate two = ref.coordinates.get(new Random().nextInt(ref.coordinates.size()));

                //check for duplicate coordinates
                while(one.equals(two)){
                    two = ref.coordinates.get(new Random().nextInt(ref.coordinates.size()));
                }

                String edgeName = "Edge " + ref.edgeNum;
                String str = Thread.currentThread().getName();
                String tnum[] = str.split("-");
                String tname = "Thread " + tnum[3];
                //creating edge
                Edge temp = new Edge(one, two, edgeName, tname);
                
                
                if(!ref.Edges.contains(temp)){
                    System.out.println("Edge being created by " + tname + " between " + one.getString() + " and " + two.getString());
                    ref.Edges.add(temp);
                    ref.edgeNum++;
                    Success = true;
                }
                else if (ref.Edges.contains(temp)){
                    System.out.println(tname + " fail to pair edge between : " + one.getString() + " and " + two.getString());
                    Fail = true; 
                }
                
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        //unlock other threads
        finally{
            lock.unlock();
        }
        finish = true;
    }
    
    private boolean timeLimit(){
        long now = System.nanoTime();
        //calculate amount of time has pass since game starts
        double test = (now - ref.Time) / 1_000_000_000;
        
        //check if running time has passed the time limit
        if(test >= ref.m){
            return true;
        }
        return false;
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
