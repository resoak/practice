public class PangramChecker {

    public boolean isPangram(String input) {
        boolean[] seen = new boolean[26];
        String str = input.toLowerCase();
        for(char c:str.toCharArray()){
            if(c>='a'&&'z'>=c){
                seen[c-'a']=true;
            }
        }
        for(boolean b:seen){
            if(!b){
                return false;
            }
        }
        return true;
    }

}
