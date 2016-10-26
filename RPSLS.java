import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.geom.*;

public class RPSLS extends Frame{
  private Label lblchoice;
  private Button btnRPSLS;
  private Button x;
  private Button y;
  private TextArea txt;
  private CheckboxGroup cbChoice;
    /*
  private  Checkbox rock;
  private  Checkbox paper;
  private  Checkbox scissors;
  private  Checkbox lizard;
  private  Checkbox spock;
  */
  private TextArea cscore;
  private TextArea pscore;
  private Label lblcscoreLabel;
  private Label lblpscoreLabel;
  private int ccscore = 0;
  private int ppscore = 0;
  private Dialog d1;
  
  public RPSLS(){
    setLayout(new FlowLayout());
    
    cbChoice = new CheckboxGroup();
    
    Checkbox rock = new Checkbox("Rock", cbChoice, true);
    Checkbox paper = new Checkbox("Paper", cbChoice, true);
    Checkbox scissors = new Checkbox("Scissors", cbChoice, true);
    Checkbox lizard = new Checkbox("Lizard", cbChoice, true);
    Checkbox spock = new Checkbox("Spock", cbChoice, true);
    lblchoice = new Label("Your Choice:");
    btnRPSLS = new Button("RockPaperScissorsLizardSpock!");
    txt = new TextArea("Result:", 5, 40);
    txt.setEditable(false);
    cscore = new TextArea("0",1,10);
    cscore.setEditable(false);
    pscore = new TextArea("0",1,10);
    pscore.setEditable(false);
    lblcscoreLabel = new Label("Computer's Score:");
    lblpscoreLabel = new Label("Player's Score:");
    d1 = new Dialog(this);
    d1.add(x = new Button("OK"));
    d1.add(y = new Button("EXIT"));
    
    btnRPSLS.addActionListener(new ActionListener(){
      
      public void actionPerformed(ActionEvent e){
        Random rand = new Random();
        int compChoice = rand.nextInt((5 - 1) + 1) + 1;
        
        
        if(compChoice == 1){
          if(rock.getState()){
            printTextField("\nPlayer chose rock");
           printTextField("\nComputer chose rock");
            printTextField("\n\nDraw");
          }
          if(scissors.getState()){
            printTextField("\nPlayer chose scissors");
           printTextField("\nComputer chose rock");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
          if(paper.getState()){
            printTextField("\nPlayer chose paper");
           printTextField("\nComputer chose rock");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          if(lizard.getState()){
            printTextField("\nPlayer chose lizard");
           printTextField("\nComputer chose rock");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
          if(spock.getState()){
            printTextField("\nPlayer chose spock");
           printTextField("\nComputer chose rock");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          
        }
        else if(compChoice == 2){
          if(paper.getState()){
            printTextField("\nPlayer chose paper");
           printTextField("\nComputer chose paper");
            printTextField("\n\nDraw");
          }
          if(scissors.getState()){
            printTextField("\nPlayer chose scissors");
           printTextField("\nComputer chose paper");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          if(rock.getState()){
            printTextField("\nPlayer chose rock");
           printTextField("\nComputer chose paper");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
          if(lizard.getState()){
            printTextField("\nPlayer chose lizard");
           printTextField("\nComputer chose paper");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          if(spock.getState()){
            printTextField("\nPlayer chose spock");
           printTextField("\nComputer chose paper");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
          
          
        }
        else if(compChoice == 3){
          if(scissors.getState()){
            printTextField("\nPlayer chose scissors");
           printTextField("\nComputer chose scissors");
            printTextField("\n\nDraw");
          }
          if(rock.getState()){
            printTextField("\nPlayer chose rock");
           printTextField("\nComputer chose scissors");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          if(paper.getState()){
            printTextField("\nPlayer chose paper");
           printTextField("\nComputer chose scissors");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
          if(lizard.getState()){
            printTextField("\nPlayer chose lizard");
           printTextField("\nComputer chose scissors");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
          if(spock.getState()){
            printTextField("\nPlayer chose spock");
           printTextField("\nComputer chose scissors");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          
          
        }
        else if(compChoice == 4){
          if(lizard.getState()){
            printTextField("\nPlayer chose lizard");
           printTextField("\nComputer chose lizard");
            printTextField("\n\nDraw");
          }
          if(scissors.getState()){
            printTextField("\nPlayer chose scissors");
           printTextField("\nComputer chose lizard");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          if(paper.getState()){
            printTextField("\nPlayer chose paper");
           printTextField("\nComputer chose lizard");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
          if(rock.getState()){
            printTextField("\nPlayer chose rock");
           printTextField("\nComputer chose lizard");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          if(spock.getState()){
            printTextField("\nPlayer chose spock");
           printTextField("\nComputer chose lizard");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
          
          
        }
        else if(compChoice == 5){
          if(spock.getState()){
            printTextField("\nPlayer chose spock");
           printTextField("\nComputer chose spock");
            printTextField("\n\nDraw");
          }
          if(scissors.getState()){
            printTextField("\nPlayer chose scissors");
           printTextField("\nComputer chose spock");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
          if(paper.getState()){
            printTextField("\nPlayer chose paper");
           printTextField("\nComputer chose spock");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          if(lizard.getState()){
           printTextField("\nPlayer chose lizard");
           printTextField("\nComputer chose spock");
           printTextField("\n\nPlayer won this round");
             ppscore++;
             String x = "" + ppscore;
             replaceTextField(pscore, x );
          }
          if(rock.getState()){
           printTextField("\nPlayer chose rock");
           printTextField("\nComputer chose spock");
           printTextField("\n\nComputer won this round");
             ccscore++;
             String x = "" + ccscore;
             replaceTextField(cscore, x );
          }
  
          
        }
                if(ppscore == 5){
      //System.out.println("g");
      
      d1.setLayout(new FlowLayout());
      //d1.setLocationRelativeTo(this);
      d1.setTitle("Player won!");
      d1.setSize(300,150);
      //d1.add(x = new Button("OK"));
      x.addActionListener(new ActionListener(){
      
      public void actionPerformed(ActionEvent e){
         ppscore = 0;
        ccscore = 0;
        String x = "" + ccscore;
        replaceTextField(cscore, x );
        x = "" + ccscore;
        replaceTextField(pscore, x );
        replaceTextField(txt, "Result:");
        d1.setVisible(false);
      }
      });
      
      y.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
         System.exit(ABORT); 
        }
        
      });
      d1.setVisible(true);
    }
    else if(ccscore == 5){

      d1.setLayout(new FlowLayout());
      //d1.setLocationRelativeTo(this);
      d1.setTitle("Computer won!");
      d1.setSize(300,150);
      x.addActionListener(new ActionListener(){
      
      public void actionPerformed(ActionEvent e){
        
        ppscore = 0;
        ccscore = 0;
        String x = "" + ccscore;
        replaceTextField(cscore, x );
        x = "" + ccscore;
        replaceTextField(pscore, x );
        replaceTextField(txt, "Result:"); 
        d1.setVisible(false);
      }
      });
      
      y.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
         System.exit(ABORT); 
        }
        
      });
      d1.setVisible(true);
    }
        
      }
      
    });
    
    add(lblchoice);
    add(rock);
    add(paper);
    add(scissors);
    add(lizard);
    add(spock);
    add(txt);
    add(btnRPSLS);
    add(lblpscoreLabel);
    add(pscore);
    add(lblcscoreLabel);
    add(cscore);
    
    
    
    
   
    
    setTitle("RockPaperScissorsLizardSpock");
    setSize(500,300);
    setVisible(true);
  }
  
  public void printTextField(String text) {
    txt.append(text);
}
  
  public void replaceTextField(TextArea txt, String text) {
    txt.setText(text);
}
  
  public static void main(String[] args){
    
    
   new RPSLS(); 
    
    
  }
  
  
  
  
  
}