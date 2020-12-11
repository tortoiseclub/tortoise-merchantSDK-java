
# Plan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the plan |  [optional]
**customer** | [**PlanCustomer**](PlanCustomer.md) |  |  [optional]
**product** | [**PlanProduct**](PlanProduct.md) |  |  [optional]
**scheme** | [**PlanScheme**](PlanScheme.md) |  |  [optional]
**enrolledOn** | [**OffsetDateTime**](OffsetDateTime.md) | Time when customer enrolled on the plan |  [optional]
**planValue** | **Integer** | Total price of the plan, to be paid by the customer |  [optional]
**instalmentValue** | **Integer** | Value of each instalment to be paid by the customer |  [optional]
**totalPaidValue** | **Integer** | Total amount paid by the customer towards the plan till date |  [optional]
**completedInstalments** | **Integer** | Instalments paid by customer till date |  [optional]
**nextInstalmentDate** | [**LocalDate**](LocalDate.md) | Due date for the upcoming instalment of the plan |  [optional]
**planMaturityDate** | [**LocalDate**](LocalDate.md) | Date on which the plan is expected to mature |  [optional]
**totalExpectedRedemptionValue** | **Integer** | Total amount expected to be redeemed by the customer at the end of the plan |  [optional]
**currentRedemptionValue** | **Integer** | Total amount that can be redeemed by the customer by closing the plan today |  [optional]
**currentCancellationValue** | **Integer** | Total amount that is paid back to customer if the plan is cancelled today |  [optional]
**lastInstalmentPaidOn** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of last paid instalment |  [optional]



