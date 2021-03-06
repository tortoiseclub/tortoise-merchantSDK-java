/*
 * Tortoise Merchant API
 * Tortoise API for merchant to integrate with their existing systems 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: developer@tortoise.pro
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Customer;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerApi
 */
@Ignore
public class CustomerApiTest {

    private final CustomerApi api = new CustomerApi();

    
    /**
     * Add a new customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomerTest() throws ApiException {
        Customer body = null;
        Customer response = api.addCustomer(body);

        // TODO: test validations
    }
    
    /**
     * Edit customer details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editCustomerTest() throws ApiException {
        String customerId = null;
        Customer body = null;
        api.editCustomer(customerId, body);

        // TODO: test validations
    }
    
    /**
     * Fetch all customers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchAllCustomersTest() throws ApiException {
        List<Customer> response = api.fetchAllCustomers();

        // TODO: test validations
    }
    
    /**
     * Get customer by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerTest() throws ApiException {
        String customerId = null;
        Customer response = api.getCustomer(customerId);

        // TODO: test validations
    }
    
}
