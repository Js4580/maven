public class MyMath {
    public static double divide(int number_1, int number_2){
        if (number_2 == 0)
            throw new ArithmeticException("на нуль делить нельзя не в какое случае");
        return number_1 / number_2;
    }
}
