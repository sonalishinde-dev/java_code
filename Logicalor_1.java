package first;

public class Logicalor_1 {

	public static void main(String[] args) {

		int a =20, b=30;
        
        System.out.println(a<=b && b>=a || ++a <= --b ); // false
        System.out.println( (a<=b-- || ++b<=a)); // true
        

} 
}