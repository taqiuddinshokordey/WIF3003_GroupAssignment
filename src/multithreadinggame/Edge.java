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


public class Edge {
    String edgeName;
    String tName;
    Coordinate one;
    Coordinate two;
    
    public Edge(Coordinate one, Coordinate two, String edgeName, String tName){
        this.one=one;
        this.two=two;
        this.edgeName=edgeName;
        this.tName=tName;
    }
    
    public Coordinate getOne() {
        return one;
    }

    public Coordinate getTwo() {
        return two;
    }
    
    public boolean checkDuplicate(Edge e){
        if(this.one == e.one && this.two == e.two){
            return true;
        }
        else if (this.one == e.two && this.two == e.one){
            return true;
        }
        else{
            return false;
        }
    }
    
}
