public class loops {
    public static void forloop(String[] args) {
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(i);
        } 

        int i = 0 ; 
        while(i < 100) {
            System.out.println(i);
            i++; 
        }
    }


    public static void main(String[] args) {
        forloop(args);
    }


}
