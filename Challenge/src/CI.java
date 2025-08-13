public class CI {
    public static void main(String[] args) {
        Double P = 3200.00;
        Double R = 11.3;
        Double T = 6.5;

        Double CI = P*(1+R/100.0)*T;
        System.out.println("CI : " +CI);
    }
}
