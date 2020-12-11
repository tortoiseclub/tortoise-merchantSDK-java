
# Redemption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the redemption request |  [optional]
**plan** | [**Plan**](Plan.md) |  |  [optional]
**requestRaisedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**requestProcessedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RAISED | &quot;raised&quot;
PROCESSING | &quot;processing&quot;
SUCCESSFUL | &quot;successful&quot;
FAILED | &quot;failed&quot;



