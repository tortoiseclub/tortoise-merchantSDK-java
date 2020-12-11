# CancellationApi

All URIs are relative to *https://virtserver.swaggerhub.com/suryaharshan1/Tortoise/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCancellation**](CancellationApi.md#addCancellation) | **POST** /cancellations | Create a new cancellation request for a plan
[**editCancellation**](CancellationApi.md#editCancellation) | **PUT** /cancellations/{cancellationId} | Edit a cancellation request for a plan
[**fetchAllCancellations**](CancellationApi.md#fetchAllCancellations) | **GET** /cancellations | Fetch all cancellations
[**getCancellation**](CancellationApi.md#getCancellation) | **GET** /cancellations/{cancellationId} | Get cancellation by ID


<a name="addCancellation"></a>
# **addCancellation**
> addCancellation(body)

Create a new cancellation request for a plan

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CancellationApi;

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

CancellationApi apiInstance = new CancellationApi();
Cancellation body = new Cancellation(); // Cancellation | cancellation object that needs to be added
try {
    apiInstance.addCancellation(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CancellationApi#addCancellation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Cancellation**](Cancellation.md)| cancellation object that needs to be added |

### Return type

null (empty response body)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editCancellation"></a>
# **editCancellation**
> editCancellation(cancellationId, body)

Edit a cancellation request for a plan

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CancellationApi;

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

CancellationApi apiInstance = new CancellationApi();
String cancellationId = "cancellationId_example"; // String | ID of the cancellation to edit
Cancellation body = new Cancellation(); // Cancellation | Cancellation object that needs to be edited
try {
    apiInstance.editCancellation(cancellationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CancellationApi#editCancellation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancellationId** | **String**| ID of the cancellation to edit |
 **body** | [**Cancellation**](Cancellation.md)| Cancellation object that needs to be edited |

### Return type

null (empty response body)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchAllCancellations"></a>
# **fetchAllCancellations**
> List&lt;Cancellation&gt; fetchAllCancellations()

Fetch all cancellations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CancellationApi;

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

CancellationApi apiInstance = new CancellationApi();
try {
    List<Cancellation> result = apiInstance.fetchAllCancellations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancellationApi#fetchAllCancellations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Cancellation&gt;**](Cancellation.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCancellation"></a>
# **getCancellation**
> Cancellation getCancellation(cancellationId)

Get cancellation by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CancellationApi;

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

CancellationApi apiInstance = new CancellationApi();
String cancellationId = "cancellationId_example"; // String | ID of the cancellation to fetch
try {
    Cancellation result = apiInstance.getCancellation(cancellationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancellationApi#getCancellation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancellationId** | **String**| ID of the cancellation to fetch |

### Return type

[**Cancellation**](Cancellation.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

