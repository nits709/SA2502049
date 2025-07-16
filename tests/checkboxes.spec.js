import {test,expect} from '@playwright/test';



test('checkbox handling',async({page})=>{
  await page.goto('https://testautomationpractice.blogspot.com/')
//   await page.locator("[value='sunday']").check();   // sunday
//   await page.locator("//input[@value='monday' and @type='checkbox']").check();   //Monday

  await page.waitForTimeout(2000);


            //Multiple Checkbox.
             const checkboxes = await page.locator(".form-check-inline [type='checkbox']");  // 7 
             const ccCount = await checkboxes.count(); // return the no. of checkboxs
             console.log("Size of checboxed " + ccCount);


             for(let i = 0 ; i<ccCount;i++){
                        await checkboxes.nth(i).click();  // sunday and monday becomes unchecked
             }


             await page.waitForTimeout(2000)

             // tell if i want to unchecked the checked one. || Assignment.



})