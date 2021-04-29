package dev.kameshs.funqy;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class FunqyTest {

    @Test
    public void testCharm() {
        given()
                .contentType("application/json")
                .body("{\"value\": \"c\"}")
                .post("/charm")
                .then()
                .statusCode(200)
                .body(containsString("You Quark!"));
    }

}
