class ReverseString {

    String reverse(String inputString) {
        String str="";
        for(int i=inputString.length()-1;i>=0;i--){
            str+=inputString.charAt(i);
        }
        return str;
    }
  
}
