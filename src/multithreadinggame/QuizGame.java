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
public class QuizGame {
    int score1;
    int score2;
    String qtn;
    String a;
    String b;
    String c;
    String d;
    
    
    public QuizGame(){
        
    }
    
    public void question(int i){
        
        switch (i){
            case 0:
                qtn = "test quiz";
                a = "correct";
                b = "wrong";
                c = "wrong";
                d = "wrong";
                break;
            case 1:
                qtn = "test quiz";
                a = "wrong";
                b = "correct";
                c = "wrong";
                d = "wrong";
                break;
            case 2:
                qtn = "test quiz";
                a = "wrong";
                b = "wrong";
                c = "wrong";
                d = "correct";
                break;
            case 3:
                qtn = "test quiz";
                a = "correct";
                b = "wrong";
                c = "wrong";
                d = "wrong";
                break;
            case 4:
                qtn = "test quiz";
                a = "wrong";
                b = "wrong";
                c = "correct";
                d = "wrong";
                break;
            case 5:
                qtn = "test quiz";
                a = "wrong";
                b = "wrong";
                c = "wrong";
                d = "correct";
                break;    
            case 6:
                qtn = "test quiz";
                a = "wrong";
                b = "wrong";
                c = "wrong";
                d = "correct";
                break;    
            case 7:
                qtn = "test quiz";
                a = "wrong";
                b = "correct";
                c = "wrong";
                d = "wrong";
                break;    
            case 8:
                qtn = "test quiz";
                a = "wrong";
                b = "correct";
                c = "wrong";
                d = "wrong";
                break;    
            case 9:
                qtn = "test quiz";
                a = "wrong";
                b = "wrong";
                c = "correct";
                d = "wrong";
                break;    
        } 
        
    }
    
    public void checkAnswer(int i, String ans, int ply){
        
        
        switch (i){
            case 0:
                if(ply == 1){
                    if (ans == "A"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "A"){
                    score2++;
                    }
                }
                break;
            case 1:
                if(ply == 1){
                    if (ans == "B"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "B"){
                    score2++;
                    }
                }
                break;
            case 2:
                if(ply == 1){
                    if (ans == "D"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "D"){
                    score2++;
                    }
                }
                break;
            case 3:
                if(ply == 1){
                    if (ans == "A"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "A"){
                    score2++;
                    }
                }
                break;
            case 4:
                if(ply == 1){
                    if (ans == "C"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "C"){
                    score2++;
                    }
                }
                break;
            case 5:
                if(ply == 1){
                    if (ans == "D"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "D"){
                    score2++;
                    }
                }
                break;    
            case 6:
                if(ply == 1){
                    if (ans == "D"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "D"){
                    score2++;
                    }
                }
                break;    
            case 7:
                if(ply == 1){
                    if (ans == "B"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "B"){
                    score2++;
                    }
                }
                break;    
            case 8:
                if(ply == 1){
                    if (ans == "B"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "B"){
                    score2++;
                    }
                }
                break;    
            case 9:
                if(ply == 1){
                    if (ans == "C"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "C"){
                    score2++;
                    }
                }
                break;
        }
    }
    
    public void checkScore(int ply, boolean end){
        if (ply == 1){
            if (score1==10){
                System.out.println("Player 1 Wins!");
            }
        }
        if (ply == 2){
            if (score1==10){
                System.out.println("Player 2 Wins!");
            }
        }
        if (end == true){
            if (score1 > score2){
                System.out.println("Player 1 Wins!");
            }
            if (score2 > score1){
                System.out.println("Player 2 Wins!");
            }
        }
    }
}
