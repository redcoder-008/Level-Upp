import java.util.Arrays;
import java.util.Collections;

public class chocolaProblem {
    public static void main(String[] args) {
        Integer costVertical []= {2,1,3,1,4};
        Integer costHorizontal[]= {4,1,2};
        Arrays.sort(costHorizontal,Collections.reverseOrder());
        Arrays.sort(costVertical, Collections.reverseOrder());
        int vp=1,hp=1;
        int v=0,h=0; int cost=0;
        while(v< costVertical.length && h<costHorizontal.length){
            if(costHorizontal[h] <= costVertical[v]){ //vertical cut
                cost += (costVertical[v]* hp);
                vp++;
                v++;
            }
            else{
                //horizontal cut
                cost+= (costHorizontal[h] * vp);
                hp++;
                h++;
            }


        }
        //remaining cuts 
       while(v< costVertical.length){
            cost+=( costVertical[v]);
            vp++;
            v++;
        }
        while (h< costHorizontal.length){
            cost += (costHorizontal[h] * vp);
            h++;
            hp++;
        }
        System.out.println("THe minimum cost is : " + cost);
    }
}
