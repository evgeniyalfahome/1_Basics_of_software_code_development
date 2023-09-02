public class Task8 {
    public static void main(String[] args){
        double result = solution(1,2,3,4);
        System.out.println(result);
    }
    static double solution(double a,double b,double c,double d){
        double min1;
        double min2;
        double max;
        if (a<=b){
            min1 = a;
        }else{
            min1 = b;
        }
        if (c<=d){
            min2 = c;
        }else{
            min2 = d;
        }
        if (min1>=min2){
            max = min1;
        }else{
            max = min2;
        }
        return max;
    }
}
