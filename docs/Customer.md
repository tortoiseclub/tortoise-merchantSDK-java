
# Customer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the customer |  [optional]
**firstName** | **String** | Customer&#39;s first name. For example, Surya Harsha |  [optional]
**lastName** | **String** | Customer&#39;s last name. For example, Singh |  [optional]
**email** | **String** |  |  [optional]
**mobile** | **String** |  |  [optional]
**countryCode** | **String** |  |  [optional]
**age** | **Integer** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**kycStatus** | [**KycStatusEnum**](#KycStatusEnum) |  |  [optional]


<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;
OTHER | &quot;other&quot;


<a name="KycStatusEnum"></a>
## Enum: KycStatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
INPROCESS | &quot;inProcess&quot;
VERIFIED | &quot;verified&quot;
FAILED | &quot;failed&quot;



