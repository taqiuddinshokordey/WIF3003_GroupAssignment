/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadinggame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComponent;

/**
 *
 * @author User
 */
public class Graph extends JComponent {
    
    float r,g,b;
    Random ran = new Random();
    Color color;
    ArrayList<GraphLine> lines = new ArrayList<GraphLine>();
    //, int tNum, double x1, double y1, double x2, double y2
    public Graph (int width, int height) {
        super();
        setPreferredSize(new Dimension(width,height));
//        DrawLine(tNum, x1, y1, x2, y2);
        
    }
    
    public void DrawLine(String tNum, double x1, double y1, double x2, double y2) {
        String str = tNum;
        Line2D.Double lineDouble = new Line2D.Double(
            x1,
            y1,
            x2,
            y2
            );
        
        r=ran.nextFloat();
        g=ran.nextFloat();
        b=ran.nextFloat();
        
        color = new Color (r, g, b);
        color.brighter();
        GraphLine line = new GraphLine(lineDouble, color);
        this.lines.add(line);
        repaint();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graph = (Graphics2D) g.create();
        graph.setColor(Color.white);
        graph.fillRect(0, 0, getWidth(), getHeight());
        Dimension d = getPreferredSize();
        for (GraphLine line : lines) {
            graph.setColor(line.color);
            graph.draw(line.line);
        }
    }
    
}

class GraphLine {
    Line2D.Double line;
    Color color;

    public GraphLine(Line2D.Double line, Color color) {
        this.line = line;
        this.color = color;
    }
}
