import java.util.*;  

public class datastructure {


    public static void main(String[] args ) {
        List<Integer> arr = new ArrayList<>();
        Map< String ,Integer> maps = new HashMap<>();
     
        maps.put("one", 1); 
        maps.put("two", 2); 
        
        for(Map.Entry<String , Integer>  entry : maps.entrySet()) {

            System.out.println( "key" + entry.getKey());
            System.out.println( "value" + entry.getValue());

        }

        }
    
}
