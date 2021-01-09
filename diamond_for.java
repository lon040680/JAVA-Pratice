package happynewyear;

public class diamond_for {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++)
                System.out.print(" ");
            for(int k=0; k<=i-1; k++)
                System.out.print("* ");
                System.out.println();
        }
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++)
                System.out.print(" ");
            for(int k=3; k>=i-1; k--)
                System.out.print("* ");
                System.out.println();
        }
    }
}
