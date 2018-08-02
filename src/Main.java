public class Main {
    public static void main(String[] args) {
        MinMaxCalculator calculator= new MinMaxCalculator();
        calculator.minCalculator(4,9);
        calculator.maxCalculator(84,4515);

        IsAgeChecker isAgeChecker = new IsAgeChecker();
        System.out.println(isAgeChecker.isAge(25));
        System.out.println(isAgeChecker.isAge(0));
        System.out.println(isAgeChecker.isAge(120));
        System.out.println(isAgeChecker.isAge(121));






    }



}
