import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {
    static Set<String> newCollection(List<String> cards) {
        Set<String> str = new HashSet<>();
        for(String card:cards){
            str.add(card);
        }
        return str;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean cantrade = false;
        if(myCollection.isEmpty()||theirCollection.isEmpty()){
            return cantrade;
        }
        for(String i:myCollection){
            if(cantrade){
                break;
            }
            for(String j:theirCollection){
                if(!myCollection.contains(j)&&!theirCollection.contains(i)){
                    cantrade=true;
                    break;
                }
            }
        }
        return cantrade;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> sets = new HashSet<>();
        for(Set<String> set:collections){
            sets.addAll(set);
        }
        for(Set<String> set:collections){
            sets.retainAll(set);
        }
        return sets;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> sets = new HashSet<>();
        for(Set<String> set:collections){
            sets.addAll(set);
        }
        return sets;
    }
}
