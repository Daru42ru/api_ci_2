import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    public void shouldReturnDemoAccounts() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("cheese")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("cheese"))
        ;
    }
}
