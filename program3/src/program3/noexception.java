public class NoExceptions {
    public static void main(String[] args) {
    int num = 0;
    //num = 10/5;//No Exception
    num = 10/0;//Will cause exception.
    System.out.println("Answer is: " + num);//Will not reach here, if exception thrown
    }
}
