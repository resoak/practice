class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake){
            return false;
        }
        else{
            return true;
        }
        
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake || archerIsAwake || prisonerIsAwake){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean status=false;
        if(prisonerIsAwake){
            if(!archerIsAwake){
                status=true;
            }
            else{
                status=false;
            }
        }
        return status;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean status=false;
        if(petDogIsPresent){
            if(!archerIsAwake){
                status=true;
            }
        }
        else{
            if(prisonerIsAwake&&!knightIsAwake&&!archerIsAwake){
                status=true;
            }
        }
        return status;
    }
}
