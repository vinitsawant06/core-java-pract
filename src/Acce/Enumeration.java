package Acce;

enum Gender {
    Male,
    Female
}

public class Enumeration {
    private String name;
    private Gender gender;
    Enumeration(String name, Gender gender) {
        this.name=name;
        this.gender=gender;
    }
    public static void main(String[] args) {
        Enumeration enumeration = new Enumeration("Vinit", Gender.Male);
    }
}
