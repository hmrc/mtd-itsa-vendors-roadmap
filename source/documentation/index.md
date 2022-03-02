
# Making Tax Digital ITSA & VAT Delivery Roadmap Feb 2022

### What this Roadmap tells you
This roadmap sets out our anticipated schedule for future API releases.
It also provides details of releases relating to the service delivered via other mechanisms, such as a User Interface.

**What is a ‘frontend’ API?**

A frontend API is an API that will allow integration of various API endpoints into your software.

**What can it do?**

In ‘Sandbox’ it will allow you to test the experience a customer would have using this functionality by sending back test responses that mimic the real customer environment. It will not work for real customers until the API is in ‘Production’ and HMRC ‘backend’ functionality is available.

**What is the ‘backend’ functionality**

This is the functionality developed in HMRC which allows API endpoints to be integrated into your software to call up a customer’s information (or update a customer’s record) required to complete certain transactions.

This could include, verifying a customer’s details, in which case a request would be sent to HMRC and our ‘backend’ function would check whether the Customers information is correct. This would also be the way customers would send HMRC their updates, through the frontend API in your software, to the backend function in HMRC which would update their records.

**When will the backend functionality be available?**

The ‘backend’ functionality is being developed in parallel with the frontend APIs and their end points. We show on this roadmap when frontend APIs will be available in ‘Sandbox’ or ‘Production’ that can connect to backend functionality.

**What is “Controlled Go Live”?**

Before releasing functionality to all our customers we will conduct testing on it with limited customer numbers. This period is referred to as “controlled go live” or Private Beta.

#### Links to changelogs for Submission APIs
Keep up to date with changes to the APIs in sandbox and production with our new changelogs and get notifications when there are changes by subscribing to the relevant RSS feed using RSS reader.

