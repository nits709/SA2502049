import {test,expect} from '@playwright/test';

test('assertions',async({page})=>{

    await page.goto('https://demo.nopcommerce.com/register?returnUrl=%2F')

    //1. await expect(locator).toBeEnabled() | all type elements.
         const searchField = await page.locator('#small-searchterms');
         await expect(searchField).toBeEnabled(); // boolean true or false 0 || 1 
         await expect(searchField).toBeEditable();
         await expect(searchField).toHaveAttribute('aria-label','Search store');
     
    //2 await expect(locator).toBeChecked() | radio || checkbox
            const radioSelection = await page.locator('#gender-male'); 
            await   radioSelection.click();  // this click on male radio button
            await expect(radioSelection).toBeChecked(); // checked radio button selected or not

    //3   checkbox await expect(locator).toBeChecked()
        const newsLetterCheckbox =await page.locator('#Newsletter');
        await expect(newsLetterCheckbox).toBeChecked(); // check NW checkbox is checked or not.

    // hard checked and partial checked. | toHaveText('text') | toContainText('text);
    
                const registerButton = await page.locator('#register-button');
                await expect(registerButton).toHaveText('Register');
                await expect(registerButton).toContainText('Reg')


        // toHaveValue
                const firstUserName = page.locator('#FirstName');        
                await firstUserName.fill('Selenium');
                await expect(firstUserName).toHaveValue('Selenium');

       //         
                        

})