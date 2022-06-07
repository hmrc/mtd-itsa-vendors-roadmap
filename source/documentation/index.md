# Making Tax Digital ITSA & VAT Delivery Roadmap Feb 2022

## What this Roadmap tells you

This roadmap sets out our anticipated schedule for future API releases. It also provides details of releases relating to
the service delivered via other mechanisms, such as a User Interface.

**What is a 'front end' API?**

A 'front end API' is an API that will allow integration of various API endpoints into your software.

**What can it do?**

In 'sandbox' it will allow you to test the experience a customer would have using this functionality by sending back
test responses that mimic the real customer environment. It will not work for real customers until the API is in '
production' and HMRC 'back end functionality' is available.

**What is the 'back end' functionality**

This is the functionality developed in HMRC which allows API endpoints to be integrated into your software to call a
customer's information (or update a customer's record) required to complete certain transactions.

This could include verifying a customer's details, in which case a request would be sent to HMRC and our 'back end
functionality' would check whether the customer information is correct. This would also be the way customers would send
HMRC their updates, through the frontend API in your software, to the back end function in HMRC which would update their
record.

**When will the back end functionality be available?**

The 'back end functionality' is being developed in parallel with the 'front end APIs' and their end points. We show on
this roadmap when front end APIs will be available in 'sandbox' or 'production' that can connect to back end
functionality.

**What is 'controlled go-live'?**

Before releasing functionality to all our customers we will conduct testing with limited customers. This period is
referred to as 'controlled go-live' or private beta.

### Links to changelogs for submission APIs

Keep up to date with changes to the APIs in sandbox and production with our new changelogs. Get notifications when there
are changes by subscribing to the relevant RSS feed using RSS reader.

**For VAT (Making Tax Digital), no future releases are planned and the latest position is found below.**

