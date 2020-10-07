class Main {
  public static void main(String[] args) {

    int num = 15;
    int grade = 75;
    String letter = "F";

    // < less, > greater, <= less or equal, >= greater or equal, == equal, != not
    // equal
    if (num <= 10)
      System.out.println("Your number is less than 10");
    System.out.println("This will always run");

    // single if/else
    if (num <= 10)
      System.out.println("Your number is less than 10");

    else
      System.out.println("Your number is greater than 10");

    // blocked if/else
    if (num <= 15) {
      System.out.println("Your number is less than 15");
      System.out.println("Your number is: " + num);
    } else {
      System.out.println("Your number is greater than 15");
      System.out.println("Your number is: " + num);
    }

    // Nested if
    if (num <= 20) {
      System.out.println("Your number is less than 20");
      if (num == 5) {
        System.out.println("Your number is 5");
      }
    } else {
      System.out.println("Your number is greater than 20");
    }

    if (grade >= 90)
      letter = "A";
    if (grade >= 80)
      letter = "B";
    if (grade >= 70)
      letter = "C";
    if (grade >= 60)
      letter = "D";
    else
      letter = "F";

    System.out.println("Your grade is an " + letter);

    //else if
    if (grade >= 90)
      letter = "A";
    else if (grade >= 80)
      letter = "B";
    else if (grade >= 70)
      letter = "C";
    else if (grade >= 60)
      letter = "D";
    else
      letter = "F";

    System.out.println("Your grade is an " + letter);

  }
}