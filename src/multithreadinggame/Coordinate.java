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
public class Coordinate {
    
    public double x;
    public double y;
    
    Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public String getString(){
        String str = "(" + x + ", " + y + ")";
        return  str;
    }
    
}
