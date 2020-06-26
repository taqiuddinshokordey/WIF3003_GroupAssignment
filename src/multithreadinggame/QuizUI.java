/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadinggame;


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.swing.KeyStroke;
import javax.swing.JComponent;

/**
 *
 * @author User
 */
//Holds the game's main UI and core function
public class QuizUI extends javax.swing.JFrame implements KeyListener{

    /**
     * Creates new form QuizUI
     */
    
    
    QuizGame game;
    String qtn; //variable for question
    String str1; //variable for correct or wrong text
    String str2; //variable for correct or wrong text
    String a; //variable for the answer
    String b; //variable for the answer
    String c; //variable for the answer
    String d; //variable for the answer
    int num1 = 0; //variable for question number
    int num2 = 0; //variable for question number
    int time; //variable for timer(second)
    String score1 = "0"; //variable for score
    String score2 = "0"; //variable for score
    ExecutorService service;
    timerTasks timer2 = new timerTasks(this, 2);
    timerTasks timer1 = new timerTasks(this, 1);
    Tasks scoreUpdate = new Tasks(game);
    Thread t = new Thread(scoreUpdate);
    Future<?> future1;
    Future<?> future2;
    
    public QuizUI(int num, int t) {
        if (game == null){
            game = new QuizGame();
        }
        service = Executors.newFixedThreadPool(num);
        time = t;
        initComponents();
        questions1(0);
        questions2(0);
        
        
//        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pressA(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Def");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("def");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("def");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("def");

        jLabel6.setText("def");

        jLabel5.setText("def");

        jLabel4.setText("def");

        jLabel3.setText("def");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player 2");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player 1");

        jProgressBar2.setForeground(new java.awt.Color(255, 0, 0));

