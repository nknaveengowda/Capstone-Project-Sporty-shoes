package com.sportyshoe.restAssuredScripts;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Deleteshoe {
	@Test(priority='1')	
	public void delete_product(){

		RestAssured.given()
		.baseUri("http://localhost:9010")

		.basePath("/delete-shoe")
		.queryParam("id", "1010")
		.when().delete()
		.then().log().all();


	}

}