* [MTD VAT API changelog](https://github.com/hmrc/vat-api/wiki/Changelog)
* [RSS feed for MTD VAT changes](https://github.com/hmrc/vat-api/wiki.atom)
* [ITSA APIs changelog](https://github.com/hmrc/income-tax-mtd-changelog/wiki)

### Current endpoint functionality in sandbox and production

Keep up to date with changes to current endpoint functionality in sandbox and production by reviewing
the [API Documentation](https://developer.service.hmrc.gov.uk/api-documentation/docs/api).

## ITSA future API deliverables

### Production by **End of April 2022** (all features now live)

| Function                                     | Must be part of legislated quarterly updates? | Can be used in year? | Detail                                                                                                                                                                                                                               | Target date for sandbox |
|----------------------------------------------|-----------------------------------------------|----------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------|
| Changes to the Property Business (MTD) API   | Yes                                           | Yes                  | UK Property has been added to the Property Business (MTD) API for tax year 22/23 onwards. This change is required so that both property business types, UK and Foreign can be supported by our systems.                              | January 2022            |
| Capital Allowances                           | No                                            | Yes                  | Enhancement to the Property Business (MTD) API endpoints to include structure and building allowances and first year electric charge allowance for 22/23 tax year onwards.                                                           | January 2022            |
| Business Validation Rules                    | No                                            | Yes                  | Enhancements to the business validation rules for Property & Capital Allowances only.                                                                                                                                                | January 2022            |
| Business Income Source Summary (MTD) v.2     | No                                            | Yes                  | New version due to the business ID becoming mandatory.                                                                                                                                                                               | January 2022            |
| Individual Losses (MTD) v.3                  | No                                            | Yes                  | New version due to the business ID becoming mandatory.                                                                                                                                                                               | January 2022            |
| Business Source Adjustable Summary (MTD) v.3 | No                                            | Yes                  | New version due to the business ID becoming mandatory.                                                                                                                                                                               | January 2022            |
| Health and Social Care Levy                  | No                                            | Yes                  | New calculation information messages to notify software of temporary increase to self- employed National Insurance Contributions (NICs) for the 22/23 tax year.                                                                      | N/A                     |

Note for "Can be used in year":

* "Yes" indicates that this functionality is available during the live tax year to report against. For example, Partner Income can voluntarily be reported during the active tax year
* "No" indicates that this functionality is not available until after the tax year has ended. For example, a "post crystallisation amendment" for the active tax year cannot be made
  until the tax year has completed

### Production by **End of September 2022**

| Function                                 | Must be part of legislated quarterly updates? | Can be used in year? | Detail                                                                                                                                                                                                                                | Target date for sandbox |
|------------------------------------------|-----------------------------------------------|----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------|
| Employment coded out                     | No                                            | No                   | This will allow a customer with employment income to request that they do not want their Self Assessment liability coded out for the 21/22 tax year onwards.<br><br>New endpoints have been added to the Self Assessment Account API. | January 2021            |
| Self Assessment Accounts (MTD)           | No                                            | Yes                  | Refactoring the Self Assessment Accounts (MTD) which will include repayment and payments information as well as any manual financial adjustments made.                                                                                | August 2022             |
| Individual Calculations (MTD) version 3  | No                                            | Yes                  | Refining Tax Calculation API by adding a tax year data item and reducing the number of endpoints in response to the software market demand.                                                                                           | May 2022                |
| Changes to the Self Assessment (MTD) API | Yes                                           | Yes                  | The existing Self-Assessment API (Self Employment, Gift Aid and Dividends and Interest) will be broken down into specific datasets APIs for Self Employments, Charitable Giving, Interest and Dividends.                              | July 2022               |
| Automated and Manual Correction          | No                                            | No                   | Enhancement to APIs to include correction information and expose details to customer.                                                                                                                                                 | TBC                     |
| Unattended Calculation                   | No                                            | Yes                  | Individual Calc API will be modified to include new reason field for unattended calculation.                                                                                                                                          | March 2022              |

Note for "Can be used in year":

* "Yes" indicates that this functionality is available during the live tax year to report against. For example, Partner Income can voluntarily be reported during the active tax year
* "No" indicates that this functionality is not available until after the tax year has ended. For example, a "post crystallisation amendment" for the active tax year cannot be made
  until the tax year has completed

### Delivery dates **to be confirmed**

| Function                                      | Must be part of legislated quarterly updates? | Can be used in year? | Detail                                                                                             |
|-----------------------------------------------|-----------------------------------------------|----------------------|----------------------------------------------------------------------------------------------------|
| Post crystallisation amendments               | No                                            | No                   | Allows a customer to make a change to their final declaration after they have finalised that year. |
| Health and Social Care Levy                   | No                                            | Yes                  | Changes to the tax calc to include new data breakdown for the Health and Social Care Levy.         |
| Residence and remittance basis                | No                                            | Yes                  | To enable software to support overseas customers with UK income.                                   |
| Trust income                                  | No                                            | Yes                  | To enable software to support customers that have income from a trust.                             |
| Partner income (SA104)                        | No                                            | Yes                  | To enable software to support customers that have income from partnerships.                        |
| Carry back of losses                          | No                                            | No                   | To enable customers to claim carry back losses via software.                                       |
| Allowances: blind persons and married couples | No                                            | Yes                  | To enable submission service to support allowances: blind persons, marriage and married couples.   |
| Minister of religion                          | No                                            | Yes                  | To enable submission service to support ministers of religion.                                     |
| Lloyd’s underwriters                          | No                                            | Yes                  | To enable submission service to support Lloyd’s underwriters.                                      |

Note for "Can be used in year":

* "Yes" indicates that this functionality is available during the live tax year to report against. For example, Partner Income can voluntarily be reported during the active tax year
* "No" indicates that this functionality is not available until after the tax year has ended. For example, a "post crystallisation amendment" for the active tax year cannot be made
  until the tax year has completed

## Update and submit an income tax return (ITSA Submission Service)

### Live and Planned deliveries

| Function                  | Must be part of legislated quarterly updates? | Can be used in year? | Status    | Details                                                                         |
|---------------------------|-----------------------------------------------|----------------------|-----------|---------------------------------------------------------------------------------|
| UK dividends              | No                                            | Yes                  | Live      | The ability to report UK dividends.                                             |
| UK interest               | No                                            | Yes                  | Live      | The ability to report UK interest.                                              |
| Charitable giving         | No                                            | Yes                  | Live      | The ability to report any charitable donations made.                            |
| Employments (in year)     | No                                            | Yes                  | Live      | The ability to view employment information.                                     |
| Crystallisation           | No                                            | No                   | Live      | The ability to crystallise/complete the final declaration for a given tax year. |
| Employments (end of year) | No                                            | No                   | May 2022  | The ability to report amend and/or add new employment details.                  |
| Student Loans             | No                                            | No                   | Sept 2022 | The ability to report Student Loan information.                                 |

Further ITSA datasets will be delivered in 2022/2023 and 2023/2024. There are no dates planned at this time.

Note for "Can be used in year":

* "Yes" indicates that this functionality is available during the live tax year to report against. For example, Partner Income can voluntarily be reported during the active tax year
* "No" indicates that this functionality is not available until after the tax year has ended. For example, a "post crystallisation amendment" for the active tax year cannot be made
  until the tax year has completed

## Business and non-business datasets

| Mandated Business Datasets                                                                                 | Non-Mandated Datasets                |
|------------------------------------------------------------------------------------------------------------|--------------------------------------|
| SA103 - Self-employment schedule                                                                           | SA102 - Employment                   |
| Multiple SA103 self-employment schedules                                                                   | SA102M - Minister of religion        |
| SA105 - Property income                                                                                    | SA103L - Lloyds underwriter          |
| Foreign property Income                                                                                    | SA108 - Capital gains                |
| Class 2 national insurance contributions (required for business customers but not business income as such) | SA109 - Residence and remittance etc |
| Averaging Adjustment (farmers, market gardeners, creators of literary or artistic works)                   | SA101 - Additional information       |
| Foster carers                                                                                              | SA107 – Trusts                       |
| Losses                                                                                                     | SA106 – Foreign                      |
|                                                                                                            | SA104S - Short partnership           |
|                                                                                                            | SA104F - Full partnership            |
|                                                                                                            | Gift Aid                             |
|                                                                                                            | UK Interest                          |
|                                                                                                            | UK Dividends                         |
|                                                                                                            | Student loan                         |
|                                                                                                            | Marriage allowance                   |
|                                                                                                            | Blind persons allowance              |
|                                                                                                            | High income child benefit            |
|                                                                                                            | Pension income                       |
|                                                                                                            | CIS                                  |


We would welcome your feedback to improve our roadmap further.

Please feel free to contact us: sdsteam@hmrc.gov.uk
