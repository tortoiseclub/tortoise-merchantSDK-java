
# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the payment |  [optional]
**plan** | [**Plan**](Plan.md) |  |  [optional]
**instalmentId** | **Integer** | Instalment serial number for which the payment has been made |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | Mode of payment |  [optional]
**amount** | **Integer** | Amount paid on the payment |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which the payment has been made |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the payment |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
DEBIT | &quot;debit&quot;
CREDIT | &quot;credit&quot;
UPI | &quot;upi&quot;
NETBANKING | &quot;netbanking&quot;
CASH | &quot;cash&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESSFUL | &quot;successful&quot;
FAILED | &quot;failed&quot;
REFUNDED | &quot;refunded&quot;
REFUNDINITIATED | &quot;refundInitiated&quot;
PROCESSING | &quot;processing&quot;



