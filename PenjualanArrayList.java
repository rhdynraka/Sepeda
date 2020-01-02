package projecthaidar;
 
import java.util.Scanner;
 
/**
*
* @author Karjono
*/
public class PenjualanArrayList {
 
 
public static void main(String[] args) {
  DataPenjualan obj = new DataPenjualan();
  String k ="Program Penjualan [y/n]:";
  System.out.println("\n");
  System.out.print(k);
 
  Scanner input = new Scanner(System.in);
  String ans= input.next();
 while(ans.equals("y")) {
   obj.getVal();
   obj.display();
   obj.clear();
   System.out.print("Ingin Lanjut "+k);
   ans = input.next();
 
   if(ans.equals("n")){
   System.out.println("program selesai");
   }
  }
 }
}
