class ReverseString {

    String reverse(String inputString) {
        String str = "";
        for(int i=inputString.length();i<0;i++){
            str+=inputString.charAt(i);
        }
        return str;
        
    }
  
}
