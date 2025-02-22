public class IfElse {
    public static void main(String[] args) {
        int x = 12;
        int y = 5;
        int z = 7;
        int time = 8 ;
        if (x > y && x > z) {
            System.out.println("X is greater than Y and Z");
            if (time < 12 && time > 5) {
                System.out.println("Good Morning");
            } else if (time > 12 && time < 17) {
                System.out.println("Good Afternoon");

            }


            else {
                System.out.println("Good Night");
            }

            int time1 = 20;
            String result = (time1 < 18) ? "Good day." : "Good evening.";
            System.out.println(result);
        }
    }
}





/*
if (condition) {
   block of code to be executed if the condition is true
}

if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}


For shorhanded If else
        variable = (condition) ? expressionTrue :  expressionFalse;
 */