hpackage com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;
        int fail = 0;

        System.out.println("Welcome, The Quiz is started.... ");

        while (true) {


                if (fail < 4) {


                    System.out.println("1. How many letters are in the word java?\n 1. 3\n 2. 4\n 3. 5\n 4. 6");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                            break;
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                        }

                } else{
                    System.out.println("You got 4 wrong answers...you are failed.");
                    break;
                }

                if (fail < 4) {

                    System.out.println("2. Is Java object oriented?\n 1. Yes\t 2. No");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                    }
                } else {
                    System.out.println("You got 4 wrong answers...you are failed.");

                    break;
                }

                if (fail < 4) {

                    System.out.println("3. Is Java object oriented?\n 1. Yes\t 2. No");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                    }
                } else {
                    System.out.println("You got 4 wrong answers...you are failed.");

                    break;
                }

                if (fail < 4) {

                    System.out.println("4. How many letters are in the word java?\n 1. 3\t 2. 4\t 3. 5\t 4. 6");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                    }
                } else {
                    System.out.println("You got 4 wrong answers...you are failed.");

                    break;
                }

                if (fail < 4) {

                    System.out.println("5. How many letters are in the word java?\n 1. 3\t 2. 4\t 3. 5\t 4. 6");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                    }
                } else {
                    System.out.println("You got 4 wrong answers...you are failed.");

                    break;
                }

                if (fail < 4) {

                    System.out.println("6. How many letters are in the word java?\n 1. 3\t 2. 4\t 3. 5\t 4. 6");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                    }
                } else {
                    System.out.println("You got 4 wrong answers...you are failed.");

                    break;
                }

                if (fail < 4) {

                    System.out.println("7. How many letters are in the word java?\n 1. 3\t 2. 4\t 3. 5\t 4. 6");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                    }
                } else {
                    System.out.println("You got 4 wrong answers...you are failed.");

                    break;
                }

                if (fail < 4) {

                    System.out.println("8. How many letters are in the word java?\n 1. 3\t 2. 4\t 3. 5\t 4. 6");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                    }
                } else {
                    System.out.println("You got 4 wrong answers...you are failed.");
                    break;
                }

                if (fail < 4) {

                    System.out.println("9. How many letters are in the word java?\n 1. 3\t 2. 4\t 3. 5\t 4. 6");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                    }
                } else {
                    System.out.println("You got 4 wrong answers...you are failed.");
                    break;
                }

                if (fail < 4) {

                    System.out.println("10. How many letters are in the word java?\n 1. 3\t 2. 4\t 3. 5\t 4. 6");
                    int ch = input.nextInt();

                    while (true) {

                        if (ch == 2) {
                            System.out.println("Correct answer");
                            score += 1;
                            break;

                        }   else if (ch>4) {

                            System.out.println("Enter valid choice");
                        }
                        else {
                            System.out.println("Wrong answer");
                            fail += 1;
                            break;
                        }
                    }
                } else {
                    System.out.println("\n\nYou got 4 wrong answers...you are failed.");
                    break;
                }
            }
            System.out.println("\nThe quiz is ended....\n\n Your socre is: " + score);


            // write your code here

        }
    }
