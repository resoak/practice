import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DialingCodes {
    public Map<Integer,String> map = new HashMap<>();
    public Map<Integer, String> getCodes() {
        return this.map;
    }
    public void setDialingCode(Integer code, String country) {
        map.put(code,country);
    }
    public String getCountry(Integer code) {
        return map.get(code);
    }
    public void addNewDialingCode(Integer code, String country) {
        if(!(map.containsKey(code)||map.containsValue(country))){
            map.put(code,country);
        }
    }

    public Integer findDialingCode(String country) {
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = null;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(country)) {
                oldCode = entry.getKey();
                break;
            }
        }
        if (oldCode == null) {
            return;
        }
        map.remove(oldCode);
        map.put(code, country);
        }
}
