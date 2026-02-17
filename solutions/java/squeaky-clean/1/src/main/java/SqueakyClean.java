class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean to_upper = false;
        for(int i=0;i<identifier.length();i++){
            if(to_upper){
                sb.append(Character.toUpperCase(identifier.charAt(i)));
                to_upper = false;
            }
            else if(Character.isDigit(identifier.charAt(i))){
                switch(identifier.charAt(i)){
                    case '4':sb.append('a'); break;
                    case '3':sb.append('e'); break;
                    case '0':sb.append('o'); break;
                    case '1':sb.append('l'); break;
                    case '7':sb.append('t'); break;
                }
            }
            else if(Character.isWhitespace(identifier.charAt(i))){
                sb.append('_');
            }
            else if(identifier.charAt(i)=='-'){
                to_upper = true;
            }
            else if(Character.isLetter(identifier.charAt(i))){
                sb.append(identifier.charAt(i));
            }
        }
        return sb.toString();

        
    }
}

