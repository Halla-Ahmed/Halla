public class MyInteger {
   private int value;
    public MyInteger(int value){this.value=value;}
    public int getValue(){return value;}
    public boolean isEven(){if(value%2==0) return true;
    else return false;}
    public boolean isOdd(){if(value%2!=0) return true;
    else return false;}
    public boolean isPrime(){
        if(value==1||value==2) {return true;}
    else{
        for(int i=2;i<value;i++){
            if(i%value==0)
                return false;
    }}
    return true;
    }
    public static boolean isEven(int x) {
        return (x % 2) == 0;
    }

    public static boolean isOdd(int x) {
        return (x % 2) == 1;
    }

    public static boolean isPrime(int x) {
        if (x == 1 || x == 2) {
            return true;
        }
        else {
            for (int i = 2; i < x; i++) {
                if (i % x == 0) return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger x) {
        return x.isEven();
    }

    public static boolean isOdd(MyInteger x) {
        return x.isOdd();
    }

    public static boolean isPrime(MyInteger x) {
        return x.isPrime();
    }

    public boolean equals(int test) {
        if (test == value)
            return true;
        return false;
    }

    public boolean equals(MyInteger x) {
        if (x.value == value)
            return true;
        return false;
    }
}
