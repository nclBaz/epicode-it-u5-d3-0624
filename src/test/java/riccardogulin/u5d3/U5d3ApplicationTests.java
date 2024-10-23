package riccardogulin.u5d3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import riccardogulin.u5d3.tools.CustomMath;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5d3ApplicationTests {

	@Test
	void testSum() {
		System.out.println("TEST 1");
		int result = CustomMath.sum(2, 2);
		assertEquals(4, result);
	}

/*	@Test
	void testSum2() {
		System.out.println("TEST 1");
		int result = CustomMath.sum(3, 3);
		assertEquals(4, result);
	}*/

	@Test
	void testProd(){
		System.out.println("TEST 2");
		int result = CustomMath.mult(4, 4);
		assertEquals(16, result);
	}

	@ParameterizedTest
	@CsvSource({"2, 2, 4", "3, 3, 6", "10, 10, 20", "100, 100, 200"}) // A seconda del numero di stringhe che gli passo qua, verranno eseguiti tot test. All'interno di ogni
	// stringa passero l'elenco dei valori per i 3 parametri definiti, tutti separati da virgole
	void testParameterizedSum(int num1, int num2, int expectedResult){
		int result = CustomMath.sum(num1, num2);
		assertEquals(expectedResult, result);
	}

	@BeforeAll
	static void setup(){
		System.out.println("BEFORE ALL");
	}

	@AfterAll
	static void clean(){
		System.out.println("AFTER ALL");
	}

	@BeforeEach
	void beforeEach(){
		System.out.println("BEFORE EACH");
	}

	@AfterEach
	void afterEach(){
		System.out.println("AFTER EACH");
	}
}
