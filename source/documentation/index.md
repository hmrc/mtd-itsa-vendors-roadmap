# Income Tax (Making Tax Digital) Roadmap 

Last updated: 25 January 2023

## About this roadmap

This roadmap sets out our anticipated schedule for future releases for Income Tax (Making Tax Digital) APIs. It also provides details of releases relating to
the service delivered via other mechanisms, such as a User Interface.

**What is a front end API?**

A front end API is an API that will allow integration of various API endpoints into your software.

**What can it do?**

In the 'sandbox' it will allow you to test the experience a customer would have using this functionality by sending back
test responses that mimic the real customer environment. It will not work for real customers until the API is in
production and HMRC back end functionality is available.

**What is the back end functionality?**

This is the functionality developed in HMRC which allows API endpoints to be integrated into your software to call a
customer's information (or update a customer's record) required to complete certain transactions. This could include verifying a customer's details, in which case a request would be sent to HMRC and our back end
functionality would check whether the customer information is correct. This would also be the way customers would send
HMRC their updates, through the frontend API in your software, to the back end function in HMRC which would update their
record.

**When will the back end functionality be available?**

The back end functionality is being developed in parallel with the front end APIs and their end points. We show on
this roadmap when front end APIs will be available in sandbox or production that can connect to back end
functionality.

**What is controlled go-live?**

Before releasing functionality to all our customers we will conduct testing with limited customers. This period is
referred to as 'controlled go-live' or private beta.

### Link to changelog for submission APIs

Details of ongoing changes to the APIs in sandbox and production are available at the changelog:

