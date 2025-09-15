# APIs

This section details planned changes to the Making Tax Digital for Income Tax APIs.

For details of deployed changes, see the [API changelog](https://github.com/hmrc/income-tax-mtd-changelog) (GitHub).


## What we're working on now

### December 2025

These changes are expected to be deployed in December 2025 (to be confirmed).

Version numbers will be added once the scope for the release and the associated release date are confirmed.

| API(s) | Change | [Breaking?](#def_br) | [Tax years](#def_ty) | [Affects quarterly updates?](#def_aqu) | [Usable in year?](#def_uiy) | [Deploy to Sandbox](#def_dep) |
| --- | --- | --- | --- | --- | --- | --- |
| Individuals Employment Income | Student Loan BIK – a change to ensure the payrolled BIK are excluded from student loan calculations | No  | 25-26+ | Yes | No  | October 2025 |
| Self Assessment Individual Details (MTD)<br><br>  <br>[Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/) | ITSA status – renaming of non-digital status to Digitally Exempt | Yes | 26-27+ | Yes | Yes | October 2025 |
| [Individual Relief Api](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-reliefs-api/2.0) | Withdrawal of social investment tax relief (SITR)  <br>Removal of SITR data items. | Yes | 25-26+ | No  | No  | October 2025 |
| [Business Details (MTD)](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/business-details-api/1.0)<br><br>(V2) | Basis Period Reform – ability to review and disapply Late Accounting Date Rules. | No  | 25/26 + | Yes | Yes | October 2025 |

### January 2026

These changes are expected to be deployed in January 2026.

Version numbers will be added once the scope for the release and the associated release date are confirmed.

| API(s) | Change | [Breaking?](#def_br) | [Tax years](#def_ty) | [Affects quarterly updates?](#def_aqu) | [Usable in year?](#def_uiy) | [Deploy to Sandbox](#def_dep) |
| --- | --- | --- | --- | --- | --- | --- |
| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/)<br><br>Capital gains tax | Crypto assets  <br>The ability for customers with crypto assets to report these as part of their final declaration. | Yes | 25-26+ | No  | No  | October 2025 |
| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/)<br><br>Capital gains Tax | Capital Gains Tax – new additions being added to the CGT journey to include Unlisted Shares and Securities - missing data items<br><br>Losses and Adjustments - missing data items<br><br>Business Asset Disposal Relief (BADR) - Detailed data capture support around asset types<br><br>Qualifying Asset Holding Company (QAHC) - New Data items | Yes | 25-26+ | No  | No  | October 2025 |
| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/)<br><br>Capital Gains Tax | Capital Gains Tax – two additional data items (claim or election codes and Rtt Tax Paid) to be added to create and amend other capital gains and disposals | Yes | 25-26+ | No  | No  | October 2025 |

### March 2026

These changes are expected to be deployed in March 2026 (to be confirmed).

Version numbers will be added once the scope for the release and the associated release date are confirmed.

| API(s) | Change | [Breaking?](#def_br) | [Tax years](#def_ty) | [Affects quarterly updates?](#def_aqu) | [Usable in year?](#def_uiy) | [Deploy to Sandbox](#def_dep) |
| --- | --- | --- | --- | --- | --- | --- |
| Obligations API (V3) | Align quarterly deadlines – to bring the due date of quarterly updates in line with VAT – 7<sup>th</sup> of each month | No  | 26/27 + | Yes | No  | December 2025 |
| [Property Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/property-business-api/) | Reassert number of rental properties  <br>Expand the property income submission API to allow a customer to reassert their number of rental properties and if they jointly let any of their rental properties for each tax year. | Yes | 25/26+ | No  |     | December 2025 |
|     | Mortgage evidence  <br>HMRC online services will provide a print service of income evidence for customers to use for loan/mortgage applications. It is unclear yet if this will be available through software. | N/A | 25-26+ | N/A | N/A | December 2025 |
| Property API | Foreign Property API – changes required to enhance the journey for multiple foreign properties in the same country. | TBC | 26-27 + | TBC | Yes | December 2025 |
| TBC | Restricting charitable reliefs to UK charities | TBC | TBC | TBC | TBC |     |

## Planned future deliveries

The below table is not comprehensive and other APIs may be impacted by future deliveries.

| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/) | Write offs and remissions - The ability to present to the customer any charge that has been remitted or written off. | TBC | TBC | TBC | TBC | October 2025 |
| --- | --- | --- | --- | --- | --- | --- |
|     | Penalty Reform Notifications ability for a user to view the penalty position through their software. | No  | TBC | TBC | TBC | October 2025 |
| --- | --- | --- | --- | --- | --- | --- |
|     | Calendar quarter enhancement – to align the first quarterly update to starts from 1<sup>st</sup> April. | TBC | TBC | TBC | TBC | December 2025 |
| --- | --- | --- | --- | --- | --- | --- |

