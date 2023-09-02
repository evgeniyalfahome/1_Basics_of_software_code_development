import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for (int j=1; j<=n; j++){
            sum += j;
        }
        System.out.println(sum);
    }    
}
