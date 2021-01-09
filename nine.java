package happynewyear;

public class nine {
    public static void main(String[] args){
        int i = 2;
        int j = 1;
        while(i<=9){
            while(j<=9){
                System.out.printf(i + " X " + j + " =" + (i*j) + "   ");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
    }
}
