package challege;

public class Organ {
    private String name;
    private String medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;

    }

    public void getDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Medical codition: " + this.getMedicalCondition());
    }

    public String getName() {

        return name;
    }


    public String getMedicalCondition() {
        return medicalCondition;
    }
}


