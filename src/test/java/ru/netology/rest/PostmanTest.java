package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

    @Test
    void SendData() {
        var text = "Hello";
        given()
                .baseUri("https://postman-echo.com")
                .body("hello")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(text))
        ;

    }
}
