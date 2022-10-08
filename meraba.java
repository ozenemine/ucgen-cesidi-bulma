
import java.util.Scanner;
public class meraba{
    public static void main(String args[]) {
Object system;
Scanner tara = new Scanner(System.in);
int x,y,z,ucgen;
System.out.println("x kenarını  giriniz");
 x = tara.nextInt();
 System.out.println("y kenarını giriniz");
 y=tara.nextInt();
 System.out.println("z kenarını giriniz");
 z=tara.nextInt();
 if(x==y && y==z){
  System.out.println("eşkenar ucgendir");
 }else if( x!=y && y!=z &&x!=z){
  System.out.println("çeşitkenar ucgendir");
 }else{
  System.out.println("ikizkenar ucgendir");
 }
} }
 


