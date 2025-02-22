public class JavaMath {
    public static void main(String[] args) {

        System.out.println("Max : "+Math.max(5, 10));  // Find the max
        System.out.println("Min : "+Math.min(5, 10));  // Find the min
        System.out.println("Return positive number  : "+Math.abs(-12));  //Negative number will be printed as positive number
        System.out.println("Squire root  : "+Math.sqrt(16));  // to find the squire root of a number
        System.out.println("Value of PI  : "+Math.PI);   //To print the value of PI

        System.out.println("random number : " +Math.random());  //To print a random number between 0 and 1

        int randomNum = (int)(Math.random() * 101);  // 0 to 100 to fix the range of a random number
        System.out.println(randomNum);
    }
}