## Already released

### September 2025

These changes were deployed in September 2025.

Version numbers will be added once the scope for the release and the associated release date are confirmed.

| API(s) | Change | [Breaking?](#def_br) | [Tax years](#def_ty) | [Affects quarterly updates?](#def_aqu) | [Usable in year?](#def_uiy) | [Deploy to Sandbox](#def_dep) |
| --- | --- | --- | --- | --- | --- | --- |
| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api) (V7 & V8),<br><br>[Individuals Charges](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-charges-api/3.0) (V3) | High Income Child Benefit  <br>Enable self-employed customers with income over £60k to record a HICB liability, so the liability can be included in their tax calculation. | No  | 25-26 | No  | No  | June 2025 |
| [Business Details (MTD)](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/business-details-api/1.0)<br><br>(V2) | Capture and change accounting method – ability for a user to submit their accounting method (Cash or Accruals) and make amendments to it at the end of the year, following this change we will also be removing the data item accounting type will be removed from business details API. | No  | 25/26+ | No  | Yes | June 2025 |
| [Business Details (MTD)](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/business-details-api/1.0)<br><br>(V2) | Capturing Period of Account – ability for the user to submit their period of account at the end of the year | No  | 25-26+ | Yes | Yes | September 2025 |
|     | Non-Aligned Tax payers – this will ensure that users have the ability to report their taxable profits if their period of account is not aligned. | No  | 25-26 but its an end to end process | No  | Yes | June 2025 |
| [Individuals Dividends Income API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-dividends-income-api/2.0) (V2) | Additional Dividend Data – following introduction of new legislation to collect additional dividend data a change will be made to allow the submission of the information. | Yes | 25-26+ | No  | Yes | June 2025 |
| [Individual Savings Account](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-savings-income-api/2.0) (V2) | Amend Savings Account – allowing the functionality for the name of a Savings Account to be amended once created | No  | Not Tax Year Specific | No  | Yes | June 2025 |
| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/7.0) V7 | Negative value – update to ensure the individual calculations API can retrieve negative values for the data item “Total Income Tax and Nics due field. | No  | 22-24 & 25-26 | No  | Yes | June 2025 |
| Individual Calculations V7 | New Regex - New Payroll ID Regex and 35 Character limit for payroll ID field | No  | 25/26 | Yes |     | June 2025 |

### June 2025

These changes were deployed in June 2025.

