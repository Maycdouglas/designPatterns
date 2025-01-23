package patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssistantTest {

    @Test
    void deveRetornarSalarioAssistenteComEnsinoMedio(){
        Education education = new HighSchool();
        Assistant assistant = new Assistant(1000.0f);
        assistant.setEducation(education);
        assertEquals(1000.0f, assistant.calculateSalary(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAssistenteComGraduacao(){
        Education education = new Graduation();
        Assistant assistant = new Assistant(1000.0f);
        assistant.setEducation(education);
        assertEquals(1000.0f, assistant.calculateSalary(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAssistenteComMestrado(){
        Education education = new MastersDegree();
        Assistant assistant = new Assistant(1000.0f);
        assistant.setEducation(education);
        assertEquals(1000.0f, assistant.calculateSalary(), 0.01f);
    }
}