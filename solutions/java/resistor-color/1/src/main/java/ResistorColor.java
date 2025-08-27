class ResistorColor {

    int colorCode(String color) {
        for(int i=0;i<this.colors().length;i++){
            if(this.colors()[i].equals(color)){
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
        String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colors;
    }
}
