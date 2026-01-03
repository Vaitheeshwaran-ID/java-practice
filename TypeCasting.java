public class TypeCasting{
  public static void main (String [] args){
int a = 10;
    long b= a;//widening typecasting - convert small data to large datatype
    System.out.println(b);
    
long c = 25;
    int d = (int)c;//narrowing typecasting - convert large datatype to small datatype
    System.out.println(c);
  }
}
