public class GroceryItemOrder {

        private String name;
        private int quantity;
        private double price;
        public GroceryItemOrder(String name,double pricePerUnit){
            this.name=name;
            price=pricePerUnit;

        }
        public double getcost(){
            return quantity*price;
        }
        public void setQuantity(int quantity){
            this.quantity=quantity;
        }

    }