| API(s) 	| Change 	| [Breaking?](#def_br) 	| [Tax years](#def_ty)	| [Affects quarterly updates?](#def_aqu) 	| [Usable in year?](#def_uiy) 	| [Deploy to Sandbox](#def_dep) 	|
|---	|---	|---	|---	|---	|---	|---	|
| [Business Source Adjustable Summary](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-bsas-api/) (V6 & V7),<br>[Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/) (V7),<br>[Individual Losses](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-losses-api/) (V6),[Property Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/property-business-api/) (V6),<br>[CIS Deductions](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/cis-deductions-api/) (V3),<br>[Individuals Reliefs](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-reliefs-api/) (V2),<br>[Individuals Capital Gains Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-capital-gains-income-api/) (V2),<br>[Individuals Disclosures](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-disclosures-api/) (V2),<br>[Individuals Dividends Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-dividends-income-api/) (V2),<br>[Self-Employment Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-employment-business-api/) (V5),<br>[Individual Charges](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-charges-api/) (V3),<br>[Individual Savings Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-savings-income-api/) (V2),<br>[Individuals Foreign Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-foreign-income-api/) (V2),<br>[Individuals Pensions Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-pensions-income-api/) (V2),<br>[Individuals Insurance Policies Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-insurance-policies-income-api/) (V2),<br>[Individuals Employments Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-employments-income-api/) (V2),<br>[Individuals Other Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-other-income-api/) (V2),<br>[Individuals Expenses](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-expenses-api/) (V3),<br>[Other Deductions](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/other-deductions-api/) (V2),<br>[Individuals State Benefits](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-state-benefits-api/) (V2),<br>[Self Assessment Accounts](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-accounts-api/) (V4), 	| Post-finalisation amendment - enable a customer/agent to make an amendment via software after making their final declaration.A new error message will be returned if a customer attempts to make an amendment outside of the allowed amendment window.Customers will be able to opt out of coding out at the same time as making an amendment. 	| Yes 	| 25/26+ 	| No 	| No 	| March 2025 (deployed)	|
| [Business Source Adjustable Summary](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-bsas-api/) (V3) 	| Nil Fields – the ability for a user to indicate if a nil submission is relevant in the BSAS 	| No 	| 24-25+ 	| No 	| No 	| March 2025 (deployed)	|

### April 2025

These changes were deployed in April 2025.

For customers eligible to claim the Electric Charge Point Allowance for the 25/26 tax year, they should use the “Other Capital Allowance” data item to report this. These are:
 - Create/Amend Self-Employment Annual Submission Period and use data item `enhancedCapitalAllowance`
 - Create/Update Property(Annual) Submission and use data item `otherCapitalAllowance`

Version numbers will be added once the scope for the release and the associated release date are confirmed.

| API(s)                                               | Change                  | [Breaking?](#def_br) | [Tax years](#def_ty) | [Affects quarterly updates?](#def_aqu) | [Usable in year?](#def_uiy) | [Deploy&nbsp;to Sandbox](#def_dep) |
|:-----------------------------------------------------|:------------------------|:---------:|:--------:|:---------------------------------------:|:---------------------------:|:--------------------:|
| All | Multiple agents<br/>Enable a customer's MTD account to be managed by multiple agents (primary and secondary). | N/A | 25&#8209;26+ | N/A | N/A | Oct 2024<br/>(deployed) |
| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api),<br/> [Property Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/property-business-api),<br/> [Self-Employment Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-employment-business-api), [Obligations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/obligations-api) | Cumulative updates<br/>The quarterly update process will be replaced to allow customers to submit data cumulatively. This change will be effective from April 2025. | Yes | 25&#8209;26+ | Yes | Yes | Dec 2024<br/>(deployed) |
| [Property Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/property-business-api),<br/> [Business Source Adjustable Summary](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-bsas-api),<br/> [Self-Employment Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-employment-business-api) | Electric vehicles<br/>Removal of support for claiming first-year allowance for electric vehicle charge-points. | Yes | 25&#8209;26+ | Yes | Yes | Dec 2024<br/>(deployed) |
| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/),<br/>[Individuals Business EOPS](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-business-eops-api/),<br/>[Obligations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/obligations-api/) | EOPS removal<br/>Removal of the ability for a customer to submit EOPS via software. | Yes | All | No | No | Dec 2024<br/>(deployed) |
| [Business Source Adjustable Summary](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-bsas-api/),<br/>[Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/),<br/>[Individual Losses](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-losses-api/),<br/>[Property Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/property-business-api/),<br/>[Business Income Source Summary](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-biss-api/) | FHL removal<br/>Removal of support for furnished holiday lettings tax rules. | Yes | 25&#8209;26+ | Yes | Yes | Dec 2024<br/>(deployed) |
| [Obligations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/obligations-api/) | Managing obligations<br/> Change the way in which periodic obligations are marked as met by a customer from the request of a tax calculation to the submission of cumulative update data. This does not affect the annual obligation which will still be managed by making a final declaration. | TBC | 25&#8209;26+ | Yes | Yes | Dec 2024<br/>(deployed) |
| [HMRC Assist](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-assist/)                                    | HMRC Assist<br/> Providing near real-time feedback to help customers get things right, messages are presented when a tax calculation is called. This API has been developed and will be delivered in 24/25 to support vendor testing of feedback messages.  | TBC | 25&#8209;26+ |                      N/A                      |       Yes        |       Jun 2023<br/>(deployed)      |

