
    import {test, expect} from '@playwright/test';
// what is page. -- is window, tab
// page as object 


    test('myfirstScript',async ({ page })=>{

      await page.goto('https://demoblaze.com/index.html') // this commands navigate URL.
        
      const pageTitle = page.pageTitle(); // that method would return page title.

        console.log("Page Title "+ pageTitle);

            const pageURL = page.url();

        console.log("Page URL "+ pageURL);

          await expect(page).toHaveTitle("STORE");
          await expect(page).toHaveURL("https://demoblaze.com/index.html");

          await page.close();


    })