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
import io.swagger.client.model.Scheme;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchemeApi
 */
@Ignore
public class SchemeApiTest {

    private final SchemeApi api = new SchemeApi();

    
    /**
     * Add a new scheme
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSchemeTest() throws ApiException {
        Scheme body = null;
        api.addScheme(body);

        // TODO: test validations
    }
    
    /**
     * Edit scheme details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editSchemeTest() throws ApiException {
        String schemeId = null;
        Scheme body = null;
        api.editScheme(schemeId, body);

        // TODO: test validations
    }
    
    /**
     * Fetch all schemes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchAllSchemesTest() throws ApiException {
        List<Scheme> response = api.fetchAllSchemes();

        // TODO: test validations
    }
    
    /**
     * Get scheme by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchemeTest() throws ApiException {
        String schemeId = null;
        Scheme response = api.getScheme(schemeId);

        // TODO: test validations
    }
    
}
