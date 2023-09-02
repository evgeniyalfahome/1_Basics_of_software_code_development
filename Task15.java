import java.math.BigDecimal;

public class Task15 {
    public static void main(String[] args){
        //double p = 1;
        var p = new BigDecimal(1);
        for(int i=1;i<=200;i++){
            var j = new BigDecimal(i*i);
            p = p.multiply(j);
        }
        System.out.println(p);
    }
}