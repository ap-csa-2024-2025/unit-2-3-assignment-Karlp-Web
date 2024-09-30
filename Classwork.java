public class Classwork
{
 public static void main(String[] args)
 {
  System.out.println(firstLastN("dictionary", 1));
 }

  public static String firstLastN(String word, int n)
 {
//getting the first n letter
   String output = new String();//first n letters substring from 0 to n=2
//getting the last n letters
   String firstN = word.substring(0,n); //

   int indexOfNToLast = word.length() - n;//
   String lastN = word.substring(indexOfNToLast); //Last n letters, starting at nth to last letter

   output = firstN + lastN;

   return output;

   
 }
}