package testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;

public class SampleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
	}

	@Test
	public void test() {
		RestAssured.given()
					.when().get("/posts")
					.then().statusCode(200)
							.log().all();
	}

}
