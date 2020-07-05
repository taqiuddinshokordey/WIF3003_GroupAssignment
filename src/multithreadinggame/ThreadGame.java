/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadinggame;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JFrame;

/**
 *
 * @author User
 */



public class ThreadGame extends javax.swing.JFrame {

    int n;
    int t;
    int m;
    int edgeNum = 1;
    long Time;
    Random random = new Random();
    ExecutorService executor;
    ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
    ArrayList<Edge> Edges = new ArrayList<Edge>();
    ArrayList<Tasks> tasks = new ArrayList<Tasks>();
    
    
    public ThreadGame(int n, int t, int m) {
        this.n=n;
        this.t=t;
        this.m=m;
        this.executor = Executors.newFixedThreadPool(t);
        initComponents();
        
        startGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jButton1.setText("Show Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 533, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Create the UI to display the Graph line
        JFrame gui = new JFrame();
        gui.setTitle("Edge Graph Result");
        gui.setSize(1050,1050);
        
        //Drawing line for each edges
        Graph graph = new Graph(1000, 1000);
        for (Edge edge:Edges){
            graph.DrawLine(edge.tName, edge.one.x, edge.one.y, edge.two.x, edge.two.y);
        }
        
        Container pane = gui.getContentPane();
        pane.setLayout(new GridLayout(1,1));
        
        pane.add(graph);
        gui.setVisible(true);
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThreadGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreadGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreadGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreadGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreadGame(5,2,50).setVisible(true);
            }
        });
    }

    public void startGame(){
        // create coordinate
        createCoordinate();
        // display coordinate output
        displayCoordinate();
        
        //set the starting time of the thread
        this.Time = System.nanoTime();
        //execute all the threads
        for (int i=0;i<t;i++){
            tasks.add(new Tasks(this));
            executor.submit(tasks.get(i));
        }
        executor.shutdown();
        //to wait untill all edges is finished pairing
        while(!executor.isTerminated()){
            
        }
        
        //display edges result
        displayEdges();
        
        
        
    }
    
    //method for generating coordinates
    public void createCoordinate(){
        double max = 1000;
        double min = 1;
        double x = 0;
        double y = 0;
        for (int i=0;i<n;i++){
            x = Math.round((random.nextDouble()*1000)*100.0)/100.0;
            y = Math.round((random.nextDouble()*1000)*100.0)/100.0;
            Coordinate temp = new Coordinate(x, y);
            
            //check for duplicate
            if (i>1){
                while(coordinates.contains(temp)){
                    x = Math.round((random.nextDouble()*1000)*100.0)/100.0;
                    y = Math.round((random.nextDouble()*1000)*100.0)/100.0;
                    temp = new Coordinate(x, y);
                }
            }
            coordinates.add(temp);
        }
    }
    
    //method for displaying the output for coordinates
    public void displayCoordinate(){
        jLabel1.setText("<html> <b>Coordinates</b>:" + "<br/> <br/>");
        int i = 1;
        for (Coordinate coordinate:coordinates) {
            jLabel1.setText(jLabel1.getText() + "Coordinate " + i + ": X = " + coordinate.getX() + " and Y = " + coordinate.getY() + "<br/>");
            i++;
        }
        jLabel1.setText(jLabel1.getText() + "</html>");
    }
    
    
    //method for displaying the output for coordinates
    public void displayEdges(){
        jLabel2.setText("<html> <b>Edges</b>:" + "<br/><br/>");
        for (Edge edge:Edges){
            jLabel2.setText(jLabel2.getText() + edge.tName + " created: " + edge.edgeName + " of Coordinate " + edge.getOne().getString() + " and " + edge.getTwo().getString() + "<br/>");
        }
        jLabel2.setText(jLabel2.getText() + "</html>");
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
