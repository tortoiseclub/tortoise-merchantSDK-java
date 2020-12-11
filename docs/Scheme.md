
# Scheme

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the scheme |  [optional]
**name** | **String** | Name of the scheme |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which the scheme is created |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**redemptionOption** | [**SchemeRedemptionOption**](SchemeRedemptionOption.md) |  |  [optional]
**durationInMonths** | **Integer** | Duration of the scheme in months, in other words, number of instalments to be paid by the customer |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
DISABLED | &quot;disabled&quot;
REVIEWPENDING | &quot;reviewPending&quot;
REVIEWREJECTED | &quot;reviewRejected&quot;



