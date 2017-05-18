// a truth table for the logical operators using 0's and 1's
public class OAndlLogicalOpTable {

  public static void main(String[] args){
    boolean p, q;
    int i;

    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT P\tNOT Q");

    p = q = true;
    System.out.print((i = p ? 1:0) + "\t" + (i = q ? 1:0) + "\t");
    System.out.print((i = (p&q) ? 1:0)  + "\t" + (i = (p|q) ? 1:0)  + "\t");
    System.out.println((i = (p^q) ? 1:0) + "\t" + (i = (!p) ? 1:0)  + "\t" + (i = (!q)? 1:0));

    p = true; q = false;
    System.out.print((i = p ? 1:0) + "\t" + (i = q ? 1:0) + "\t");
    System.out.print((i = (p&q) ? 1:0)  + "\t" + (i = (p|q) ? 1:0)  + "\t");
    System.out.println((i = (p^q) ? 1:0) + "\t" + (i = (!p) ? 1:0)  + "\t" + (i = (!q)? 1:0));

    p = false; q = true;
    System.out.print((i = p ? 1:0) + "\t" + (i = q ? 1:0) + "\t");
    System.out.print((i = (p&q) ? 1:0)  + "\t" + (i = (p|q) ? 1:0)  + "\t");
    System.out.println((i = (p^q) ? 1:0) + "\t" + (i = (!p) ? 1:0)  + "\t" + (i = (!q)? 1:0));

    p = q = false;
    System.out.print((i = p ? 1:0) + "\t" + (i = q ? 1:0) + "\t");
    System.out.print((i = (p&q) ? 1:0)  + "\t" + (i = (p|q) ? 1:0)  + "\t");
    System.out.println((i = (p^q) ? 1:0) + "\t" + (i = (!p) ? 1:0)  + "\t" + (i = (!q)? 1:0));
  }  
}