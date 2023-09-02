public class Task2 {
    public static void main(String[] args){

        double result = solution(4, 5, 6);
        System.out.println(result);
    }
    public static double solution(double a, double b, double c){
        double res = (b + Math.sqrt(b*b + 4*a*c))/(2*a) - c * Math.pow(a, 3) + Math.pow(b, -2);
        return res;
    }
}
