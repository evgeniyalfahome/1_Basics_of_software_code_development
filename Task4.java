import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task4 {
    public static void main(String[] args){
        double var1 = 723.406;//406.722
        double var = 987.053;//406.722
        
        double ceil = Math.floor(var);
        double reamin = var - ceil;
        
        double res = reamin*1000 + ceil/1000;
        
        BigDecimal bd = new BigDecimal(res);
        BigDecimal roundOff = bd.setScale(3, RoundingMode.FLOOR);
        System.out.println(roundOff);
    }
}
