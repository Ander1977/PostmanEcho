package rest;


import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;


class MobileBankApiTest {
    @Test
    void shouldReturnDemoAccounts () {
        given()
                .baseUri("https://postman-echo.com")
                .body("id:3")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("id:1"));
    }

}
