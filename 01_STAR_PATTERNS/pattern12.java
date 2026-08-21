import java.util.*;
/*

*
**
***
****
*****
****
***
**
*

*/
class pattern12{
    public static void main(String args[]){
        int n=5;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
               System.out.print("*");
            }
            System.out.println();
        }
          n=4;
            for(j=1;j<=n;j++){
                for(i=1;i<=n-j+1;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}