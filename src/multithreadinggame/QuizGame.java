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
    
    public String question(int i){
        String qtn = "";
        
        switch (i){
            case 0:
                qtn = "test quiz";
                break;
            case 1:
                qtn = "test quiz";
                break;
            case 2:
                qtn = "test quiz";
                break;
            case 3:
                qtn = "test quiz";
                break;
            case 4:
                qtn = "test quiz";
                break;
            case 5:
                qtn = "test quiz";
                break;    
            case 6:
                qtn = "test quiz";
                break;    
            case 7:
                qtn = "test quiz";
                break;    
            case 8:
                qtn = "test quiz";
                break;    
            case 9:
                qtn = "test quiz";
                break;    
        } 
        
        return qtn;
    }
    
    public void checkAnswer(int i, String ans, int ply){
        
        
        switch (i){
            case 0:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
                    score2++;
                    }
                }
                break;
            case 1:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
                    score2++;
                    }
                }
                break;
            case 2:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
                    score2++;
                    }
                }
                break;
            case 3:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
                    score2++;
                    }
                }
                break;
            case 4:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
                    score2++;
                    }
                }
                break;
            case 5:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
                    score2++;
                    }
                }
                break;    
            case 6:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
                    score2++;
                    }
                }
                break;    
            case 7:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
                    score2++;
                    }
                }
                break;    
            case 8:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
                    score2++;
                    }
                }
                break;    
            case 9:
                if(ply == 1){
                    if (ans == "test quiz"){
                    score1++;
                    }
                }
                if(ply == 2){
                    if (ans == "test quiz"){
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
