import java.util.*;
public class Task5{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter radius of cylinder = " );
 
 int rad =sc.nextDouble();
 System.out.println("enter Height  of cylinder= " );
 
 int h =sc.nextDouble();
 
 double pi= ((22*1.0)/7);
   double res=(pi*rad*rad*1.0*h);
 System.out.println("Area of cylinder is  = "  + (res));
}

}