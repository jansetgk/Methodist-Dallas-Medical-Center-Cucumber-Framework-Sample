package com.MDMC.utils;

public class APIConstants {

	public static final String GENERATE_TOKEN_URI = "http://18.232.148.34/syntaxapi/api/generateToken.php";
	
	public static final String CREATE_EMPLOYEE_URI = "http://18.232.148.34/syntaxapi/api/createEmployee.php";
	
	public static final String GET_ONE_EMPLOYEE_URI = "http://18.232.148.34/syntaxapi/api/getOneEmployee.php";

	public static final String UPDATE_EMPLOYEE_URI = "http://18.232.148.34/syntaxapi/api/updateEmployee.php";
	
	public static final String CREATE_EMPLOYEE_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/createEmployee.json";

	public static final String GENERATE_TOKEN_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/generateToken.json";

	public static final String UPDATE_EMPLOYEE_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/updateEmployee.json";

}
