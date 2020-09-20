package belsty.gorbatenkova.by.organization;

import java.util.Random;

public enum Organization {
    iTechArt(""),
    IsSoft("");
    private int amount;
    private final String description;

    public String getOrgDescription() {
        return description;
    }

    public static Organization getRandomOrg(){
        int item = new Random().nextInt(Organization.values().length);
        Organization.values()[item].amount++;
        return Organization.values()[item];
    }
    Organization(String description) {
        this.description = description;
    }
}
