package heaps;
import java.util.*;
public class connectingNropes {
    public static void main(String[] args) {
        int arr[] ={2,3,3,4,6};
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            p.add(arr[i]);
        }
        int cost=0;
        while(p.size()>1){
            int min1=p.remove();
            int min2=p.remove();
            cost+=min1+min2;
            p.add(min1+min2);
        }
        System.out.println("the minimum cost of connecting N ropes is: "+cost);
    }

}
