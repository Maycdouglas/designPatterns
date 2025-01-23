package patterns.structural.bridge;

public abstract class JobTitle {

    protected Education education;

    protected float baseSalary;

    public JobTitle(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract float calculateSalary();
}
