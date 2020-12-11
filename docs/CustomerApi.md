# CustomerApi

All URIs are relative to *https://virtserver.swaggerhub.com/suryaharshan1/Tortoise/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomer**](CustomerApi.md#addCustomer) | **POST** /customers | Add a new customer
[**editCustomer**](CustomerApi.md#editCustomer) | **PUT** /customers/{customerId} | Edit customer details
[**fetchAllCustomers**](CustomerApi.md#fetchAllCustomers) | **GET** /customers | Fetch all customers
[**getCustomer**](CustomerApi.md#getCustomer) | **GET** /customers/{customerId} | Get customer by ID


<a name="addCustomer"></a>
# **addCustomer**
> Customer addCustomer(body)

Add a new customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tortoise_merchant_apiKey
ApiKeyAuth tortoise_merchant_apiKey = (ApiKeyAuth) defaultClient.getAuthentication("tortoise_merchant_apiKey");
tortoise_merchant_apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tortoise_merchant_apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: tortoise_merchant_appId
ApiKeyAuth tortoise_merchant_appId = (ApiKeyAuth) defaultClient.getAuthentication("tortoise_merchant_appId");
tortoise_merchant_appId.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tortoise_merchant_appId.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Customer body = new Customer(); // Customer | Customer object that needs to be added
try {
    Customer result = apiInstance.addCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#addCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)| Customer object that needs to be added |

### Return type

[**Customer**](Customer.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editCustomer"></a>
# **editCustomer**
> editCustomer(customerId, body)

Edit customer details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tortoise_merchant_apiKey
ApiKeyAuth tortoise_merchant_apiKey = (ApiKeyAuth) defaultClient.getAuthentication("tortoise_merchant_apiKey");
tortoise_merchant_apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tortoise_merchant_apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: tortoise_merchant_appId
ApiKeyAuth tortoise_merchant_appId = (ApiKeyAuth) defaultClient.getAuthentication("tortoise_merchant_appId");
tortoise_merchant_appId.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tortoise_merchant_appId.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
String customerId = "customerId_example"; // String | ID of customer to edit
Customer body = new Customer(); // Customer | Customer object that needs to be edited
try {
    apiInstance.editCustomer(customerId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#editCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| ID of customer to edit |
 **body** | [**Customer**](Customer.md)| Customer object that needs to be edited |

### Return type

null (empty response body)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchAllCustomers"></a>
# **fetchAllCustomers**
> List&lt;Customer&gt; fetchAllCustomers()

Fetch all customers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tortoise_merchant_apiKey
ApiKeyAuth tortoise_merchant_apiKey = (ApiKeyAuth) defaultClient.getAuthentication("tortoise_merchant_apiKey");
tortoise_merchant_apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tortoise_merchant_apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: tortoise_merchant_appId
ApiKeyAuth tortoise_merchant_appId = (ApiKeyAuth) defaultClient.getAuthentication("tortoise_merchant_appId");
tortoise_merchant_appId.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tortoise_merchant_appId.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
try {
    List<Customer> result = apiInstance.fetchAllCustomers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#fetchAllCustomers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> Customer getCustomer(customerId)

Get customer by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tortoise_merchant_apiKey
ApiKeyAuth tortoise_merchant_apiKey = (ApiKeyAuth) defaultClient.getAuthentication("tortoise_merchant_apiKey");
tortoise_merchant_apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tortoise_merchant_apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: tortoise_merchant_appId
ApiKeyAuth tortoise_merchant_appId = (ApiKeyAuth) defaultClient.getAuthentication("tortoise_merchant_appId");
tortoise_merchant_appId.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tortoise_merchant_appId.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
String customerId = "customerId_example"; // String | ID of customer to get
try {
    Customer result = apiInstance.getCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| ID of customer to get |

### Return type

[**Customer**](Customer.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

