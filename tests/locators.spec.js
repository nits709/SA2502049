
import {test,expect} from '@playwright/test';


test("locators method",async ({page})=>{

   await page.goto('https://demoblaze.com/index.html');
    const pageTitle = await page.title() // that method would return page title.
    console.log("Page Title "+ pageTitle);

// click on login element using property locator.
    await page.locator('id=login2').click(); // property format 
    //page.click('id=login2');

    // to type data into text field - use fill function.
   // await page.locator([id="loginusername"]).fill("pavanol");  // css format 
    await page.fill('[id="loginusername"]',"pavanol");  // first parameter, accepts locator, testdata.

    await page.locator('#loginpassword').fill('test@123');

    await page.click("//button[normalize-space()='Log in']");

   const logOutElement = await page.locator("//a[normalize-space()='Log out']");

          // to check the element is visible over page.
    await expect(logOutElement).toBeVisible();

    await page.click("//a[normalize-space()='Log out']")

    await page.close();


})