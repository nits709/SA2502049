
import {test,expect} from "@playwright/test";

test('dialog',async ({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/');
    
    //enabling dialog window /alert 
    page.on('dialog',async dialog=>{
        //assertion.
        expect(dialog.type()).toContain('alert');
        expect(dialog.message()).toContain('I am an alert box!');
        await dialog.accept(); // clicks on Ok
    })
    await page.click('#alertBtn');  
   

})


test('ConfirmationAlert',async ({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/');
    
    //enabling dialog window /alert 
    page.on('dialog',async dialog=>{
        //assertion.
        expect(dialog.type()).toContain('confirm');
        expect(dialog.message()).toContain('Press a button!');
        await dialog.accept(); // clicks on Ok
        //await dialog.dismiss(); // clicks on cancel button.
    })
  
    await page.click('#confirmBtn');   // because of this.
    const textValidation = await page.locator('#demo');
    await expect(textValidation).toHaveText('You pressed OK!');
   

})

test('PromptAlert',async ({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/');
    
    //enabling dialog window /alert 
    page.on('dialog',async dialog=>{
        //assertion.
        expect(dialog.type()).toContain('prompt');
        expect(dialog.message()).toContain('Please enter your name:');
        expect(dialog.defaultValue()).toContain('Harry Potter');
        await dialog.accept('John'); // clicks on Ok
        //await dialog.dismiss(); // clicks on cancel button.
    })
  
    await page.click('#promptBtn');   // because of this.
    const textValidation = await page.locator('#demo');
    await expect(textValidation).toHaveText('Hello John! How are you today?');
   

})