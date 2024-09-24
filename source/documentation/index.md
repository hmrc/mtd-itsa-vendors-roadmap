
# Making Tax Digital for Income Tax roadmap 

Last updated: 19 September 2024 (see [changelog](#document-changelog))

> **Help us improve this roadmap**: [leave your feedback here](https://docs.google.com/forms/d/e/1FAIpQLSe9jb0WCXWO9yt6zLBTKZLSK2oiTQcGPD96CTiwnQF0QxH5Tw/viewform).

## About this roadmap

This roadmap sets out our anticipated schedule for future releases for Making Tax Digital for Income Tax APIs. It also provides details of releases relating to
the service delivered via other mechanisms, such as a user interface.

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

Before releasing functionality to all our customers we will conduct testing with limited customers. This period is referred to as 'controlled go-live' or private beta.

## Document changelog

**24 September 2024**

- Update 'EOPS removal' entry in APIs roadmap to make clear that it applies to all tax years

**19 September 2024**

- Update APIs roadmap
	- Payments on account history released
	- Make "Deploy to Sandbox" column clearer

**8 August 2024**

- Add details of affected tax years to API roadmap
- Update Sandbox deployment date for 'Multiple agents' to October 2024

**5 August 2024**

- Update name of service to 'Making Tax Digital for Income Tax'

**8 July 2024**

- Update APIs roadmap
	- September 2024 table update
	- Add expected changes for December 2024 and April 2025
	- Add "Post-finalisation amendment" and "Opt back in to MTD" to **Planned future deliveries**
	- Move "High Income Child Benefit" to **Planned future deliveries**
	- Add indication of breaking/non-breaking changes

- Update HMRC online services roadmap
	- Add reporting of Construction Industry Scheme, additional information and off-payroll working to **Current functionality**
	- Updated state benefits entries to show that Jobseeker’s Allowance and Employment and Support Allowance can now be reported