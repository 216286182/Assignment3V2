package Inheritance;

public class UnderGrad {
    private String id = "216286182";
    private String name  = "Avery";
    private String surname = "Daniels";
    private int years = 23;

    public UnderGrad() {
        System.out.println("\nInheritance");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "UnderGrad{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", years=" + years +
                '}';
    }
}
