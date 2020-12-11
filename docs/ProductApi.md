# ProductApi

All URIs are relative to *https://virtserver.swaggerhub.com/suryaharshan1/Tortoise/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](ProductApi.md#addProduct) | **POST** /products | Add a new product
[**editProduct**](ProductApi.md#editProduct) | **PUT** /products/{productId} | Edit product details
[**fetchAllProducts**](ProductApi.md#fetchAllProducts) | **GET** /products | Fetch all products
[**getProduct**](ProductApi.md#getProduct) | **GET** /products/{productId} | Get product by ID


<a name="addProduct"></a>
# **addProduct**
> Product addProduct(body)

Add a new product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductApi;

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

ProductApi apiInstance = new ProductApi();
Product body = new Product(); // Product | Product object that needs to be added
try {
    Product result = apiInstance.addProduct(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#addProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Product**](Product.md)| Product object that needs to be added |

### Return type

[**Product**](Product.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editProduct"></a>
# **editProduct**
> editProduct(productId, body)

Edit product details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductApi;

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

ProductApi apiInstance = new ProductApi();
String productId = "productId_example"; // String | ID of the product to edit
Product body = new Product(); // Product | Product object that needs to be edited
try {
    apiInstance.editProduct(productId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#editProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| ID of the product to edit |
 **body** | [**Product**](Product.md)| Product object that needs to be edited |

### Return type

null (empty response body)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchAllProducts"></a>
# **fetchAllProducts**
> List&lt;Product&gt; fetchAllProducts()

Fetch all products

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductApi;

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

ProductApi apiInstance = new ProductApi();
try {
    List<Product> result = apiInstance.fetchAllProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#fetchAllProducts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProduct"></a>
# **getProduct**
> Product getProduct(productId)

Get product by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductApi;

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

ProductApi apiInstance = new ProductApi();
String productId = "productId_example"; // String | ID of the product to fetch
try {
    Product result = apiInstance.getProduct(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| ID of the product to fetch |

### Return type

[**Product**](Product.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

