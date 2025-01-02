import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activity_Selection{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]= {2,4,6,7,9,9};
        int maxAct=0;
        ArrayList <Integer> ans= new ArrayList<>();
        //sorting  activities by their end times
        int activities[][]=new int [start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]= i;
            activities[i][1]= start[i];
            activities[i][2]= end[i];
        }
        //lamda function for shorting 
        Arrays.sort(activities,Comparator.comparingInt(o -> o[2]));
        
        //1st activity
        maxAct= 1;
        ans.add(activities[0][0]);
        int lastend= activities[0][2];
        for(int i=1;i<start.length;i++){
            if(activities[i][1] >= lastend){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastend= activities[i][2];

            }
        }
        System.out.println("Max activity : " + maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A " + ans.get(i) + " ");
        }
        System.out.println();

    }
}