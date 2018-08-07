import java.util.HashMap;
import java.util.Map;

public class InteractiveDictionary {
    Map<String, String> map;

    public InteractiveDictionary(){
        map = new HashMap<String, String>();
    }

    public void newEntry(String key, String value){
        map.put(key,value);
    }

    public String look(String key){
        if(map.get(key)== null)
        {
            return "Cant find entry for "+ key;
        }else
            return map.get(key);
    }
}

