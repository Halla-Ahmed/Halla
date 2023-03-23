
     abstract class Geom {
        private String color;
        private boolean filled;
       public Geom() {}
        public Geom(String color,boolean filled){
            this.color=color;
            this.filled=filled;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color=color;
        }
        public boolean IsFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled=filled;
        }
        public abstract double getArea();
        public abstract double getPerimeter();
    }

