public class Task5 {
    public static void main(String[] args){
        int t=83540;
        int hh = (int)Math.floor(t/3600);
        int mm = (int)Math.floor((t-hh*3600)/60);
        int ss = (int)(t-hh*3600-mm*60);
        System.out.println(hh);
        System.out.println(mm);
        System.out.println(ss);
    }
        
}
