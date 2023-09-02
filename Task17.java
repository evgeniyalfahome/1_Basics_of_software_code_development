public class Task17 {
    public static void main(String[] args){
        String s = "abcdef";
        
        for(int i=0;i<s.length();i++){
            
            System.out.println(s.substring(i, i+1).hashCode());

        }
    }
}
