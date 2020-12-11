# RedemptionApi

All URIs are relative to *https://virtserver.swaggerhub.com/suryaharshan1/Tortoise/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRedemption**](RedemptionApi.md#addRedemption) | **POST** /redemptions | Create a new redemption request for a plan
[**editRedemption**](RedemptionApi.md#editRedemption) | **PUT** /redemptions/{redemptionId} | Edit a redemption request for a plan
[**fetchAllRedemptions**](RedemptionApi.md#fetchAllRedemptions) | **GET** /redemptions | Fetch all redemption requests
[**getRedemption**](RedemptionApi.md#getRedemption) | **GET** /redemptions/{redemptionId} | Get a redemption request by ID


<a name="addRedemption"></a>
# **addRedemption**
> addRedemption(body)

Create a new redemption request for a plan

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RedemptionApi;

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

RedemptionApi apiInstance = new RedemptionApi();
Redemption body = new Redemption(); // Redemption | Redemption object that needs to be added
try {
    apiInstance.addRedemption(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RedemptionApi#addRedemption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Redemption**](Redemption.md)| Redemption object that needs to be added |

### Return type

null (empty response body)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editRedemption"></a>
# **editRedemption**
> editRedemption(redemptionId, body)

Edit a redemption request for a plan

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RedemptionApi;

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

RedemptionApi apiInstance = new RedemptionApi();
String redemptionId = "redemptionId_example"; // String | ID of the redemption to edit
Redemption body = new Redemption(); // Redemption | Redemption object that needs to be edited
try {
    apiInstance.editRedemption(redemptionId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RedemptionApi#editRedemption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redemptionId** | **String**| ID of the redemption to edit |
 **body** | [**Redemption**](Redemption.md)| Redemption object that needs to be edited |

### Return type

null (empty response body)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchAllRedemptions"></a>
# **fetchAllRedemptions**
> List&lt;Redemption&gt; fetchAllRedemptions()

Fetch all redemption requests

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RedemptionApi;

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

RedemptionApi apiInstance = new RedemptionApi();
try {
    List<Redemption> result = apiInstance.fetchAllRedemptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RedemptionApi#fetchAllRedemptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Redemption&gt;**](Redemption.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRedemption"></a>
# **getRedemption**
> Redemption getRedemption(redemptionId)

Get a redemption request by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RedemptionApi;

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

RedemptionApi apiInstance = new RedemptionApi();
String redemptionId = "redemptionId_example"; // String | ID of the redemption to fetch
try {
    Redemption result = apiInstance.getRedemption(redemptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RedemptionApi#getRedemption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redemptionId** | **String**| ID of the redemption to fetch |

### Return type

[**Redemption**](Redemption.md)

### Authorization

[tortoise_merchant_apiKey](../README.md#tortoise_merchant_apiKey), [tortoise_merchant_appId](../README.md#tortoise_merchant_appId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

