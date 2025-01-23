package patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TechnicianTest {
    @Test
    void deveRetornarSalarioTecnicoComEnsinoMedio(){
        Education education = new HighSchool();
        Technician technician = new Technician(2000.0f);
        technician.setEducation(education);
        assertEquals(2000.0f, technician.calculateSalary(), 0.01f);
    }

    @Test
    void deveRetornarSalarioTecnicoComGraduacao(){
        Education education = new Graduation();
        Technician technician = new Technician(2000.0f);
        technician.setEducation(education);
        assertEquals(2200.0f, technician.calculateSalary(), 0.01f);
    }

    @Test
    void deveRetornarSalarioTecnicoComMestrado(){
        Education education = new MastersDegree();
        Technician technician = new Technician(2000.0f);
        technician.setEducation(education);
        assertEquals(2400.0f, technician.calculateSalary(), 0.01f);
    }
}