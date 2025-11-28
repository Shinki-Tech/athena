package com.shinki.athena.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BacenWorkflowResourceTest {

    @Test
    public void testHelloEndpoint() {
        // Teste simples para garantir que o Quarkus está funcionando
        given()
                .when().get("/api/v1/automacao/bacen/status") // Você precisará criar este endpoint
                .then()
                .statusCode(200)
                .body(is("Workflow Status: OK")); // Espera-se a resposta que você definir
    }
}