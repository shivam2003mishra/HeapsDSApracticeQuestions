package heaps;
import java.util.*;
public class weakestSoldiers {
    static class Row implements Comparable<Row>{
        int soldiers, idx;
        
        Row(int soldiers, int idx){
            this.soldiers=soldiers;
            this.idx=idx;
        }

        @Override
        public int compareTo(Row p2) {
            if(this.soldiers==p2.soldiers){
                return this.idx - p2.idx;
            }
            else{
                return this.soldiers - p2.soldiers;
            }
        }
    }
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};    

        PriorityQueue<Row> p= new PriorityQueue<>();

        for(int i=0;i<army.length;i++){
            int count=0;
            for(int j=0;j<army[0].length;j++){
                count+= army[i][j]==1 ? 1 : 0;
            }
            p.add(new Row(count,i));
        }

        int k=2;
        for(int i=0;i<k;i++){
            System.out.println("R"+p.remove().idx);
        }
    }
}
