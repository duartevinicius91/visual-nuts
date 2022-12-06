package visual.nuts;

//Write or describe an algorithm that prints the whole integer numbers to the console, start
//    from the number 1, and print all numbers going up to the number 100.
//    However, when the number is divisible by 3, do not print the number, but print the word
//    'Visual'. If the number is divisible by 5, do not print the number, but print 'Nuts'. And for all
//    numbers divisible by both (eg: the number 15) the same, but print 'Visual Nuts'.
//    How will you keep this code safe from bugs? Show how you would guarantee that this code
//    keeps working when developers start ma
public class Exercise1 {

  public void printNumbers(int max) {
    for (int i = 1; i <= max; i++) {
      String text = String.valueOf(i);

      if (isMultiple(i, 3)) {
        text = "Visual";
      } else if (isMultiple(i, 5)) {
        text = "Nuts";
      } else if (isMultiple(i, 15)) {
        text = "Visual Nuts";
      }

      System.out.println(text);
    }
  }

  private boolean isMultiple(int i, int divisor) {
    return i % divisor == 0;
  }

}
