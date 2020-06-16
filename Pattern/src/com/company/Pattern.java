package com.company;

/**
 * Created by gauri.singh on 3/3/2020.
 */
public class Pattern {

    int i;

    public void pyramid(int n){

        for (i=0; i<n; i++) {

            for (int j=(n-(i+1)); j>0;j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void rightTriangle(int n){

        for (i=0;i<n;i++){

            for (int j=0;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void leftTriangle(int n){

        for (i=0;i<n;i++){

            for (int j=(n+3-(2*i));j>0;j--) {
                System.out.print(" ");

            }

            for (int k=0;k<=i;k++){
                System.out.print("* ");
                }

            System.out.println();
        }
    }

    public void reversePyramid(int n){

        for (i=0;i<n;i++){

            for (int k=0;k<=i;k++){
                System.out.print(" ");
            }

            for (int j=(n-i);j>0;j--) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }

    public void diamond(int n){

        for (i=0; i<n; i++) {

            for (int j=(n-(i+1)); j>0;j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i=0;i<n-1;i++){

            for (int k=0;k<=i;k++){
                System.out.print(" ");
            }

            for (int j=(n-1-i);j>0;j--) {
                System.out.print("* ");

            }

            System.out.println();
        }


    }

    public void reverseleftTriangle(int n) {

        for (i=0;i<n;i++){
            for (int j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void numberPattern1(int n){

        for (i=1;i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void numberPattern2(int n){

        for (i=1;i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public void numberPattern3(int n){

        for (i=0;i<n;i++){

            for (int j=n;j>=n-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void numberPattern4(int n){
        int num=1;
        for (i=0;i<n;i++){

            for (int j=0;j<=i;j++){
                System.out.print(num+" ");
                num+=1;
            }
            System.out.println();
        }
    }



}



