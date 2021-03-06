package model;

import java.util.List;
import java.util.Objects;

public class Location {

    public enum Race {
       ELVES, DRAGONS, WEREWOLVES, WITCHES, DEMONS, ANGELS, MERMAIDS;
    }

    private String partName;
    private String kingdom;
    private Race mainRace;
    private int enteringLevel;

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public Race getMainRace() {
        return mainRace;
    }

    public void setMainRace(Race mainRace) {
        this.mainRace = mainRace;
    }

    public int getEnteringLevel() {
        return enteringLevel;
    }

    public void setEnteringLevel(int enteringLevel) {
        this.enteringLevel = enteringLevel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return enteringLevel == location.enteringLevel &&
                Objects.equals(partName, location.partName) &&
                Objects.equals(kingdom, location.kingdom) &&
                mainRace == location.mainRace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(partName.toLowerCase(), kingdom.toLowerCase(), mainRace, enteringLevel);
    }


    public static class Builder {
        private Location newLocation = new Location();

        public Builder() {
            newLocation = new Location();
        }

        public Builder withMainRace(Race mainRace){
            newLocation.mainRace = mainRace;
            return this;
        }

        public Builder withPartName(String partName){
            newLocation.partName = partName;
            return this;
        }

        public Builder withKingdom(String kingdom){
            newLocation.kingdom = kingdom;
            return this;
        }

        public Builder withEnteringLevel(int enteringLevel){
            newLocation.enteringLevel = enteringLevel;
            return this;
        }


        public Location build(){
            return newLocation;
        }
    }

    @Override
    public String toString() {
        return "Location{" +
                ", partName = '" + partName + '\'' +
                ", kingdom = '" + kingdom + '\'' +
                ", mainRace = '" + mainRace + '\'' +
                ", enteringLevel = " + enteringLevel +
                '}';
    }
}
