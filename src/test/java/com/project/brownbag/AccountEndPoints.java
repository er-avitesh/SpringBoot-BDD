package com.project.brownbag;

public interface AccountEndPoints {

	String GET_ACCOUNT = "app/getAccount/{CustomerID}";
	String GET_ALL = "/app/getAllAccounts";
	String GET_EMPLOYEE_PATH_PARAM = "/employee/getEmployee/{employeeId}";
	String GET_EMPLOYEE_QUERY_PARAM = "/employee/getEmployeeQuery";
	String POST_EMPLOYEE_PARAM = "/employee/addEmployee";

	String GOOGLE_API = "/v1/volumes";

}
