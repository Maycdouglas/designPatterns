package patterns.structural.bridge;

public class Assistant extends JobTitle {

    public Assistant(float baseSalary) {
        super(baseSalary);
    }

    public float calculateSalary() {
        return this.baseSalary;
    }
}
