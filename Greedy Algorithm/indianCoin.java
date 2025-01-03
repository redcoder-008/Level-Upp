import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indianCoin {
    public static void main(String[] args) {
        Integer coin[]={2000,500,100,50,20,10,5,2,1};
        Arrays.sort(coin, Comparator.reverseOrder());
        int amount = 1080;
        int money=0;
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=0;i<coin.length;i++){
            if(coin[i] <= amount){
                while(coin[i] <= amount){
                    amount -= coin[i];
                    ans.add(coin[i]);
                
                    money++;
                }
            }
        }
        System.out.println("YOu need to give " + money+ " Coins ");
      for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i) +" ");

      }
    }
}
