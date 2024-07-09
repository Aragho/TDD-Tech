import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class GasMilageCalculatorTest{

	@Test
	public void testCanCalculateMilesPerGallon(){

		//given
		GasMilageCalculator calculator = new GasMilageCalculator();
		//when
		double numberOfMilesDriven = 30.00;
		double numberOfGallons = 20;
		double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallons);
		//assert
		assertEquals(1.5, milesPerGallon);

	}



}