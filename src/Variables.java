public class Variables {
    public static void main(String[] args) {
        String Name = "Alif";
        int Age = 25;
        int Num = 23;
        char Gender = 'M';
        double Salary = 50000.00;
        boolean Flag = false;
        System.out.println(Name);
        System.out.println("My name is " +Name ); //We can use + to add a variable with another variable
        System.out.println("My age is " +Age +" and I will be 48 years old after "+ Num+" years");
        System.out.println(Gender);
        System.out.println(Salary);
        System.out.println(Flag);
        System.out.println(Name + " is telling something that is " + Flag);

/*All java variables must be identified with unique names
Names should start with a lower case
java is case sensitive
 */

        /* Primitive data types = byte ,short , int , long ,float, boolean , char
        Non primitive data types = String , Array, Classes
         */


        int A ,B , C ;  //One value to multiple variables
        A = B = C  = 233;

        System.out.println(A+B+C);

        int D , E , F ; //Declare Many Variables
        D =  12;
        E =  34;
        F =  56;
        System.out.println(D+E+F);
        byte myNum = 125 ;    //byte range is  -128 to 127
        System.out.println(myNum);

        short myShort = 5000 ;   //short range is -32768 to 32767
        System.out.println(myShort);

        int myInt = 1000 ;  //int range is -2147483648 to 2147483647
        System.out.println(myInt);

        long myLong = 1000000000L ;       //long range is -9223372036854775808 to 9223372036854775807
        System.out.println(myLong);

        float myFloat = 100.00f ;          //We should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
        //The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
        System.out.println(myFloat);

        double myDouble = 100.00d ;    //we have to add f for float and d for double at the end of the number
        System.out.println(myDouble);

        boolean isAlifGood = false ;
        boolean isAsifGood = true ;

        System.out.println(isAlifGood);
        System.out.println(isAsifGood);

        char myGrade = 'B' ;
        System.out.println(myGrade);

        char myGrade2 = 'A' , myGrade3 = 'C' , myGrade4 = 'D' ;
        System.out.println(myGrade2);
        System.out.println(myGrade3);
        System.out.println(myGrade4);

        System.out.println("My name is " +Name + " and I will be " + Age + " years old after "+ Num+" years " + "My gender is "+ Gender + " my grade is " + myGrade2 );
            /*The main differences between primitive and non-primitive data types are:

Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
Primitive types always hold a value, whereas non-primitive types can be null.

             */
    }
}
