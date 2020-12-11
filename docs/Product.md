
# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Identifier for the product |  [optional]
**name** | **String** | Name of the product |  [optional]
**category** | **String** | Name of the category that product belongs to |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**price** | **Integer** |  |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
DISABLED | &quot;disabled&quot;
REVIEWPENDING | &quot;reviewPending&quot;
REVIEWREJECTED | &quot;reviewRejected&quot;



