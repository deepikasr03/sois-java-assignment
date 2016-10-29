
import javax.swing.*;
import java.io.*;

public class Quiz2
{
       //Initializaions and Instantiations
       static LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));

//-------------------------------------------------------------------------------

       public static void main(String[] args)
       {
              int score = 0;
              final int NumberofQuestions = 3;
    
   	      System.out.println("\n\n\n\n\n\n\n\t\tQuiz competition\n\n");
    
              //Store questions and answers in 2 dimensional array
              String[][] QandA = {
                                  {"Which is the cleanest city in karnataka?","Mysore"},
                                  {"ENtamology is a study of?","Insects"},
                                  {"study of architecture ?","philology"} };
                                  
             String[] Answers = new String[NumberofQuestions];
 
            //loop through each string in the array and compare it to answers
            for(int x = 0; x < NumberofQuestions; x++)
            {
                 System.out.print("\t\t" + (x+1) + ". " + QandA[x][0] + "   ");
                 
                 try { Answers[x] = cin.readLine(); }
                 catch (IOException e) { System.err.println("Error."); }
      
                 Answers[x].toLowerCase();
                 
                 if(QandA[x][1].equals(Answers[x]))
                 {
                      score++;
                 }//close if 

                 System.out.print("\n");

            }//close outer loop                                 
    
            System.out.println("\n\t\tYou got " + score + " of "
                               + NumberofQuestions + " right!\n\n\n"); 

            System.exit(0);
            
       }//close main() function  
       
//-------------------------------------------------------------------------------

}//close Quiz class
