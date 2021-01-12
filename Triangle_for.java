package happynewyear;

public class Triangle_for {

    public static void main(String[] args){
        // 奇數三角形
        int a = 0;
        int b = 0;
        int c = 0;
        for(a=1;a<=5;){
            for(b=1; b<=5-a; b++)
                System.out.print("  ");
            for(c=1; c<=2*a-1;c++)
                System.out.print("* ");
                a++;
                System.out.println();
        }
        
        //偶數三角形
        System.out.print("-------*");
        for(a=1;a<=5;){
            for(b=1; b<=5-a; b++)
                System.out.print("--");
            for(c=1; c<=2*a-2;c++)
                System.out.print("*-");
                a++;
                System.out.println();
        }
        
        System.out.println();
        
        // 奇數菱形
        for(a=1;a<=5;){
            for(b=1; b<=5-a; b++)
                System.out.print(" ");
            for(c=1; c<=2*a-1;c++)
                System.out.print("*");
                a++;
                System.out.println();
        }
        for(a=1;a<=4;){
            for(b=1; b<=a; b++)
                System.out.print(" ");
            for(c=7; c>=2*a-1;c--)
                System.out.print("*");
                a++;
                System.out.println();
        }
        
        System.out.println();
        
        // 偶數菱形
        System.out.print("-------*");
        for(a=1;a<=5;){
            for(b=1; b<=5-a; b++)
                System.out.print("  ");
            for(c=1; c<=2*a-2;c++)
                System.out.print("* ");
                a++;
                System.out.println();
        }
        for(a=1;a<=3;){
            for(b=1; b<=a; b++)
                System.out.print("  ");
            for(c=5; c>=2*a-2;c--)
                System.out.print("* ");
                System.out.println();
                a++;
        }
        System.out.print("-------*");
    }
}
