package happynewyear;

public class Triangle_for {
    public static void main(String[] args){
        for(int i = 1; i<=5; i++){
            for(int j=1; j<=5-i; j++)
                System.out.printf(" ");
            for(int k=0; k<=i-1; k++)
                System.out.printf("* ");
                System.out.println();
        }
    }
}
