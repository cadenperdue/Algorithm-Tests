import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class makeRandomWikiFile {
  public static void main(String[] args) {
    String[] titles = new String[13342493];

    Scanner in = new Scanner(System.in);
    int count = 0;

    in.nextLine(); // get rid of the header

    // populate the array
    while (in.hasNext()) {
      String line = in.nextLine();
      titles[count] = line;
      count++;
    }

    shuffleArray(titles); //shuffle...

    for (int i = 0; i < titles.length; i++)
    {
      System.out.println(titles[i]);
    }
  }

  // method mplementing Fisher–Yates shuffle
 static void shuffleArray(String[] ar)
 {
   Random rnd = ThreadLocalRandom.current();
   for (int i = ar.length - 1; i > 0; i--)
   {
     int index = rnd.nextInt(i + 1);
     // Simple swap
     String a = ar[index];
     ar[index] = ar[i];
     ar[i] = a;
   }
 }
}
