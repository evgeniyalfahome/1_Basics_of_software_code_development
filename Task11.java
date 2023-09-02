public class Task11 {
    public static void main(String[] args){
        //double result = solution();
    }
    static double solution(double x){
        if (x>=3){
            return x*x -3*x + 9;
        }
        return 1/(Math.pow(x, 3) + 6);
    }
}
