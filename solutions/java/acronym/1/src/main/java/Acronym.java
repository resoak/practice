class Acronym {

    private String phrase;
    Acronym(String phrase) {
        phrase = phrase.replace('-',' ');
        phrase = phrase.replaceAll("[^a-zA-Z0-9\\s]","");
        phrase = phrase.replaceAll("\\s+", " ");
        this.phrase = phrase;
    }

    String get() {
        StringBuilder sb = new StringBuilder();
        for(String i:phrase.split(" ")){
            sb.append(i.toUpperCase().charAt(0));
        }
        return sb.toString();
    }

}
