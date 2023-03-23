import java.util.ArrayList;

    public class GroceryList {
        GroceryItemOrder[]L;
        int S;
        public GroceryList(){L=new GroceryItemOrder[9];
            S=0;}
        public void add(GroceryItemOrder item) {
            L[S]=item;
            S++;

        }
        public double getTotalCost(int i){
            double totalcost=0;
            for( i=0;i<S;i++){
                totalcost+=L[i].getcost();
            }
            return totalcost;
        }
    }

