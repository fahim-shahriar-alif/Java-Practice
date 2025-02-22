public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 5;
        float myFloat = myInt;
        double myDouble = myFloat;      //This is called Widening Casting

        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);

        double myDouble2 = 9.78d;    //This is called narrow casting
        int myInt2 = (int) myDouble2;// Manual casting: double to int

        byte myByte = (byte) myInt2;

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
        System.out.println(myByte);

        int x = 5;
        int y = 3;
        System.out.println(x > y);  // This is Java Comparison Operator


        String txt = "My name is Fahim but I am called \"Shahriar\"Alif";  // If we want to add ' or " or \ in a String we have to add another \ before it
        String txt2 = "My roommate is Asif Intesar ";

        System.out.println(txt.indexOf("Alif"));  //To find the index of a word
        System.out.println("Upper case :  "+txt.toUpperCase());  //To make all characters upper case
        System.out.println("Lower case :  "+txt.toLowerCase());  //To make all characters lower case
        System.out.println("Number of digits :  "+txt.length()); //To find the total length of a String

        System.out.println("Character at position : " + txt.charAt(0));  // To find the character at a position
        System.out.println(txt.concat(txt2));  // concat is used to add 2 variables
        System.out.println(txt2.concat(txt));  // Concat must be used to add strings only

        String myString = txt + y ;
        System.out.println(myString);
    }
}


/*
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
   */