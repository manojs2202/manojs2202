import io.restassured.RestAssured;
import org.testng.annotations.*;

import static io.restassured.RestAssured.given;

public class TestEmployees {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite Executed");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test Executed");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before Groups Executed");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class Executed");
    }
    @BeforeMethod
    public void beforeMethod(){
        RestAssured.baseURI = "http://localhost:3000";
    }
    @Test
    public void testPost(){
        given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"first_name\": \"Rohith\",\n" +
                        "    \"last_name\": \"Naga\",\n" +
                        "    \"email\": \"rohithn@codingthesmartway.com\"\n" +
                        "}")
                .log().all()
                .when()
                .post("/employees")
                .then()
                .log().all()
                .assertThat()
                .statusCode(201);
    }
   }