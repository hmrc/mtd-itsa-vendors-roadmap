# Making Tax Digital ITSA Roadmap 

Last updated: 13 June 2023

## About this roadmap

This roadmap sets out our anticipated schedule for future API releases. It also provides details of releases relating to
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

Keep up to date with changes to the APIs in sandbox and production with our new changelog.

* [ITSA APIs changelog](https://github.com/hmrc/income-tax-mtd-changelog)

### Current endpoint functionality in sandbox and production

Keep up to date with changes to current endpoint functionality in sandbox and production by reviewing
the [Developer Hub API Documentation](https://developer.service.hmrc.gov.uk/api-documentation/docs/api).

## Software Data Submission (third party APIs)

### Current ITSA API functionality

Deployed to Production **April 2023**

|         HMRC Developer Hub API         | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                                                                                                                                           Detail                                                                                                                                                                                                                                           |       Deployed to Sandbox      |
|:--------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:----------------------------------:|
| Individual Calculations (MTD) API v3.0 |                       No                      |                           Yes                           | **Class 2 NICs (Spring Statement)**<br/>  Reduction to Class 2 NICs liabilities to nil on profits between the Small Profits Threshold (SPT) and Lower Profits Threshold (LPT).                                                                                                                                                                                                                                                                                                                       |              Feb 2023              |
|              Various APIs              |                      N/A                      |                           N/A                           | **Tax Year Specific (TYS) APIs**<br/> Movement of the old APIs to new tax year specific APIs which means that software providers and user will need to use the new version of the APIs to report data from 23/24.                                                                                                                                                                                                                                                               | Nov 2022/Jan 2023 |
|              Various APIs              |                      N/A                      |                           N/A                           | **Error status updates**<br/> Change of 403 error status to 400 to make it consistent across all the APIs                                                                                                                                                                                                                                                                                                                                                                                                                |              Feb 2023              |
|              Various APIs              |                      N/A                      |                           N/A                           | **Migration of existing RAML documentation to OAS**<br/>   The new documentation platform to serve old and new API documentation with enhanced experience.                                                                                                                                                                                                                                                                                                                                          |             March 2023             |
|              Various APIs              |                      N/A                      |                           N/A                           | **API changelog**<br/> Switched the API changelog in GitHub from a wiki page to a "readme" file in a Markdown format. The readme file can be viewed at this URL: https://github.com/hmrc/income-tax-mtd-changelog Retained existing links and bookmarks on the wiki page. At the top of the wiki page, a link has been added for the new location, along with a note for the vendors. The new page includes step-by-step instructions on how to subscribe to receive notifications when the changelog is updated. |              Feb 2023              |


Deployed to Production **December 2022**

|          HMRC Developer Hub API          | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                   Detail                                                                                                                  | Deployed to Sandbox |
|:----------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-------------------:|
|  Self Assessment Accounts (MTD) API v1.0 |                       No                      |                            No                           | **Amendments in relation to employment coded out**<br/>   This allows a user with employment income to request that they do not want their self assessment liability coded out for the 21/22 tax year onwards.  New endpoints have also been added. |       Jan 2021      |
|               Various APIs               |                       No                      |                           Yes                           | **API refactoring**<br/> Refactoring of the API which includes repayment, payment information along with manual financial adjustments.                                                                                                                             |       Oct 2022      |
| Individual Calculations (MTD) version 3  |                       No                      |                           Yes                           | **Tax Calculation API**<br/> Refinement of Tax Calculation API by adding a tax year data item and reducing the number of endpoints in response to the software market demand.                                                                                          |       Aug 2022      |
|  Self Assessment Accounts (MTD) API v2.0 |                      Yes                      |                           Yes                           | **Self-Assessment API**<br/> The existing Self Assessment API (Self Employment, Gift Aid and Dividends and Interest) broken down into specific datasets APIs for Self-Employments, Charitable Giving, Interest and Dividends.                                          |       Oct 2022      |
|     Property Business (MTD) API v2.0     |                      Yes                      |                           Yes                           | **Migration of UK property historic data**<br/> The existing UK property historic migration to a microservice i.e. Property Business API. Property historic covers data from 2017 to 2021. The UK property periodic endpoint is for the current and future tax year.                      |       Oct 2022      |


Deployed to Production **April 2022**

|             HMRC Developer Hub API            | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                             Detail                                                                                            | Deployed to Sandbox |
|:---------------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-------------------:|
|        Property Business (MTD) API v2.0       |                      Yes                      |                           Yes                           |**UK Property**<br/> UK Property has been added for tax year 22/23 onwards. This change is required so that both property business types, UK and Foreign can be supported by our systems.                          |       Jan 2022      |
|                                               |                       No                      |                           Yes                           | **Enhancements to allowances**<br/> Enhancement to the endpoints to include structure and building allowances and first year electric charge allowance for 22/23 tax year onwards in relation to Capital Allowances.              |       Jan 2022      |
|                                               |                       No                      |                           Yes                           | **Business validation rules**<br/> Enhancements to the business validation rules for Property & Capital Allowances only                                                                                                          |       Jan 2022      |
|   Business Income Source Summary (MTD) v2.0   |                       No                      |                           Yes                           | **Change to the status of a data item**<br/> New version due to the business ID becoming mandatory.                                                                                                                                        |       Jan 2022      |
|          Individual Losses (MTD) v3.0         |                       No                      |                           Yes                           | **Change to the status of a data item**<br/> New version due to the business ID becoming mandatory.                                                                                                                                        |       Jan 2022      |
| Business Source Adjustable Summary (MTD) v3.0 |                       No                      |                           Yes                           | **Addition of new data fields**<br/> New version due to restructuring and new fields being added.                                                                                                                                  |       Mar 2022      |
| Self-Employment Business v2.0                 |                       No                      |                           Yes                           | **Health and Social Care Levy**<br/>  New calculation information messages to notify software of temporary increase to self-employed National Insurance Contributions (NICs) for the 22/23 tax year.  |         N/A         |



### Future ITSA API deliverables




Scheduled to be deployed to Production **July 2023**


|           HMRC Developer Hub API           | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                                                                                                                                                                                                                                     Detail                                                                                                                                                                                                                                                                                                                                     | Target date for sandbox |
|:------------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------:|
| Individuals Income Received (MTD) API v1.0 |                       No                      |                            No                           | **Off Payroll Working (OPW)**<br/>  This change will allow customers to view an Off Payroll Working marker for each of their employment sources.  It will also allow customers to add or remove the marker where necessary. |         Feb 2023        |
|   Individual Calculations (MTD) API v3.0   |                      N/A                      |                           N/A                           | **Calculation output updates**<br/> Update of business validation calculation error and addition of new objects to the calculation output                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |         Feb 2023        |
|     Individuals Charges (MTD) API v1.0     |                      N/A                      |                           N/A                           | **Pension charges API – correction**<br/>  3 data items - annual allowance reduced, tapered annual allowances and money purchase allowance are to be moved to the pension contributions section that sits in the same API                                                                                                                                                                                                                                                                                                                                                                      |        March 2023       |



Scheduled to be deployed to Production **December 2023** (to be confirmed)

|                                HMRC Developer Hub API                               | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                                                                                                                                  Detail                                                                                                                                                                                                                                  | Target date for sandbox |
|:-----------------------------------------------------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------:|
|                       Self-Employment Business (MTD) API v1.0                       |                       No                      |                           Yes                           | **Annual Updates of Business Income (Self Employment and Property)**<br/> This enables customers to make in-year or annual submissions for their self employment and/or property income in specific scenarios.  |           TBC           |
|						Self-Employment Business (MTD) API v1.0						  |                       No                      |                           Yes                           | **Update regarding multiple income sources**<br/>  The 'other tax taken off trading income' object will be added to this API. |           TBC           |					 
|						Self-Employment Business (MTD) API v1.0						  |                       No                      |                           Yes                           | **Update regarding self employment periods**<br/>  The data fields within this API will be updated to allow negative values. |           TBC           |
| 							Individual Calculations (MTD) API v3.0 				  	  |                       No                      |                           Yes                           | **View cease business income sources**<br/>  These changes will enable the customer to see an updated calculation following the cease of a business being reported and multiple business/property sources being added.  |           TBC           |
| 							Individual Calculations (MTD) API v3.0 					  |                       No                      |                           Yes                           | **Annuity/royalty payments charges** Annuity/royalty payments charges will be calculated to decimal places to include pence. This will be a change to the calculation rules. |           TBC           |
| 							Individual Calculations (MTD) API v3.0 					  |                       No                      |                           Yes                           | **State Pensions**<br/> To enable the state pension to be identified within the tax calculation |           TBC           |
| Self Assessment Individuals Details API 											  |                       No                      |                           Yes                           | **GET ITSA status**<br/>  New GET API to source customer ITSA status e.g. MTD Mandated / MTD Voluntary / Annual etc.  This status can be used in software design to determine relevant services and content. |           TBC           |                                                                                                                                                                                                                                                 |           TBC           |
| Property Business (MTD) API v2.0     												  | Yes 										  | Yes 													| **Data item no longer required** <br/> Removal of ‘losses brought forward’ in the annual self-employment/property business API.                                                                                            | TBC |
| Individuals Expenses (MTD) API v1.0  												  | No  										  | TBC 													| **Adding expenses** <br/> Updates to the occupational pension and employment expenses restricting the submission of benefits In Kind, potentially student loan deductions and employment expenses against that employment. | TBC |
| Business Details (MTD) API           												  |     										  |     													| **Retrieve multiple SE sources** <br/> Ability to view multiple business/property sources that are added outside of software.        | TBC |                                                                                                                                                                                      | TBC |
		


Planned future deliveries


|               HMRC Developer Hub API              | Must be part of legislated quarterly updates? | Can be used in year? |                                                                                                                                                             Detail                                                                                                                                                             |   |
|:-------------------------------------------------:|:---------------------------------------------:|:-------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-:|
| Business Income Source Summary (MTD) API v2.0 |                       No                      |                           Yes                           | **Basic Rate Divergence**<br/> View the updated basic rate based on changes made to the basic rate by the devolved nations. |   
|   Individuals Income Received (MTD) API v1.0  |                       No                      |                           TBC                           | **Asset Holding Company (AHC)**<br/>  3 new data fields on the Capital Gains Tax schedule                                |   
| Business Source Adjustable Summary (MTD) API v3.0 | No | Yes | **Error Code update** from 503 to 422 for the wrong income source type in the path parameter                                           |
| Self Assessment Accounts (MTD) API v2.0           | No | Yes | **Report accounting period start and end dates for self employment** - customers will provide this as part of their end of year return ||          Individual Losses (MTD) API v3.0         |                       No                      |                            No                           | **Carry Back of Losses**<br/>  Enables losses incurred in one tax year to be set off against profits made in previous years, subject to rules.                                                                                                                                                                                          |   |
| Self Assessment Accounts (MTD) API v2.0           |                       No                      |                           Yes                           | **Claim outside of the amendment window**<br/> Enables amendments to be made outside the amendment window                                                                                                                                                                                                                               |   |
|       Individual Calculations (MTD) API v3.0      |                       No                      |                            No                           | **HMRC Corrections (amendments & corrections)**<br/> Ability for HMRC to set correction window following final declaration/crystallisation (typically 12 months)                                                                                                                                                                                          |   |
| Business Source Adjustable Summary (MTD) API v3.0 |                       No                      |                           Yes                           | **Customer Amendments (amendments & corrections)**<br/> Allows amendments to be made to a customer's declared information after the final declaration has been made with an amendment window                                                                                                                                            |   |
|       Individual Calculations (MTD) API v3.0      |                       No                      |                           Yes                           | **ITSA Upload Facility (End of Year Processing)**<br/> To enable software to provide supporting attachments to support ITSA submissions                                                                                                                                                                                                 |   |
|      Self Assessment Accounts (MTD) API v2.0      |                       No                      |                            No                           | **Change accounting method (cash/accruals)**<br/> – customers will provide this as part of their end of year return                                                                                                                                                                                                                     |   |
|          Property Business (MTD) API v2.0         |                       No                      |                            No                           | **Report accounting period start and end dates for property**<br/> – customers will provide this as part of their end of year return                                                                                                                                                                                                   |   |
|          Property Business (MTD) API v2.0         |                       No                      |                            Yes                          | **Managing Obligations**<br/> This delivery will change the way in which obligations are marked as met by a customer from the request of tax calculation to the submission of data. This requires changes to some end points and BVRs. |   |
|      Self Assessment Accounts (MTD) API v2.0      |                       No                      |                            No                           | **Report accounting period start and end dates for self employment**<br/> - customers will provide this as part of their end of year return                                                                                                                                                                                             |   |
|             HMRC Assist				            |                      TBC                      |                           Yes                           | **HMRC Assist**<br/> – providing near real-time feedback to help customers get things right, messages are presented when a tax calculation is called.  |   |
| Individual Losses (MTD) API v3.0 | No | No | **Carry Back of Losses**<br/>  Enables losses incurred in one tax year to be set off against profits made in previous years, subject to rules. | TBC |
| Individual Losses (MTD) API v3.0 | No | Yes | **Claim outside of the amendment window** Enables amendments to be made outside the amendment window | TBC |
| Business Income Source Summary (MTD) API v2.0 and Property Business (MTD) API v2.0 | No | Yes | **Basis Period Reform**<br/> **Customer election for month end ‘calendar quarters’** Customers must elect or withdraw election before any updates have been submitted for the tax year. This will be a new endpoint that all software products must support for all MTD customers | TBC |
|   Individual Calculations (MTD) API v3.0  |                       No                      |                            No                           | **Repayment EOY**<br/> There will be no provision to select an option for repayment in software this will be requested via HMRC online services – discovery will confirm design. Software will have provision to retrieve the repayment status, this will involve creating a new endpoint.  |
|   Individual Calculations (MTD) API v3.0  |                       No                      |                           Yes                           | **Residence and Remittance**<br/> To enable software to support overseas customers with UK income.                                                                                                                                                                                          |
|   Individual Calculations (MTD) API v3.0  |                       No                      |                           Yes                           | **Partner Income**<br/> To enable software to support customers that have income from partnerships.                                                                                                                                                                                         |
|      Property Business (MTD) API v2.0     |                      Yes                      |                           Yes                           | **Reassert number of rental properties**<br/> Expand the property income submission API to allow a customer to reassert their number of rental properties and if they jointly let any of their rental properties for each tax year.                                                         |
|  Self-Employment Business (MTD) API v1.0  |                       No                      |                           Yes                           | **White space**<br/> Support for submitting any other information as per SA return via software and ITSA submission service                                                                                                                                                                 |
| Individuals State Benefits (MTD) API v1.0 |                       No                      |                            No                           | **High Income Child Benefit**<br/> It will enable self employed customers with income over £50k to record a HICB liability, so the liability can be included in their tax calculation.                                                                                                      |
|                    TBC                    |                      TBC                      |                           TBC                           | **Determinations**<br/>  New charge type description for balancing charge – new charge descriptions for the determination charge                                                                                                                                                            |
|                    TBC                    |                      TBC                      |                           TBC                           | **Trust schedule**<br/>  To enable software to support customers that have income from trusts                                                                                                                                                                                               |
|                    TBC                    |                      TBC                      |                           TBC                           | **Three line accounts**<br/> To enable software to support three line accounts                                                                                                                                                                                                              |
|   Individual Calculations (MTD) API v3.0  |                       No                      |                           Yes                           | **Member of Parliament**<br/> To enable software to support Member of Parliament                                                                                                                                                                                         |
|   Individual Calculations (MTD) API v3.0  |                       No                      |                           Yes                           | **Ministers of Religion**<br/>  To enable software to support ministers of religion.                                                                                                                                                                                      |
| Individuals State Benefits (MTD) API v1.0 |                       No                      |                           Yes                           | **Blind Persons Allowance**<br/>  To enable software to support blind persons allowance                                                                                                                                                                                   |
| Individuals State Benefits (MTD) API v1.0 |                       No                      |                           Yes                           | **Married Couples Allowance**<br/>  To enable software to support married couple's allowance                                                                                                                                                                              |
|   Individual Calculations (MTD) API v3.0  |                       No                      |                           Yes                           | **Lloyds Underwriters**<br/>  To enable software to support Lloyd’s underwriters.                                                                                                                                                                                         |
|   Individual Calculations (MTD) API v3.0  |                       No                      |                           Yes                           | **Averaging adjustments and special arrangements**<br/>  To enable software to support averaging adjustments                                                                                                                                                              |
|                    TBC                    |                      TBC                      |                           TBC                           | **ITSA Penalty Reform**<br/>  New endpoints to view penalty points and charges                                                                                                                                                                                            |

## ITSA Submission Service

This is a new self assessment service for customers and their authorised agents to update and submit an income tax return, that will be available in HMRC online services.

Customers in MTD will use this service to report income that is not supported in their software.

* Customers will *not* be able to use this service to send updates for business and property income with quarterly filing obligations.
* Non-MTD customers who are not using software will use this service to file their self assessment tax return once their record has migrated to the new service.

### Current functionality - Update and submit an income tax return

Currently live

| Functionality to report against income type | Can be used in year? | Status |                           Detail                           |
|:-------------------------------------------:|:-------------------------------------------------------:|:------:|:----------------------------------------------------------:|
|                 UK dividends                |                           Yes                           |  Live  | Report UK dividends.                                       |
|                 UK interest                 |                           Yes                           |  Live  | Report UK interest.                                        |
|              Charitable giving              |                           Yes                           |  Live  | Report charitable donations                                |
|            Employments (in year)            |                           Yes                           |  Live  | View employment information.                               |
|              Final Declaration              |                            No                           |  Live  | Finalise a self assessment tax return for a year           |
|          Employments (End of Year)          |                            No                           |  Live  | Amend and/or add new employment details after the year end |
|                Student Loans                |                            No                           | Dec 22 | Report Student Loan information                            |

### Future functionality - Update and submit an income tax return

Planned future deliveries

| Functionality to report against income type | Can be used in year? |                                          Detail                                          |
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
