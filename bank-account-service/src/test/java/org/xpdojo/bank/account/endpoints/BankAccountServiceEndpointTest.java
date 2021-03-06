package org.xpdojo.bank.account.endpoints;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static io.restassured.RestAssured.given;
import static java.time.LocalDateTime.now;
import static org.assertj.core.api.Assertions.assertThat;

//@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DisplayName("With the bank account service we can")
public class BankAccountServiceEndpointTest {

    @LocalServerPort
    int port;

    @BeforeEach
    void setUp() {
        RestAssured.port = port;
    }

    @Disabled
    @Test
    public void createAccounts(){
//        AccountCreationResponse response = given()
//                .header("Content-Type", "application/json")
//                .when().log().all()
//                .post("/accounts")
//                .then().log().all()
//                .extract().body().as(AccountCreationResponse.class);
//        assertThat(response.getAccountNumber()).isNotNull();
    }

    @Disabled
    @Test
    public void retrieveAccounts(){
//        List<AccountSummary> accounts = given()
//                .header("Content-Type", "application/json")
//                .when().log().all()
//                .get("/accounts")
//                .then().log().all()
//                .extract().body()
//                .jsonPath().getList(".", AccountSummary.class);
//        assertThat(accounts.size()).isEqualTo(1);
    }

    @Disabled
    @Test
    public void retrieveAccountById(){
//        AccountSummary account = given()
//                .header("Content-Type", "application/json")
//                .when().log().all()
//                .get("accounts/30001234")
//                .then().log().all()
//                .extract().body().as(AccountSummary.class);
//        assertThat(account.getAccountNumber()).isEqualTo(30001234L);
    }

}
