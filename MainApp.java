package basic.dev;
import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Nhap so nguyen a: ");
  int a = sc.nextInt();
  System.out.print("Nhap so nguyen b: ");
  int b = sc.nextInt();
  
  int tong = a+b;
  System.out.println("Tong cua 2 so vua nhap: " + tong);
  int hieu = a-b;
  System.out.println("Hieu cua 2 so vua nhap: " + hieu);
  int tich = a*b;
  System.out.println("Tich cua 2 so vua nhap:" + tich);
  int thuong = a/b;
  System.out.println("Thuong cua 2 so vua nhap: " + thuong);
  
  
  boolean c = a > b;
  System.out.println(a + ">" + b + c);
  c = a < b ;
  System.out.println(a + "<" + b + c);
  c = a >= b ;
  System.out.println(a + ">=" + b + c);
  c = a <= b ;
  System.out.println(a + "<=" + b + c);
  
  
  
  
  
  
 
  
  
	}

}
