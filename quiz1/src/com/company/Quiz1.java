package com.company;

import java.util.Scanner;

/**
 * Created by gauri.singh on 1/16/2020.
 */
public class Quiz1 {
    int score=0;
    int fail=0;
    int numberofques = 0;
    String arr1[][] = new String[25][2];


    public void addques(String ques,String answer) {
        int i = numberofques;

        if (i < 26) {
            arr1[i][0] = ques;
            arr1[i][1] = answer;
            numberofques += 1;
        }
        else {
            System.out.println("Question bank limit exceeded....You cannot add more questions to it.");
        }
    }
    public void startquiz() {

        System.out.println("Quiz is started.....\n");

        if (numberofques<10) {

            System.out.println("Not sufficient questions available in question bank");
        }

//





            for (int i=0; i<10 && i<= numberofques; i++) {

                try {

                    if (fail < 4) {
                        System.out.println(arr1[i][0]);
                        System.out.println("Enter your answer:");
                        Scanner input = new Scanner(System.in);


                        int choice = input.nextInt();
                        int correctchoice = Integer.parseInt(arr1[i][1]);

                        if (choice == correctchoice) {
                            System.out.println("\nCorrect Answer\n");
                            score += 1;
                        }
                        else if (choice>4){
                            System.out.println("Enter correct choice..i.e between 1 to 4");
                            i-=1;
                        }


                        else {
                            System.out.println("Wrong Answer\n");

                            System.out.println("Correct Answer is: choice " + correctchoice + "\n");
                            fail += 1;
                        }
                    } else {
                        System.out.println("\nYou got 4 wrong answers....you are failed.\n Better luck next time.");
                        break;
                    }
                }

                catch (Exception e){
                    System.out.println("Enter valid input");
                    i -=1;
                }
            }
            System.out.println("\nYour score is "+ score);
    }





}