        jProgressBar1.setForeground(new java.awt.Color(255, 0, 0));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Some trivia questions");
        jScrollPane2.setViewportView(jTextArea2);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Score:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Score:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("0 Pts");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("0 Pts");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Q1");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Q1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel7)))
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(129, 129, 129))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(148, 148, 148))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane1))
                            .addComponent(jLabel19))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel18))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.addKeyListener(this);
        jPanel2.setFocusable(true);
        jPanel2.requestFocusInWindow();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void pressA(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pressA
        
    }//GEN-LAST:event_pressA

    //ends the game and proceed to result screen
    public void endGame(){
        future1.cancel(rootPaneCheckingEnabled);
        future2.cancel(rootPaneCheckingEnabled);
        //shutsdown executorService
        service.shutdownNow();
        this.dispose();
        new VictoryScreen(game).setVisible(true);
    }
    
    //The countdown timer for the quiz
    public void timer (int ply){
        
       jProgressBar1.setMinimum(0);
       jProgressBar1.setMaximum(time);
       jProgressBar2.setMinimum(0);
       jProgressBar2.setMaximum(time);
       int x = time;
       int t = time;
       
       if (num1 > 9){
            endGame();
            return;
       }
       if (num2 > 9){
            endGame();
            return;
       }
       
       //Timer countdown for player 1
       if (ply == 1){
           jProgressBar1.setValue(0);
        for(; x >=0; x--){
            //stops the loop and exit method when canncelled
            if (future1.isCancelled()){
                       return;
            }
            jProgressBar1.setValue(x);
            try {
                System.out.println("ply 1: " + x);
                sleep(1000);
                    
                } catch (Exception e) {
            }
        }
        //exit method when canncelled
        if (future1.isCancelled()){
            return;
        }
        
        //load next question when time runs out
            num1++;
            jLabel15.setForeground(Color.red);
            jLabel15.setText("Time's up!");
            questions1(num1);
       }
       
       //Timer countdown for player 2
       else if (ply == 2){
           jProgressBar2.setValue(0);
        for(; t >=0; t--){
            //stops the loop and exit method when canncelled
            if (future2.isCancelled()){
                       return;
            }
            jProgressBar2.setValue(t);
            try {
                System.out.println("ply 2: " + t);
                sleep(1000);
            } catch (Exception e) {
            }
        }
        //exit method when canncelled
        if (future2.isCancelled()){
            return;
        }
        
        //load next question when time runs out
        num2++;
        jLabel16.setForeground(Color.red);
        jLabel16.setText("Time's up!");
        questions2(num2);
       }
       
    }
    
    //To load questions for player 1
    public void questions1(int i){
        game.getQuestion(i);
        
        qtn = game.qtn.toString();
        a = game.a.toString();
        b = game.b.toString();
        c = game.c.toString();
        d = game.d.toString();
        
        String num = Integer.toString(i+1);
        jTextArea1.setText(qtn);
        jLabel18.setText("Q" + num);
        jLabel3.setText("A. " + a);
        jLabel4.setText("B. " + b);
        jLabel5.setText("C. " + c);
        jLabel6.setText("D. " + d);
        
        //starts threading for timer
         future1 = service.submit(timer1);

           
            
    }
    
    //To load questions for player 2
    public void questions2(int i){
        game.getQuestion(i);
        
        qtn = game.qtn.toString();
        a = game.a.toString();
        b = game.b.toString();
        c = game.c.toString();
        d = game.d.toString();
        
        String num = Integer.toString(i+1);
        jTextArea2.setText(qtn);
        jLabel19.setText("Q" + num);
        jLabel7.setText("A. " + a);
        jLabel8.setText("B. " + b);
        jLabel9.setText("C. " + c);
        jLabel10.setText("D. " + d);
        
        //starts threading for timer
        future2 = service.submit(timer2);

    }
    
    //To check the answer
    public void checkAnswer(int i, int ply, String ans){
        
        game.checkAnswer(i, ply, ans);
        score1 = String.valueOf(game.score1);
        score2 = String.valueOf(game.score2);
        str1 = game.str1.toString();
        str2 = game.str2.toString();
        
        //Check answer for player 1
        if(ply == 1){
            //cancels the thread for timer
            future1.cancel(Boolean.TRUE);
            if (future1.isCancelled()){
                System.out.println("cancelled");
            }
            
            if (str1 == "Correct!"){
            jLabel15.setForeground(Color.GREEN);
            jLabel15.setText(str1);
            jLabel13.setText(score1 + " pts");
            }
            else {
               jLabel15.setForeground(Color.RED);
               jLabel15.setText(str1); 
            }
        }
        
        //Check answer for player 2
        if (ply == 2){
            //cancels the thread for timer
            future2.cancel(Boolean.TRUE);
            if (str2 == "Correct!"){
            jLabel16.setForeground(Color.GREEN);
            jLabel16.setText(str2);
            jLabel14.setText(score2 + " pts");
            }
            else {
               jLabel16.setForeground(Color.RED);
               jLabel16.setText(str2); 
            }
        }

    }
    
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
            java.util.logging.Logger.getLogger(QuizUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizUI(10,10).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JProgressBar jProgressBar1;
    public javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

    
    
    @Override
    public void keyTyped(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    //The button for the game
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        //button for player 1
        if (keyCode == KeyEvent.VK_W){
            
            System.out.println("ply 1 Choose: A");
            checkAnswer(num1, 1, "A");
            num1++;
            questions1(num1);
        }
        if (keyCode == KeyEvent.VK_A){
            System.out.println("ply 1 Choose: B");
            checkAnswer(num1, 1, "B");
            num1++;
            questions1(num1);
        }
        if (keyCode == KeyEvent.VK_S){
            System.out.println("ply 1 Choose: C");
            checkAnswer(num1, 1, "C");
            num1++;
            questions1(num1);
        }
        if (keyCode == KeyEvent.VK_D){
            System.out.println("ply 1 Choose: D");
            checkAnswer(num1, 1, "D");
            num1++;
            questions1(num1);
        }
        
        //button for player 2
        if (keyCode == KeyEvent.VK_UP){
            System.out.println("ply 2 Choose: A");
            checkAnswer(num2, 2, "A");
            num2++;
            questions2(num2);
        }
        if (keyCode == KeyEvent.VK_LEFT){
            System.out.println("ply 2 Choose: B");
            checkAnswer(num2, 2, "B");
            num2++;
            questions2(num2);
        }
        if (keyCode == KeyEvent.VK_DOWN){
            System.out.println("ply 2 Choose: C");
            checkAnswer(num2, 2, "C");
            num2++;
            questions2(num2);
        }
        if (keyCode == KeyEvent.VK_RIGHT){
            System.out.println("ply 2 Choose: D");
            checkAnswer(num2, 2, "D");
            num2++;
            questions2(num2);
        }
        
        if (num1 > 9){
            endGame();
        }
        if (num2 > 9){
            endGame();
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    

}
