
import java.util.Scanner;
public class MyList //What role should binary search play in a truly object-oriented program?
{
  private int array[], n;
  public MyList(int a[]) {
	  n = a.length;
	  array = new int[n];
	  //Copy from a into array
  }
  public void binSearch()
  {
    first  = 0;
    last   = n - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
  }
}