### December 2024

These changes were released in December 2024.

| API(s)                                                    | Change               | [Breaking?](#def_br) | [Tax years](#def_ty) | [Affects quarterly updates?](#def_aqu) | [Usable in year?](#def_uiy) | [Deploy&nbsp;to Sandbox](#def_dep) |
|:----------------------------------------------------------|:---------------------|:---------:|:--------:|:---------------------------------------:|:---------------------------:|:--------------------:|
| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api) v6.0,<br/>[Individuals Charges](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-charges-api) v2.0 | Pension lifetime allowance<br/>  Remove the ability for customers to claim pension lifetime allowance  | Yes | 24&#8209;25+ | No | Yes | Sep 2024<br/>(deployed) |
| [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api) v6.0| Scottish Rate<br/> Add a new enum value within tax bands field to accommodate the Scottish Advanced Rate. | Yes | 24&#8209;25+ | No | Yes | Sep 2024<br/>(deployed) |

### September 2024

These changes were released in September 2024.

| API(s) | Change | [Breaking?](#def_br) | [Tax years](#def_ty) | [Affects quarterly updates?](#def_aqu) | [Usable in year?](#def_uiy) | Deployed to Sandbox |
|:-------|:-------|:---------:|:--------:|:---------------------------------------:|:---------------------------:|:--------------------:|
| [Self Assessment Accounts](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-accounts-api/) v3.0 | **Payments on account history**<br/> Enable customers to see a history of the charges to their payments on account through their software. | No | All | No | Yes | Jun 2024 |


### June 2024

These changes were released in June 2024.

| API(s)                                                                                | Change                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | [[Affects quarterly updates?](#def_aqu)](#def_aqu) | [[Usable in year?](#def_uiy)](#def_uiy) | Deployed to&nbsp;Sandbox |
|:--------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------:|:---------------:|:------------------------:|
| [Self-Employment Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-employment-business-api/3.0) v3.0,<br/> [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/5.0) v5.0                        | **Declare transitional profit**<br/> Following basis period reform, allow customers to declare any transitional profit they have.                                                                                                                                                                                                                                                                                                                                      | No                                              | Yes             | Apr 2024                      |
| [Property Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/property-business-api/4.0) v4.0,<br/> [Business Source Adjustable Summary](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-bsas-api/5.0) v5.0, [Individual Calculations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/5.0) v5.0 | **Property expenses**<br/> Allow customers to submit negative expenses for their property income.                                                                                                                                                                                                                                                                                                                                                                      | Yes                                  | Yes             | May 2024                     |
| [Property Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/property-business-api/4.0) v4.0                                                              | **Property income changes**<br/> Introduce data fields enabling customers to submit residential finance costs and brought-forward residential finance costs.                                                                                                                                                                                                                                                                                                               | Yes                                              | Yes             | Apr 2024                     |
| [Self Assessment Individual Details](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-individual-details-api/2.0) v2.0                            | In the event a customer has opted out of MTD, their customer status will change and this can be identified by software.                                                                                                                                                                                                                                                                                                                                               | No                                               | No              | Dec 2023                 |
| [Property Business](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/property-business-api/4.0) v4.0                                                              | This change will allow both consolidated expenses and rent a room relief to be submitted at the same time to support the customer journey of one or more properties.                                                                                                                                                                                                                                                                                                   | Yes                                             | Yes             | Apr 2024                      |
| [Individuals Foreign Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-foreign-income-api/1.0) v1.0,<br/>[Individuals Insurance Policies Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-insurance-policies-income-api/1.0) v1.0,<br/>[Individuals Pensions Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-pensions-income-api/1.0) v1.0,<br/>[Individuals Dividends Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-dividends-income-api/1.0) v1.0,<br/>[Individuals Savings Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-savings-income-api/1.0) v1.0,<br/>[Individuals Capital Gains Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-capital-gains-income-api/1.0) v1.0,<br/>[Individuals Other Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-other-income-api/1.0) v1.0,<br/>[Individuals Employments Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-employments-income-api/1.0) v1.0  | These 8 new APIs are the result of splitting the Individuals Income Received API into smaller APIs. The new APIs will also have these improvements: <ul><li>Removal of HATEOAS links</li><li>Update of enum value names for consistency</li><li>Addition of a new generic error</li></ul> | No  | Yes  | Apr 2024  |


### April 2024

These changes were released in April 2024.

| API(s)                                                                                  | Change                                                                                                                                                                                                                                                                                                                                                                                                                                                              | [Affects quarterly updates?](#def_aqu) | [Usable in year?](#def_uiy) | Deployed to&nbsp;Sandbox |
|:----------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:---------------------------------------------:|:---------------:|:------------------------:|
| Individual Calculations v5.0                                                            | **Update regarding multiple income sources**<br/> The 'other tax taken off trading income' object will be added to this API.                                                                                                                                                                                                                                                                                                                                          | No                                            | Yes             | Sep 2023                 |
| Property Business v3.0,<br/> Self-Employment Business v3.0,<br/> Business Details v1.0  | **Basis period reform**<br/> Customer choice of calendar quarterly period dates. Customers must choose before any updates have been submitted for the tax year. This will be a new endpoint that all software products can support for all MTD customers.                                                                                                                                                                                                             | No                                            | Yes             | Jan 2024                 |
| Individual Calculations v5.0                                                            | **Basic rate divergence**<br/> View the updated basic rate based on changes made to the basic rate by the devolved nations.                                                                                                                                                                                                                                                                                                                                         | No                                            | Yes             | Jan 2024                 |
| Self Assessment Accounts v3.0                                                           | **Self Assessment account data**<br/> Document due date optional rather than required when retrieving Self Assessment balance and transactions.                                                                                                                                                                                                                                                                                                                     | No                                            | Yes             | Dec 2023                 |
| Self Assessment Accounts v3.0                                                           | **Opt out of coding out**<br/> Enable customers to opt out of coding out through their software.                                                                                                                                                                                                                                                                                                                                                                    | No                                            | No              | Feb 2024                 |
| Business Details v1.0                                                                   | The cashOrAccruals field is now mandatory and will return either "true" or "false".                                                                                                                                                                                                                                                                                                                                                                                 | No                                            | Yes             | Dec 2023                 |
| Individual Business EOPS v3.0, Self Assessment BSAS v4.0, Business Details v1.0         | **Stop displaying accounting period dates returned by HMRC**<br/> Software products will need to stop displaying accounting period dates returned by HMRC to the end user. The dates are presented as the standard tax year which may not be applicable to all customers. The API documentation for the affected endpoints will be updated with a warning that the dates should not be displayed. The accounting period dates will be removed in a future update. | N/A                                           | N/A             | N/A                      |
| Obligations v2.0                                                                        | Support for multiple final declarations in the response instead of only one.<br/><br/>New error for a request that does not match any available Gov-Test scenarios in Sandbox data.                                                                                                                                                                                                                                                                                  | N/A                                           | Yes             | May 2023                 |
| CIS Deductions v2.0                                                                     | New error when date range provided exceeds four years before the current year.<br/><br/> fromDate and toDate parameters replaced with a taxYear path parameter.                                                                                                                                                                                                                                                                                                      | N/A                                           | Yes             | Jun 2023                 |

### December 2023

These changes were released in December 2023.

| API(s)                                                                                                                         | Change                                                                                                                                                                                 |  [Affects quarterly updates?](#def_aqu) | [Usable in year?](#def_uiy) | Deployed to&nbsp;Sandbox |
|:-------------------------------------------------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----------------------------------------------:|:------------:|:-----------------------:|
| Individual Calculations v5.0,<br/>Self Assessment Business v3.0,<br/>Self-Employment Business v3.0,<br/>Property Business v3.0 | **Annual updates of business income (self-employment and property)**<br/> This enables customers to make in-year or annual submissions for their self-employment and/or property income in specific scenarios. | No | Yes | Sep 2023 |
| Self-Employment Business v3.0,<br/>Business Source Adjustable Summary v4.0 | **Update regarding self-employment periods**<br/> The data fields within this API will be updated to allow negative values. | No | Yes | Sep 2023 |
| Individual Calculations v5.0,<br/>Individuals Income Received v2.0 | **View cease business income sources**<br/> These changes will enable the customer to see an updated calculation following the cease of a business being reported and multiple business/property sources being added. | No | Yes | Sep 2023 |
| Individual Calculations v5.0 | **Annuity/royalty payments charges** Annuity/royalty payments charges will be calculated to decimal places to include pence. This will be a change to the calculation rules. | No | Yes | Sep 2023 |
| Individual Calculations v5.0 | **State Pension**<br/> To enable the State Pension to be identified within the tax calculation. | No | Yes | Sep 2023 |
| Self Assessment Individual Details v1.0 | **Get ITSA status**<br/> New GET API to source customer ITSA status e.g. MTD Mandated / MTD Voluntary / Annual etc. This status can be used in software design to determine relevant services and content. | No | Yes | Sep 2023 |
| Property Business v3.0 | **Data item no longer required** <br/> Removal of 'losses brought forward' in the annual self-employment/property business API. | Yes | Yes | Jul 2023 |
| Individuals Expenses v2.0,<br/>Individuals Income Received v2.0 | **Adding expenses** <br/> Updates to the occupational pension and employment expenses restricting the submission of benefits In Kind, potentially student loan deductions and employment expenses against that employment. | No | Yes | Sep 2023 |
| Business Details v1.0,<br/>Individual Calculations v5.0 | **Retrieve multiple SE sources** <br/> Ability to view multiple business/property sources that are added outside of software. | No | Yes | Aug 2023 |
| Business Source Adjustable Summary v4.0 | **Error update** <br/> Change to the 404 error message to allow vendors to distinguish the reason for the error. | No | Yes | Nov 2023 |

<a name="def_br"></a>

**Breaking changes**

If "[Breaking?](#def_br)" is "Yes", the change will break software which relies on the API, and will therefore be introduced in a new API version. 

For more details, see the section on [breaking changes](https://developer.service.hmrc.gov.uk/guides/income-tax-mtd-end-to-end-service-guide/documentation/how-to-integrate.html#breaking-changes) in the service guide.

<a name="def_ty"></a>

**Tax years**

"Tax years" means the tax years which are affected by the change. "YY-YY+"" indicates that the change affects tax year YY-YY and all later years.

<a name="def_aqu"></a>

**Affects quarterly updates**

This means that the change directly impacts MTD mandated customers and their submissions of periodic updates.


<a name="def_uiy"></a>

**Usable in year**

This means that the functionality is available during the active tax year to report against. 
For example, transitional profit can be reported during the active tax year.

If "Usable in year?" is "No", the functionality is not available until after the tax year has ended. 
For example, High Income Child Benefit liability cannot be reported until after the tax year has ended.

<a name="def_dep"></a>

**Deploy to Sandbox**

If followed by "(pending)", this is the current target date for the change to be available in Sandbox.

If followed by "(deployed)", this is the date that the change became available in Sandbox.