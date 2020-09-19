package by.gorbatenkova.belstu.organization;

public enum Organization {
    BSTU("Belarusian State Technological University", 10),
    BSU("Belarusian State University", 9),
    BSUIR("Belarusian State University of Informatics and Radioelectronics", 8),
    BNTU("Belarusian National Technical University", 7);

    private String fullOrgName;
    private float rating;
    private int countStudent;

    Organization(String fullOrgName, float rating) {
        this.fullOrgName = fullOrgName;
        this.rating = rating;
    }

    public String getFullOrgName() {
        return fullOrgName;
    }

    public int getCountStudent() { return countStudent; }

    public int incrementStudent() {
        return countStudent += 1;
    }
}