* [Income Tax MTD changelog](https://github.com/hmrc/income-tax-mtd-changelog)

Note that the date of changelog entries is the date that the API change was deployed (either to sandbox or production as described in the entry).


### Current endpoint functionality in sandbox and production

Keep up to date with changes to current endpoint functionality in sandbox and production by reviewing
the [Developer Hub API Documentation](https://developer.service.hmrc.gov.uk/api-documentation/docs/api?filter=income-tax-mtd).

## Software Data Submission (third party APIs)

### Current Income Tax API functionality


Deployed to Production **July 2023**


|           API(s) impacted by change           | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                                                                                                                                                                                                                                     Change                                                                                                                                                                                                                                                                                                                                     | Deployed to Sandbox |
|:------------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------:|
| Individuals Income Received  v1.0 |                       No                      |                            No                           | **Off Payroll Working (OPW)**<br/>  This change will allow customers to view an Off Payroll Working marker for each of their employment sources.  It will also allow customers to add or remove the marker where necessary. |         Feb 2023        |
|   Individual Calculations  v4.0   |                      N/A                      |                           N/A                           | **Calculation output updates**<br/> Update of business validation calculation error and addition of new objects to the calculation output                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |         Feb 2023        |
|     Individuals Charges  v2.0     |                      N/A                      |                           N/A                           | **Pension charges**<br/>  3 data items - annual allowance reduced, tapered annual allowances and money purchase allowance are to be moved to the pension contributions section that sits in the same API                                                                                                                                                                                                                                                                                                                                                                      |        Mar 2023       |


Deployed to Production **April 2023**

|         API(s) impacted by change         | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                                                                                                                                           Change                                                                                                                                                                                                                                           |       Deployed to Sandbox      |
|:--------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:----------------------------------:|
| Individual Calculations  v3.0 |                       No                      |                           Yes                           | **Class 2 NICs (Spring Statement)**<br/>  Reduction to Class 2 NICs liabilities to nil on profits between the Small Profits Threshold (SPT) and Lower Profits Threshold (LPT).                                                                                                                                                                                                                                                                                                                       |              Feb 2023              |
|              Various APIs              |                      N/A                      |                           N/A                           | **Tax Year Specific (TYS) APIs**<br/> Movement of the old APIs to new tax year specific APIs which means that software providers and user will need to use the new version of the APIs to report data from 23/24.                                                                                                                                                                                                                                                               | Nov 2022/Jan 2023 |
|              Various APIs              |                      N/A                      |                           N/A                           | **Error status updates**<br/> Change of 403 error status to 400 to make it consistent across all the APIs                                                                                                                                                                                                                                                                                                                                                                                                                |              Feb 2023              |
|              Various APIs              |                      N/A                      |                           N/A                           | **Migration of existing RAML documentation to OAS**<br/>   The new documentation platform to serve old and new API documentation with enhanced experience.                                                                                                                                                                                                                                                                                                                                          |             Mar 2023             |
|              Various APIs              |                      N/A                      |                           N/A                           | **API changelog**<br/> Switched the API changelog in GitHub from a wiki page to a "readme" file in a Markdown format. The readme file can be viewed at this URL: https://github.com/hmrc/income-tax-mtd-changelog Retained existing links and bookmarks on the wiki page. At the top of the wiki page, a link has been added for the new location, along with a note for the vendors. The new page includes step-by-step instructions on how to subscribe to receive notifications when the changelog is updated. |              Feb 2023              |

Deployed to Production **December 2023**

|                                API(s) impacted by change                               | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                                                                                                                                  Change                                                                                                                                                                                                                                  | Deployed to Sandbox |
|:-----------------------------------------------------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------:|
|                       Individual Calculations v5.0,<br/>Self Assessment Business v3.0,<br/>Self Employment Business v3.0,<br/>Property Business v3.0|                       No                      |                           Yes                           | **Annual Updates of Business Income (Self Employment and Property)**<br/> This enables customers to make in-year or annual submissions for their self employment and/or property income in specific scenarios.  |           Sep 2023           |
|						Self-Employment Business v3.0,<br/>Business Source Adjustable Summary v4.0						  |                       No                      |                           Yes                           | **Update regarding self employment periods**<br/>  The data fields within this API will be updated to allow negative values. |           Sep 2023           |
| 							Individual Calculations v5.0,<br/>Individuals Income Received v2.0				  	  |                       No                      |                           Yes                           | **View cease business income sources**<br/>  These changes will enable the customer to see an updated calculation following the cease of a business being reported and multiple business/property sources being added.  |           Sep 2023           |
| 							Individual Calculations v5.0 					  |                       No                      |                           Yes                           | **Annuity/royalty payments charges** Annuity/royalty payments charges will be calculated to decimal places to include pence. This will be a change to the calculation rules. |           Sep 2023           |
| 							Individual Calculations v5.0 					  |                       No                      |                           Yes                           | **State Pensions**<br/> To enable the state pension to be identified within the tax calculation. |           Sep 2023           |
| Self Assessment Individual Details v1.0											  |                       No                      |                           Yes                           | **Get ITSA status**<br/>  New GET API to source customer ITSA status e.g. MTD Mandated / MTD Voluntary / Annual etc.  This status can be used in software design to determine relevant services and content. |           Sep 2023          |                                                                                                                                                                                                                                                 |           TBC           |
| Property Business v3.0     												  | Yes 										  | Yes 													| **Data item no longer required** <br/> Removal of ‘losses brought forward’ in the annual self-employment/property business API.                                                                                            | Jul 2023 |
| Individuals Expenses v2.0,<br/>Individuals Income Received v2.0												  | No  										  | Yes 													| **Adding expenses** <br/> Updates to the occupational pension and employment expenses restricting the submission of benefits In Kind, potentially student loan deductions and employment expenses against that employment. | Sep 2023 |
| Business Details v1.0,<br/>Individual Calculations v5.0 						| No | Yes | **Retrieve multiple SE sources** <br/> Ability to view multiple business/property sources that are added outside of software. | Aug 2023 |
| Business Source Adjustable Summary v4.0 | No | Yes | **Error update** <br/> Change to the 404 error message to allow vendors to distinguish the reason for the error. | Nov 2023 |  |	


### Future Income Tax API deliverables




Scheduled to be deployed to Production **April 2024** (to be confirmed)

|                                API(s) impacted by change                               | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                                                                                                                                  Change                                                                                                                                                                                                                                  | Deployed to Sandbox |
|:-----------------------------------------------------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------:|
| Individual Calculations                 |    No   | Yes  | **Update regarding multiple income sources**<br/> The ‘other tax taken off trading income’ object will be added to this API. | Sep 2023 |
| Property Business, Self Employment Business, Business Details |                       No                      |          Yes         |     **Basis Period Reform**<br/> Customer choice of quarterly period dates. Customers must choose or withdraw choice before any updates have been submitted for the tax year. This will be a new endpoint that all software products must support for all MTD customers.    |         Jan 2024        |
| Individual Calculations    |                       No                      |          Yes         |                                                                               **Basic Rate Divergence**<br/> View the updated basic rate based on changes made to the basic rate by the devolved nations.                                                                              |         Jan 2024         |
| Self Assessment Accounts   |					No 							| 			Yes 		| **Self Assessment account data**<br/> Document due date optional rather than required when retrieving Self Assessment balance and transactions.   | Dec 2023 |
| Self Assessment Accounts  | No	| No	| **Opt out of coding out**<br/>  Enable customers to opt out of coding out through their software.| Feb 2024 |
| Self Assessment Accounts | No	| Yes |	The cashOrAccruals field is now mandatory and will return either "true" or "false".	| Dec 2023 |
| Individual Business EOPS, Self Assessment BSAS, Business Details | N/A | N/A | **Stop displaying accounting period dates returned by HMRC**<br/> Software products will need to stop displaying accounting period dates returned by HMRC to the end user.  The dates are presented as the standard tax year which may not be applicable to all customers. The API documentation for the affected endpoints will be updated with a warning that the dates should not be displayed. The accounting period dates will be removed in a future update. | TBC |
| Obligations | N/A | Yes | Support for multiple final declarations in the response instead of only one. | May 2023 |
| Obligations | N/A | Yes | New error for a request that does not match any available Gov-Test scenarios in Sandbox data. | May 2023 |
| CIS Deductions |	N/A	| Yes |	New error when date range provided exceeds four years before the current year. |	June 2023 |
| CIS Deductions |	N/A	| Yes |	fromDate and toDate parameters replaced with a taxYear path parameter. |	June 2023 |

Scheduled to be deployed to Production **June 2024**

| API(s) impacted by change           | Must be part of legislated quarterly updates? | Can be used in year? |                                                    Change                                                       | Deployed to Sandbox |
|:-------------------------------------:|:---------------------------------------------:|:---------------------:|:-------------------------------------------------------------------------------------------------------------------------------------:|:---------------------:|
| Self Employment Business         | No                                          | Yes                 | **Declare Transitional Profit**<br/> Following basis period reform, allow customers to declare any transitional profit they have. | TBC                 |
| Property Business              | Yes                                         | Yes                 | **Property Expenses**<br/> Allow customers to submit negative expenses for their property income.                  | TBC                 |
| Self Assessment Accounts            | No                                          | Yes                 | **Review and Recalculate Adjusted Payments on Account (POA)**<br/> Enable customers to see a history of the changes to their Payments on Account through their software. | TBC                 |
| Property Business              | Yes                                         | Yes                 | **Property Income Changes** Introduce data fields enabling customers to submit residential finance costs and brought-forward residential finance costs. | TBC                 |

Scheduled to be deployed to Production **September 2024**

| API(s) impacted by change           | Must be part of legislated quarterly updates? | Can be used in year? |   Change  | Deployed to Sandbox |
|:-------------------------------------:|:---------------------------------------------:|:---------------------:|:-------------------------------------------------------------------------------------------------------------------------------------:|:---------------------:|
| Obligations,<br/> Self Employment Business,<br/> Property Business   | Yes | Yes | **Cumulative updates**<br/> The ability for MTD to change the reporting approach for periodic updates of business income.                                                                                            | TBC  |
|     Individual Calculations                      |                       No                      |          No          |                                                   **High Income Child Benefit**<br/> Enable self-employed customers with income over £50k to record a HICB liability, so the liability can be included in their tax calculation.                                                   |      TBC                |
|     Obligations |                    Yes                      |          Yes         |                         **Managing Obligations**<br/> This delivery will change the way in which obligations are marked as met by a customer from the request of tax calculation to the submission of data. This requires changes to some end points and BVRs. Allows customers to submit their quarterly update information up to 10 days in advance of the quarter end date.   |        TBC              |
| Self Assessment Individual Details |	No	| No | Enables customers to opt back in to MTD digitally	| TBC |
 
#### Planned future deliveries

The below table is not comprehensive and other APIs may be impacted by future deliveries. Version numbers for the APIs will be added once a release date has been confirmed.


|                              API(s) impacted by change                               | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                                       Change                                                                                                                                      | Deployed to Sandbox |
|:----------------------------------------------------------------------------------:|:---------------------------------------------:|:--------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-------------------:|
|                                     HMRC Assist                                    |                      N/A                      |          Yes         |              **HMRC Assist**<br/> Providing near real-time feedback to help customers get things right, messages are presented when a tax calculation is called. This API has been developed and will be delivered in 24/25 to support vendor testing of feedback messages             |      Jun 2023      |
|                          Property Business                            |                       No                      |          No          |                                                                          **Report accounting period start and end dates for property** – customers will provide this as part of their end of year return                                                                          |          TBC            |
|                          Property Business                            |                      Yes                      |          Yes         |                           **Reassert number of rental properties**<br/> Expand the property income submission API to allow a customer to reassert their number of rental properties and if they jointly let any of their rental properties for each tax year.                          |       TBC               |
|                     Individuals Income Received                      |                       No                      |          TBC         |                                                                                              **Asset Holding Company (AHC)**<br/> 3 new data fields on the Capital Gains Tax schedule                                                                                             |       TBC               |
|                  Individual Calculations                  |                       No                      |          No         |                                            **Customer Amendments (amendments & corrections)**<br/> Allows amendments to be made to a customer’s declared information after the final declaration has been made with an amendment window                                           |          TBC            |
|                       Self Assessment Accounts                        |                       No                      |          Yes         |                                                                                          **Claim outside of the amendment window**<br/> Enables amendments to be made outside the amendment window                                                                                         |           TBC           |
|                       Self Assessment Accounts                        |                       No                      |          No          |                                                                                     **Change accounting method (cash/accruals)** - customers will provide this as part of their end of year return                                                                                    |            TBC          |
|                          Individual Losses                            |                       No                      |          No          |                                                                        **Carry Back of Losses**<br/> Enables losses incurred in one tax year to be set off against profits made in previous years, subject to rules.                                                                       |           TBC           |
|                          Individual Losses                           |                       No                      |          Yes         |                                                                                          **Claim outside of the amendment window**<br/> Enables amendments to be made outside the amendment window                                                                                         |     TBC                 |
|                       Individual Calculations                        |                       No                      |          No          | **Repayment EOY**<br/> There will be no provision to select an option for repayment in software this will be requested via HMRC online services – discovery will confirm design. Software will have provision to retrieve the repayment status, this will involve creating a new endpoint. |     TBC                 |
|                       Individual Calculations                         |                       No                      |          Yes         |                                                                                             **Residence and Remittance**<br/> To enable software to support overseas customers with UK income.                                                                                             |     TBC                 |
|                       Individual Calculations                         |                       No                      |          Yes         |                                                                                             **Partner Income**<br/> To enable software to support customers that have income from partnerships.                                                                                            |     TBC                 |
|                       Individual Calculations                         |                       No                      |          No          |                                                              **HMRC Corrections (amendments & corrections)**<br/> Ability for HMRC to set correction window following final declaration/crystallisation (typically 12 months)                                                              |      TBC                |
|                       Individual Calculations                         |                       No                      |          Yes         |                                                                           **ITSA Upload Facility (End of Year Processing)**<br/> To enable software to provide supporting attachments to support ITSA submissions                                                                          |      TBC                |
|                       Individual Calculations                         |                       No                      |          Yes         |                                                                                                      **Lloyds Underwriters**<br/> To enable software to support Lloyd’s underwriters.                                                                                                      |      TBC                |
|                       Individual Calculations                         |                       No                      |          Yes         |                                                                                         **Averaging adjustments and special arrangements**<br/> To enable software to support averaging adjustments                                                                                        |      TBC                |
|                       Individual Calculations                        |                       No                      |          Yes         |                                                                                                      **Member of Parliament**<br/> To enable software to support Member of Parliament                                                                                                      |      TBC                |
|                       Individual Calculations                         |                       No                      |          Yes         |                                                                                                     **Ministers of Religion**<br/> To enable software to support ministers of religion.                                                                                                    |      TBC                |
|                       Self-Employment Business                        |                       No                      |          Yes         |                                                                                 **White space**<br/> Support for submitting any other information as per SA return via software and ITSA submission service                                                                                |      TBC                |
|                      Individuals State Benefits                       |                       No                      |          Yes         |                                                                                                   **Blind Persons Allowance**<br/> To enable software to support blind persons allowance                                                                                                   |      TBC                |
|                      Individuals State Benefits                       |                       No                      |          Yes         |                                                                                                 **Married Couples Allowance**<br/> To enable software to support married couple’s allowance                                                                                                |      TBC                |
|                                         TBC                                        |                      TBC                      |          TBC         |                                                                                                        **ITSA Penalty Reform**<br/> New endpoints to view penalty points and charges                                                                                                       |      TBC                |
|                                         TBC                                        |                      TBC                      |          TBC         |                                                                               **Determinations**<br/> New charge type description for balancing charge – new charge descriptions for the determination charge                                                                              |      TBC                |
|                                         TBC                                        |                      TBC                      |          TBC         |                                                                                                **Trust schedule**<br/> To enable software to support customers that have income from trusts                                                                                                |       TBC               |
|                                         TBC                                        |                      TBC                      |          TBC         |                                                                                                       **Three line accounts**<br/> To enable software to support three line accounts                                                                                                       |       TBC               |
| Individuals Business,<br/> End of Period Statement             | N/A | N/A | **Removing EOPs**<br/> The ability for MTD to remove End of Period Statement obligation from the customer journey.                                                                                                  | N/A  |
| EOPS,<br/> Business Source Adjustable Summary,<br/> Business Details | N/A | N/A | **Basis Period Reform enhancements**<br/> Changes to remove reference to accounting periods across the HMRC estate.                                                                                                 | TBC  |
| Self Assessment Accounts                                 | No  | Yes | **Transfer of credit**<br/> Changes will be made to what charges a customer will be able to view.                                                                                                                    | TBC  |
| Individual Calculation                                   | No  | Yes | **Student loan plan**<br/> A new item will be present on the calculation.                                                                                                                                             | TBC  |
| TBC                                                      | No  | TBC | **Mortgage evidence**<br/> HMRC online services will provide a print service of income evidence for customers to use for loan/mortgage applications.  It is unclear yet if this will be available through software. | TBC  |
| Individuals Income Received                              | No  | No  | **Enhancement to Capital Gains Tax**<br/> This will deliver additional data items to support customers submitting capital gains.                                                                                    | TBC  |
| Individual Reliefs                                       | N/A | N/A | **Withdrawal of Social Investment Tax Relief**<br/> Removal of Social Investment Tax Relief data items.                                                                                                              | TBC  |
| Property Business                                        | Yes | Yes | **Joint property**<br/> Changes to provide an easement for joint property owners in MTD.                                                                                                                           | TBC  |
| Individual Calculations                                  | No  | Yes | **Overseas customers**<br/> This will allow ITSA UK customers who live abroad to submit their income through MTD.                                                                                                | TBC  |
| Self Assessment Accounts                                 | No  | Yes | **Accounting visualisation enhancements**<br/> The ability for a customer to view a more intuitive version of their accounting view through their software.                                                          | TBC  |
| Individual Calculations | No | Yes | **Crypto assets**<br/> The ability for customers with crypto assets to report these as part of their final declaration | TBC |


## ITSA Submission Service

This is a new Income Tax self assessment service for customers and their authorised agents to update and submit an income tax return, that will be available in HMRC online services.

Customers in MTD will use this service to report income that is not supported in their software.

* Customers will *not* be able to use this service to send updates for business and property income with quarterly filing obligations.
* Non-MTD customers who are not using software will use this service to file their self assessment tax return once their record has migrated to the new service.

### Current functionality - Update and submit an income tax return

Currently live

| Functionality to report against income type | Can be used in year? | Status |                           Change                           |
|:-------------------------------------------:|:-------------------------------------------------------:|:------:|:----------------------------------------------------------:|
|                 UK dividends                |                           Yes                           |  Live  | Report UK dividends.                                       |
|                 UK interest                 |                           Yes                           |  Live  | Report UK interest.                                        |
|              Charitable giving              |                           Yes                           |  Live  | Report charitable donations                                |
|            Employments (in year)            |                           Yes                           |  Live  | View employment information.                               |
|              Final Declaration              |                            No                           |  Live  | Finalise a self assessment tax return for a year           |
|          Employments (End of Year)          |                            No                           |  Live  | Amend and/or add new employment details after the year end |
|                Student Loans                |                            No                           | Live | Report Student Loan information                            |

### Future functionality - Update and submit an income tax return

Planned future deliveries

| Functionality to report against income type | Can be used in year? |                                          Change                                          |
|:-------------------------------------------:|:-------------------------------------------------------:|:----------------------------------------------------------------------------------------:|
|              Tailor your Return             |                           Yes                           | Tailor an end of year return to ensure customers submit all income subject to income tax |
|                     CIS                     |                           Yes                           | Report Construction Industry Scheme                                                      |
|                   Pensions                  |                           Yes                           | Report pensions                                                                          |
|            Additional information           |                           Yes                           | Report Additional Information Part 1                                                     |
|               State Benefits                |                           Yes                           | Report State Benefits                                                                    |
|              Capital Gains Tax              |                           Yes                           | Report Capital Gains Tax                                                                                                                                                                            |
|               Self-Employment               |                           Yes                           | Report Self Employment                                                                                                                                                                              |
|               Property Income               |                           Yes                           | Report Property Income                                                                                                                                                                              |
|                Foreign Income               |                           Yes                           | Report Foreign Income                                                                                                                                                                               |
|             Off Payroll Working             |                           Yes                           | View Off Payroll Working (OPW) marker after year end and offer customer the option to add/remove and submit to HMRC.  A warning message will be displayed to the customer if the marker is amended. |
|       Post Final Declaration (Crystallisation) Amendments       |                           Yes                           | Amend self assessment tax return           |
|               Partner Income                |                           Yes                           | Report Partner Income                      |
|          High Income Child Benefit          |                           Yes                           | Report High Income Child Benefit           |
|                 Trust Income                |                           Yes                           | Report income from a Trust                 |
|            Additional Information           |                           Yes                           | Report Additional Information Part 2       |
|           Residence and Remittance          |                           Yes                           | Support overseas customers with UK income. |
|             Members of Parliament              |                           Yes                           | Report MP income                                    |
|              Ministers of Religion             |                           Yes                           | Report Ministers of Religion Income                 |
|             Blind Persons Allowance            |                           Yes                           | Claim Blind Persons Allowance                       |
|               Lloyds Underwriters              |                           Yes                           | Report income from funds at Lloyd's                 |
|           Married Couples Allowance            |                           Yes                           | Claim married couples allowance                     |
|               Marriage Allowance               |                           Yes                           | Claim Marriage Allowance                            |
| Averaging adjustments and special arrangements |                           Yes                           | Report averaging adjustments & special arrangements |
|              Carry back of losses              |                           Yes                           | Carry back losses from previous tax years           |
| Gift Aid budget changes | Yes | Implement any devolved administration gift aid threshold changes into UI|
| Insolvency | Yes | Report Insolvency |
| Cessation of Income | Yes | Report cessation of income |
| Cash Accounting vs Traditional Accounting | Yes | Report use of cash accounting or traditional accounting |
| Coding out  | Yes | Present and transfer an underpayment                  |
| Autocoding  | Yes | Report and amend non-PAYE income, reliefs or expenses |



## APIs required for each stage of development of a Minimum Functionality Standard (MFS) product

Mandatory APIs are denoted by X.

<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
.tg .tg-c3ow{border-color:inherit;text-align:center;vertical-align:top}
.tg .tg-0pky{border-color:inherit;text-align:left;vertical-align:top}
</style>
<table class="tg">
<thead>
  <tr>
    <th class="tg-c3ow">API Name</th>
    <th class="tg-c3ow" colspan="3">Required at each stage for Self Assessment full product (MFS)</th>
    <th class="tg-c3ow" colspan="3">Required at each stage for Property full product (MFS)</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0pky">Stage in the Customer Journey</td>
    <td class="tg-c3ow">In-year</td>
    <td class="tg-c3ow">End of Year</td>
    <td class="tg-c3ow">Final Declaration</td>
    <td class="tg-c3ow">In-year</td>
    <td class="tg-c3ow">End of Year</td>
    <td class="tg-c3ow">Final Declaration</td>
  </tr>
  <tr>
    <td class="tg-0pky">Business Details (MTD)</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
  </tr>
  <tr>
    <td class="tg-0pky">Business Income Source Summary (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
  </tr>
  <tr>
    <td class="tg-0pky">Business Source Adjustable Summary (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
  </tr>
  <tr>
    <td class="tg-0pky">CIS Deductions (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
  </tr>
  <tr>
    <td class="tg-0pky">Individual Calculations (MTD)</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
  </tr>
  <tr>
    <td class="tg-0pky">Individual Losses (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
  </tr>
  <tr>
    <td class="tg-0pky">Individuals Business End of Period Statement (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
  </tr>
  <tr>
    <td class="tg-0pky">Individual Charges (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
  </tr>
  <tr>
    <td class="tg-0pky">Individual Disclosures (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
  </tr>
  <tr>
    <td class="tg-0pky">Individual Expenses (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
  </tr>
  <tr>
    <td class="tg-0pky">Individual Income Received (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
  </tr>
  <tr>
    <td class="tg-0pky">Individual Reliefs (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
  </tr>
  <tr>
    <td class="tg-0pky">Individual State Benefits (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
  </tr>
  <tr>
    <td class="tg-0pky">Obligations (MTD)</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
  </tr>
  <tr>
    <td class="tg-0pky">Other Deductions (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
  </tr>
  <tr>
    <td class="tg-0pky">Property Business (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
  </tr>
  <tr>
    <td class="tg-0pky">Self Employment Business (MTD)</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky">X</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
  </tr>
  <tr>
    <td class="tg-0pky">Self Assessment Accounts (MTD)</td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
    <td class="tg-0pky"> </td>
  </tr>
</tbody>
</table>

We would welcome your feedback to improve our roadmap further.

Please feel free to contact us: sdsteam@hmrc.gov.uk
