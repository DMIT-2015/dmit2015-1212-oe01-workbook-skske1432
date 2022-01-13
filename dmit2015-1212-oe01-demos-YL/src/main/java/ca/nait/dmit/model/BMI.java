package ca.nait.dmit.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ca.nait.dmit.domain.BMI;
import org.junit.Test;
i

class BMITest {

    @Test
    void bmiShouldBeUnderweight() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(100);
        bmi1.setHeight(66);
        assertEquals()
    }


}