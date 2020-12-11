# SchemeApi

All URIs are relative to *https://virtserver.swaggerhub.com/suryaharshan1/Tortoise/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addScheme**](SchemeApi.md#addScheme) | **POST** /schemes | Add a new scheme
[**editScheme**](SchemeApi.md#editScheme) | **PUT** /schemes/{schemeId} | Edit scheme details
[**fetchAllSchemes**](SchemeApi.md#fetchAllSchemes) | **GET** /schemes | Fetch all schemes
[**getScheme**](SchemeApi.md#getScheme) | **GET** /schemes/{schemeId} | Get scheme by ID


<a name="addScheme"></a>
# **addScheme**
> addScheme(body)

Add a new scheme

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchemeApi;

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

SchemeApi apiInstance = new SchemeApi();
Scheme body = new Scheme(); // Scheme | Scheme object that needs to be added
try {
    apiInstance.addScheme(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemeApi#addScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Scheme**](Scheme.md)| Scheme object that needs to be added |

### Return type

null (empty response body)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editScheme"></a>
# **editScheme**
> editScheme(schemeId, body)

Edit scheme details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchemeApi;

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

SchemeApi apiInstance = new SchemeApi();
String schemeId = "schemeId_example"; // String | ID of the scheme to edit
Scheme body = new Scheme(); // Scheme | Scheme object that needs to be edited
try {
    apiInstance.editScheme(schemeId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemeApi#editScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemeId** | **String**| ID of the scheme to edit |
 **body** | [**Scheme**](Scheme.md)| Scheme object that needs to be edited |

### Return type

null (empty response body)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchAllSchemes"></a>
# **fetchAllSchemes**
> List&lt;Scheme&gt; fetchAllSchemes()

Fetch all schemes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchemeApi;

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

SchemeApi apiInstance = new SchemeApi();
try {
    List<Scheme> result = apiInstance.fetchAllSchemes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemeApi#fetchAllSchemes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Scheme&gt;**](Scheme.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScheme"></a>
# **getScheme**
> Scheme getScheme(schemeId)

Get scheme by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchemeApi;

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

SchemeApi apiInstance = new SchemeApi();
String schemeId = "schemeId_example"; // String | ID of the scheme to fetch
try {
    Scheme result = apiInstance.getScheme(schemeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemeApi#getScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemeId** | **String**| ID of the scheme to fetch |

### Return type

[**Scheme**](Scheme.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

