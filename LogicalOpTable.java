// a truth table for the logical operators
public class LogicalOpTable {

  public static void main(String[] args){
    boolean p, q;

    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT P\tNOT Q");

    p = q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));

    p = true; q = false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));

    p = false; q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));

    p = q = false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));
  }  
}