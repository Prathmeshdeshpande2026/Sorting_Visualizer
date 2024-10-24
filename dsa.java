//Check if no is even or odd.
//No odd users lsb=1.
//No even user lsb=0.
public class dsa{

    public static void oddoreven(int n){
        int bitmask=1;

        if((n&bitmask)==0){//even
            System.out.println("Even Number");
        }

        else{
            System.out.println("Odd Number");
        }

    }
    public static void main(String args[]){
        int n=3;

        oddoreven(n);

    }
}
