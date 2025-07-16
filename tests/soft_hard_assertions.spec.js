import {test,expect} from '@playwright/test';
//test.use({timeout:20000})//

test('hard_soft',async({page})=>{

await page.goto('https://demoblaze.com/');
      console.log("A");
      await expect(page).toHaveTitle('STORE123');  // positive assertion.
       console.log("B");
       console.log("C");

})

test.only('soft',async({page})=>{

    await page.goto('https://demoblaze.com/');
          console.log("A");
          await expect.soft(page).toHaveTitle('STORE123');  // positive assertion.
           console.log("B");
           console.log("C");
    
    })