**For VAT, no future releases are planned but you can check on the status of VAT with these links:**

 * [MTD VAT API changelog](https://github.com/hmrc/vat-api/wiki/Changelog)
 * [RSS feed for MTD VAT changes](https://github.com/hmrc/vat-api/wiki.atom)
 * [ITSA APIs changelog](https://github.com/hmrc/income-tax-mtd-changelog/wiki)

#### Current Endpoint Functionality in Test and Live
Keep up to date with changes to Current Endpoint Functionality in Test and Live by reviewing the [API Documentation](https://developer.service.hmrc.gov.uk/api-documentation/docs/api) on the Developer Hub.

### ITSA Future API Deliverables
Production by **December 2021**

| Function | Must be part of legislated quarterly updates | Can be used in year | Details |
|---	|---	|---	|---	|
|As is interest  	| No | Yes  | This will enhance the view of a customer account to include interest being charged on any outstanding liability or late payment.<br><br> New endpoints will be added to the [Self Assessment Accounts API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-accounts-api/1.0).<br><br> **Target date in Sandbox August 21** |
|Capital Gains Tax  	|  No 	|  Yes 	|  This will allow a customer to report a Capital gain.<br><br> **Target date in Sandbox August 21** 	|
|Marriage Allowance	|  No 	|  Yes 	|  This will enable a customer to transfer unused personal allowance to their spouse or partner.<br><br> **Target date in Sandbox August 21** 	|

### ITSA Future API Deliverables

| Function | Must be part of legislated quarterly updates | Can be used in year | Details |
|---	|---	|---	|---	|
|Property Income API  	| Yes | Yes  | The property endpoints will be moved out of the Self-Assessment API into a new property specific API for 22/23 tax year onwards.<br><br> This change is required so that both property business types, UK and Foreign can be supported by our systems.<br><br> **Target date in Sandbox January 22** |
|Capital Allowances	|  No 	|  Yes 	| Enhancement to existing endpoints to include Structure and Building allowances and First year electric charge allowance.<br><br> **Target date in Sandbox January 22**  	|
|Business Validation Rules 	|  No 	|  Yes 	|  Changes to the business validation rules in the service to support the new income types and functionality that has been delivered.<br><br> **Target date in Sandbox January 22** 	|
|Tax Calculations Version 3 |  No 	|  Yes 	|  Refining Tax Calc API by adding a tax year data item and reducing the number of endpoints in response to the software market demand.<br><br> **Target date in Sandbox August 22** 	|
|Changes to the SA API	  	|  Yes 	|  Yes 	|  The remainder of the SA API (Self Employment, Gift Aid and Dividends and Interest) will be moved into our new domain model.<br><br> **Target date in Sandbox August 22** 	|
|Employment coded out |  No 	|  No 	| This will allow a customer with employment income to request that they do not want their self assessment liability coded out. They can also request a debt from a previous year to be coded out.<br><br>New endpoints have been added to the [Self Assessment Accounts API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-accounts-api/1.0). <br><br> **Target date in Sandbox August 22**	|


### ITSA Future Deliverables - Delivery dates to be confirmed

| Function | Must be part of legislated quarterly updates | Can be used in year | Details |
|---	|---	|---	|---	|
| Post crystallisation amendments | No | No | Allows a customer to make a change to their return after they have finalised that year.
| Residence and remittance basis  	| No | Yes  | To enable software to support overseas customers with UK income. |
| Trust Income	|  No 	|  Yes 	| To enable software to support customers that have income from a Trust.  	|
| Partner Income (SA104)  	|  No 	|  Yes 	|  To enable software to support customers that have income from partnership.	|
| Carry back of losses |  No |  No | To enable customers to be able to claim to carry back losses via a software product.|
| Allowance: Blind persons, married couples  |  No |  Yes | To enable the submission service to support Allowance: Blind persons, marriage & married couples.
| Ministers of Religion | No  |  Yes | To enable submission service to support Ministers of Religion.
| Lloyd's Underwriters  | No  |  Yes | To enable submission service to support Lloyd's Underwriters.
| Changing accounting period  | No  | Yes  | To enable customers to change their accounting period digitally (Note, discovery session with external vendors took place 5th May 2021.)
| MPs |  No | Yes  | To allow MPs that have trade or property income to be able to interact with MTD.
| High Income Child benefit | No  | Yes  | To allow customers who are required to pay the High Income Child Benefit Charge to interact with HMRC.
| Averaging adjustments & special arrangements | No| Yes | To cater for customers that have averaging adjustments or claim carer's relief.
| Partnerships | No | Yes | To enable software to support Partnerships.
| HMRC assist (transactional risking) | Yes | Yes | Providing near real-time feedback to help customers to get things right.

### ITSA submission service
Planned deliveries

| Function | Must be part of legislated quarterly updates | Can be used in year | Status | Details |
|---	|---	|---	|---	|---	|
| UK dividends | No | Yes | Live | The ability to report UK dividends.
| UK interest | No | Yes | Live | The ability to report UK interest.
| Charitable giving | No | Yes | Live | The ability to report any charitable donations made.
| Employments (in year) | No | Yes | December 2021 | The ability to view employment information.
| Employments (end of year) | No | No | April 2022 | The ability to report, amend and/or add new employment details.
| Crystallisation | No | No | April 2022 | The ability to crystallise/complete the final declaration for a given tax year.

### Control List Sign Up Guide
Items shown in **Bold** are mandated income types

|Income Type / Control List Restriction | Earliest Tax Year Supported via API | Service supports customer sign up | Customer can sign up via handholding | Control list/eligibility restriction lifted
|---	|---	|---	|--- |---
|**Self Employment** | 2019/20 | Yes  | Yes | Yes
|**UK Property**| 2019/20| Yes| Yes | Yes
|**Foreign (including Foreign Property)**| 2021/22| Yes| Yes | No
|**Multiple Self Employment** |2020/21 | Yes | Yes | No
|UK Interest| 2020/21| Yes | Yes | Yes
|UK Dividends| 2020/21| Yes |Yes | Yes
|Gift Aid| 2020/21| Yes | Yes | Yes
|Employment| 2021/22| Yes | Yes | No
|CIS Deductions| 2020/21| Yes|Yes| No
|Pension Contributions (including charges & reliefs) | 2020/21| Yes|Yes| No
|SA Additional Income | 2021/22| Yes|Yes| No
|Pension Income (including State Pension) | 2021/22| Yes| Yes| No
|Voluntary Class 2 NICs | 2021/22| Yes| Yes | No
|Student Loans| 2020/21| Yes | Yes | No


### Business and non-business datasets
|  Mandated Business Datasets 	|   Non-Mandated Datasets	|
|---	|---
| SA103 -Self-employment schedule| SA102 -Employment |
|Multiple SA103 self-employment schedules | SA102M -Minister of religion|
| SA105 -Property income| SA103L -Lloyds underwriter|
| Foreign Property Income|SA108 -Capital gains |
| Class 2 National Insurance Contributions (Needed for business customers but not business income as such)| SA109 -Residence, remittance etc|
| Averaging Adjustment (farmers, market gardeners, creators of literary or artistic works)|SA101 - Additional information |
| Foster carers| SA107 –Trusts|
| Losses|SA106 –Foreign |
| |SA104S -Short partnership |
| |SA104F -Full partnership |
| | Gift Aid|
| | UK Interest|
| | UK Dividends|
| | Student loans|
|  |  Marriage allowance|
|  | Blind person's allowance |
|  | High income child benefit |
|  | Pension income |
|  | CIS |


We would welcome your feedback to improve our roadmap further.

Please feel free to contact us : sdsteam@hmrc.gov.uk
