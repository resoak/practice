class ResistorColorDuo {
    int value(String[] colors) {
        String value = "";
        for(int i=0;i<2;i++){
            switch(colors[i]){
                case "black": value+="0"; break;
                case "brown": value+="1"; break;
                case "red": value+="2"; break;
                case "orange": value+="3"; break;
                case "yellow": value+="4"; break;
                case "green": value+="5"; break;
                case "blue": value+="6"; break;
                case "violet": value+="7"; break;
                case "grey": value+="8"; break;
                case "white": value+="9"; break;
            }
        }
        return Integer.parseInt(value);
    }
}
