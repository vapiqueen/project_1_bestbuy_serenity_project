package com.bestbuy.testbase;

import com.bestbuy.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    public static PropertyReader propertyReader;


    @BeforeClass
    public static void init() {


        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
    }
}
