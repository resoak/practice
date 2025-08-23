class Darts {
    int score(double xOfDart, double yOfDart) {
        int score=0;
        int radius=10;
        double dx = xOfDart;
        double dy = yOfDart;
        if(dx*dx+dy*dy<=radius*radius){
            score=1;
            radius=5;
            if(dx*dx+dy*dy<=radius*radius){
                score=5;
                radius=1;
                if(dx*dx+dy*dy<=radius*radius){
                    score=10;
                }
            }
        }
        return score;
    }
}
