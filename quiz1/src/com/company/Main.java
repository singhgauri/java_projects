package com.company;

public class Main {

    public static void main(String[] args) {
	    Quiz1 q = new Quiz1();

        q.addques("1. How many words are there in word java\n 1) 3\n 2) 2\n 3) 4\n 4) 5\n","3" );
        q.addques("2. A process that involves recognizing and focusing on the important characteristics of a situation or object is known as:\n 1) Abstraction\n 2) polymorphism\n 3) Encapsulation\n 4) Inheritance\n","1" );
        q.addques("3. The wrapping up of data and functions into a single unit is called\n 1) Polymorphism\n 2) Encapsulation\n 3) Inheritance\n 4) None of these\n","2" );
        q.addques("4. A package is a collection of\n 1) Classes\n 2) Interfaces\n 3) Both\n 4) None\n","3" );
        q.addques("5. Which of the following is a member of the java.lang package?\n 1) Stack\n 2) Queue\n 3) List\n 4) Math\n","2" );
        q.addques("6. What is the fundamental unit of information of writer streams?\n 1) Character\n 2) Bytes\n 3) Record\n 4) none\n","1" );
        q.addques("7. What will be the result of the expression 13 & 25?\n 1) 8\n 2) 45\n 3) 6\n 4) 9\n","4" );
        q.addques("8. To prevent any method from overriding, we declare the method as\n 1) static\n 2) final\n 3) abstract\n 4) none\n","2" );
        q.addques("9. The fields in an interface are implicitly specified as\n 1) static only\n 2) final\n 3) both\n 4) none\n","3" );
        q.addques("10. In java, objects are passed as\n 1) Default constructor\n 2) copy of that object\n 3) costructor\n 4) memory address\n","4" );
        q.addques("11. Java compiler javac translates Java source code into \n 1) Bit code\n 2) Byte code\n 3) Machine code\n 4) Assembly language\n","2" );

        q.startquiz();

    }
}
