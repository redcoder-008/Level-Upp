import java.util.LinkedList;
import java.util.HashMap;
import java.util.Queue;
class Info{
    Node node;
    int hd;
    public Info(Node node,int hd){
        this.node = node;
        this.hd= hd;
    }
}
public class TopViewOfTre {
    public static void topView(Node root){
        //level order
        Queue<Info> q= new LinkedList<>();
        HashMap<Integer,Node> map= new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if()
        }

       
        
    }
    

}
