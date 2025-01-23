package patterns.structural.bridge;

public class Technician extends JobTitle {
    public Technician(float baseSalary) {
        super(baseSalary);
    }

    public float calculateSalary(){
        return this.baseSalary * (1 + this.education.percentageIncrease());
    }
}
