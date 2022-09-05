package happynewyear;

public class nine {
    public static void main(String[] args){
        int i = 1;
        int j = 2;
       	while(i<=9){
            while(j<=9){
                System.out.printf(j + "x" + i + "=" + (i*j) + "\t");
                j++;
            }
        System.out.println();
        i++;
		j = 2;
        }
//         for(i=1; i<=9; i++) {
// 			for(j=2; j<=9; j++) {
// 				System.out.print(j + "x" + i + "=" + (i*j) + "\t");	
// 			}
// 			System.out.println("");
// 			j = 1;
// 		}
    }
}
