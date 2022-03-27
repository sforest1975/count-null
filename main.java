import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Map<String, String>> temp = new ArrayList<Map<String, String>>();
        
        Map<String, String> map = new HashMap<String, String>();
        
        map.put("a", null);
        map.put("b", null);
        map.put("c", "a");
        
        temp.add(map);
        
        Map<String, String> map2 = new HashMap<String, String>();
        
        map2.put("d", null);
        map2.put("e", "c");
        map2.put("f", null);
        
        temp.add(map2);
        
        System.out.println(temp.stream().map(p -> p.entrySet().stream().filter(o -> o.getValue() == null).count()).mapToLong(o -> o).sum());
    }
}
