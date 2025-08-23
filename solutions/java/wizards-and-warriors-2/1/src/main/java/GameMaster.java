public class GameMaster {

    public String describe(Character character){
        return String.format("You're a level %d %s with %d hit points.",character.getLevel(),character.getCharacterClass(),character.getHitPoints());
    }

    public String describe(Destination destination){
        return String.format("You've arrived at %s, which has %d inhabitants.",destination.getName(),destination.getInhabitants());
    }

    public String describe(TravelMethod travelmethod){
        String str = "You're traveling to your destination ";
        str += (travelmethod == TravelMethod.HORSEBACK) ? "on horseback." : "by walking.";
        return str;
    }

    public String describe(Character character,Destination destination,TravelMethod travelmethod){
        return String.format("%s %s %s",describe(character),describe(travelmethod),describe(destination));
    }

    public String describe(Character character,Destination destination){
        return String.format("%s You're traveling to your destination by walking. %s",describe(character),describe(destination));
    }
}
