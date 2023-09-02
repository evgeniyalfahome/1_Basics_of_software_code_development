public class Task1 {
    public static void main(String[] args){
        
        double result = solution(1, 2, 3); 
        System.out.println(result);
    }
    static double solution(double a, double b, double c){
        double z = ((a-3) * b / 2) + c;
        return z;
    }
}