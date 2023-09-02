public class Task3 {
    public static void main(String[] args){
        double result = solution(1, 2);
        System.out.println(result);
    }
    static double solution(double x, double y){
        double res = ((Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y))) * Math.tan(x*y);
        return res;
    }
}
