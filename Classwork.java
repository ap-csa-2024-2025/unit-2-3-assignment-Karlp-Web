public class Classwork
{
  public static void main(String[] args)
  {
    // test your code here
  }

  // write solutions to problems below

}

Public static String firstLastN(String word, int n)
{
//getting the first n letter
  String output = new String();//first n letters substring from 0 to n=2
//getting the last n letters
  String firstN = word.substring(0,n); //

  int indexOfNToLast = word.length() - n;

  output = firstN + lastN;

  return output;
}
