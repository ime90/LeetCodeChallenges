import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Buckets {

    public static void main(String[] args) {

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        int nb = 8;

        int mdl = nb/30;

        if(map.containsKey(mdl)){
            ArrayList<Integer> list = map.get(mdl);
            list.add(nb);
            map.put(mdl, list);
        }else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(nb);
            map.put(mdl, list);
        }

    }
}
