package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSwingApplicationTests {
	TestSwingApplication application = new TestSwingApplication();

	@Test
	void givenTwoIntegers_WhenSum_ThenCorrectResult() {
		// Given 5 and 7
		application.numberOneTextField.setText("5");
		application.numberTwoTextField.setText("7");
		String expectedResult = "12";
		
		//When operation is sum
		application.operationButton.doClick();
		
		//Then result is 12
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResult, actualResult);
	}
	

	@Test
	void given_anInvalidInput_Whensum_ThenInvalidInput() {
		//Given 'a' and 'b'
		application.numberOneTextField.setText("a");
		application.numberTwoTextField.setText("b");
		String expectedResult = "";
		
		//When operation is sum 
		application.operationButton.doClick();
		
		//Then result is ''
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResult, actualResult);
	}
}
