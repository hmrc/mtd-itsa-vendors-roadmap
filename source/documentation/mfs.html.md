---
title: Minimum Functionality Standard | Income Tax (MTD) Roadmap
weight: 5
---

# Minimum functionality standard

APIs required for each stage of development of a [minimum functionality standard](https://developer.service.hmrc.gov.uk/guides/income-tax-mtd-end-to-end-service-guide/documentation/how-to-integrate.html#minimum-functionality-standards) product.

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