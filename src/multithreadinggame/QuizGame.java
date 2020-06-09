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
    int score1 = 0;
    int score2 = 0;
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
                qtn = "In which movie would you\n" + "hear the song 'Hakuna Matata'?";
                a = "Lion King";
                b = "Hercules";
                c = "Beauty and The Beast";
                d = "Mulan";
                break;
            case 1:
                qtn = "Which type of scientist\n" + "studies and forecasts the\n" + "weather?";
                a = "Astronomer";
                b = "Meteorologist";
                c = "Astrologist";
                d = "Biologist";
                break;
            case 2:
                qtn = "What color would you get\n"+"if you mixed red and\n"+"yellow together?";
                a = "Gray";
                b = "Pink";
                c = "Deeper Shade of Yellow";
                d = "Orange";
                break;
            case 3:
                qtn = "What is the name of\n"+"the dog in Garfield?";
                a = "Odie";
                b = "Oliver";
                c = "Tyson";
                d = "Fred";
                break;
            case 4:
                qtn = "Which one of these characters\n"+"is not friends with\n"+"Harry Potter?";
                a = "Ron Weasley";
                b = "Neville Longbottom";
                c = "Draco Malfoy";
                d = "Hermione Granger";
                break;
            case 5:
                qtn = "What is the color of\n"+"Donald Duck’s bowtie?";
                a = "Yellow";
                b = "Blue";
                c = "White";
                d = "Red";
                break;    
            case 6:
                qtn = "The Powerpuff Girls are\n"+"3 distinct colors.\n"+"What are they?";
                a = "Red, yellow, green";
                b = "Yellow, blue, green";
                c = "Green, purple, orange";
                d = "Blue, green, red";
                break;    
            case 7:
                qtn = "Which boyband sings the\n"+"song “I Want It That Way”?";
                a = "One Direction";
                b = "Backstreet Boys";
                c = "NSYNC";
                d = "New Kids On The Block";
                break;    
            case 8:
                qtn = "What is the longest\n"+"river in the world?";
                a = "Amazon";
                b = "Nile";
                c = "Congo";
                d = "Hudson";
                break;    
            case 9:
                qtn = "According to Phineas and Ferb,\n"+"there are __ days of\n"+"summer vacation?";
                a = "90";
                b = "103";
                c = "104";
                d = "110";
                break;  
            default:
                break;
        } 
        
    }
    
    public void checkAnswer(int i, int ply, String ans){
        
        
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
