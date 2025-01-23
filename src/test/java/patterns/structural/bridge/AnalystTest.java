package patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalystTest {
    @Test
    void deveRetornarSalarioAnalistaComEnsinoMedio(){
        Education education = new HighSchool();
        Analyst analyst = new Analyst(2000.0f);
        analyst.setEducation(education);
        analyst.setNumProjects(2);
        assertEquals(4000.0f, analyst.calculateSalary(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAnalistaComGraduacao(){
        Education education = new Graduation();
        Analyst analyst = new Analyst(2000.0f);
        analyst.setEducation(education);
        analyst.setNumProjects(2);
        assertEquals(4400.0f, analyst.calculateSalary(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAnalistaComMestrado(){
        Education education = new MastersDegree();
        Analyst analyst = new Analyst(2000.0f);
        analyst.setEducation(education);
        analyst.setNumProjects(2);
        assertEquals(4800.0f, analyst.calculateSalary(), 0.01f);
    }
}