import {test,expect} from '@playwright/test';

test('handling dropdown',async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com');
    //
    // await page.locator('#country').selectOption({label: 'India'}); // label

    // await page.waitForTimeout(2000) 


    // await page.locator('#country').selectOption('China')  // select option by visible text.
    // await page.locator('#country').selectOption({value: 'uk'}) // select option by value

    // await page.locator('#country').selectOption({index: 3}) // select option by index.


    // await page.selectOption('#country','India'); 

    // await page.waitForTimeout(2000)

    //1) check the number of options present in dropdown.

    // const option = await page.locator('#country option');
    // //const noofOptiones = options.count();
    // await expect(options).toHaveCount(10);


   // 2) approach 2 
   const options = await page.locator('#country option'); // options hold entire list of dd
   const noofOptiones = await options.count();  // getting no. of option count
   console.log(`number of options ${noofOptiones}`)

    let status =false;
//    for(const opt of options){
//         let dv = await opt.textContent(); // return the text.

//         if(dv.includes('France')){
//             console.log(`inside if condition`)
//             status = true;
//             break;
//         }
//    }

   for(let i=0; i<noofOptiones;i++){
    let dv = await options.nth(i).textContent(); // return the text
    if(dv.includes('France')){
    console.log(`inside if condition`)
            status = true;
            break;
   
    }}

   console.log("status "+ status);








})