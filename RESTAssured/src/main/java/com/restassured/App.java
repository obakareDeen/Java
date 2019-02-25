package com.restassured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.*;

import io.restassured.http.ContentType;

public class App 
{
	final static String URL = "http://localhost:3000";
	static int postIndex = 1;
    public static void main( String[] args )
    {
    	given().contentType(ContentType.JSON).
    	when().get(URL + "/posts/" + postIndex).
    	then().body("author", is("Walter Savitch"));
    }
}
