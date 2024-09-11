package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {
    private GasMileage gasMileage;
    @BeforeEach
    public void setUp() {
        gasMileage = new GasMileage();
    }

    @Test
    public void overAllGasMileageIs0(){
        assertEquals(0.00, gasMileage.getOverAllGasMileage());
    }

    @Test
    public void overAllGasMileageIs1_AfterSettingTheValueTo1(){
        gasMileage.setOverAllGasMileage(1);
        assertEquals(1.00, gasMileage.getOverAllGasMileage());
    }

    @Test
    public void overAllGasMileageIs3_AfterPassing9And3ToCalculateMileage(){
        gasMileage.calculateMileage(9, 3);
        assertEquals(3.00, gasMileage.getOverAllGasMileage());
    }

    @Test
    public void overAllGasMileageIs3_AfterPassingMultipleValueToCalculateMileage(){
        gasMileage.calculateMileage(5, 2, 4, 1 );
        assertEquals(3.00, gasMileage.getOverAllGasMileage());
    }




}
