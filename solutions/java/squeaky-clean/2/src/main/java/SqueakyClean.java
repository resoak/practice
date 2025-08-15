class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean to_upper = false;
        for(int i=0;i<identifier.length();i++){
            char c = identifier.charAt(i);
            if(to_upper){
                sb.append(Character.toUpperCase(c));
                to_upper = false;
            }
            else if(Character.isDigit(c)){
                switch(c){
                    case '4':sb.append('a'); break;
                    case '3':sb.append('e'); break;
                    case '0':sb.append('o'); break;
                    case '1':sb.append('l'); break;
                    case '7':sb.append('t'); break;
                }
            }
            else if(Character.isWhitespace(c)){
                sb.append('_');
            }
            else if(c=='-'){
                to_upper = true;
            }
            else if(Character.isLetter(c)){
                sb.append(c);
            }
        }
        return sb.toString();

        
    }
}

