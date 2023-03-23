public class Main {
    public static void main(String[] args) {

            GroceryList g=new GroceryList();
            GroceryItemOrder I=new GroceryItemOrder("zabado",10.2);
            I.setQuantity(5);
            System.out.println(I.getcost());
            g.add(I);
            GroceryItemOrder I2=new GroceryItemOrder("toast",9.7);
            I2.setQuantity(3);
            System.out.println(I2.getcost());
            g.add(I2);
            System.out.println("TotalCost="+g.getTotalCost());

        }
    }
