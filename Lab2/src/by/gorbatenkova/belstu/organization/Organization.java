package by.gorbatenkova.belstu.organization;

import java.util.Random;

public enum Organization {
    BSTU("Belarusian State Technological University", 10),
    BSU("Belarusian State University", 9),
    BSUIR("Belarusian State University of Informatics and Radioelectronics", 8),
    BNTU("Belarusian National Technical University", 7);

    private String fullOrgName;
    private float rating;
    private int amountStudent;

    Organization(String fullOrgName, float rating) {
        this.fullOrgName = fullOrgName;
        this.rating = rating;
    }

    public static Organization getRandom(){
        int item = new Random().nextInt(Organization.values().length);
        Organization.values()[item].amountStudent++;
        return Organization.values()[item];
    }

    public String getFullOrgName() {
        return fullOrgName;
    }

    public int getAmountStudent() { return amountStudent; }

    public int incrementStudent() {
        return amountStudent += 1;
    }
}
