package patterns.structural.bridge;

public class Analyst extends JobTitle {

    private int numProjects;

    public Analyst(float baseSalary) {
        super(baseSalary);
    }

    public void setNumProjects(int numProjects) {
        this.numProjects = numProjects;
    }

    public float calculateSalary() {
        return this.baseSalary * numProjects * (1 + this.education.percentageIncrease());
    }
}
