import java.util.*;

public class VotingSys {
    
    
    public static void main(String[] args) {
        
        //object
        Scanner sc = new Scanner(System.in);

        //adding accounted number of votes
        int aap = 0 ;
        int inc  = 0;
        int npp = 0 ;
        int bjp = 0 ;
        
        //starting loop
        while(true){
            System.out.println("Enter your name");
            String Name = sc.next();
            System.out.println("Enter your age");
            int age = sc.nextInt();
            
            
            //checking if he/she is eligible to vote 
            if (age<18){
                System.out.println("Sorry , You are not eligible for voting yet");
                

            }

            else{
                System.out.println("Enter your 4 digit voter ID");
                int voterId = sc.nextInt();
                System.out.println("welcome to Online Voting Center");
                
                //providing options of parties
                System.out.println("1. AAP (AAM AADMI PARTY) ");
                System.out.println("2. BJP (BHARTIYA JANTA PARTY) ");
                System.out.println("3. INC (INDIAN NATIONAL CONGRESS)");
                System.out.println("4. NPP (NATIONAL PEOPLE'S PARTY) ");


                // asking the user to choose one
                System.out.println("Enter the number of your respected choice : ");
                int operation = sc.nextInt();

                

                //presenting cases
                switch (operation){
                    case 1:{
                        aap = aap + 1;
                        break;
                    }
                    
                    case 2:{
                        bjp = bjp + 1 ;
                        break;
                    }
                    
                    case 3: {
                        inc = inc + 1;
                        break;
                    }
                    
                    case 4: {
                        npp = npp + 1 ;
                        break;
                    }
                    default :
                        System.out.println("INVALID CHOICE !!");
                }

                // asking if more people want to vote
                System.out.println("Do more people want to vote ? Press y if yes , n if no .");
                String ch = sc.next();
                String yes = "y" ;
                String no = "n";
                if(ch.equals(no)){
                    break;
                }
                }
                
            }
            // printing the number of votes 
            System.out.println("Number of votes for AAP are : " + aap);
            System.out.println("Number of votes for BJP are : " + bjp);
            System.out.println("Number of votes for INC are : " + inc);
            System.out.println("Number of votes for NPP are : " + npp);
            
            
            // creating an array of number of votes 
            int voter[] = {aap,bjp,inc,npp};
            String votername[] = {"AAP", "BJP" , "INC" , "NPP"};
            int max= voter[0];
            int min = voter [0];

            
            //checking who has the highest votes
            for (int i = 0; i < voter.length; i++){
                if (voter[i]>max){
                    max=voter[i];
                }
                if (voter[i]<min){
                    min=voter[i];    
                }
            }

            // printing the winner
            for (int i = 0; i < voter.length; i++){
                if(voter[i]==max){
                    System.out.println("The winner is " + votername[i] + " with " + max + " votes");

                }
            }
        }
    }  
             

