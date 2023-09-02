public class Task14 {
    public static void main(String[] args){
        //digits from 0 to 9 first num is 10! BUT we start since 1
        int sum = 0;
        for (int i=1; i<=100; i++){
            sum += i*i;
        }
        System.out.println(sum);
    }
}
