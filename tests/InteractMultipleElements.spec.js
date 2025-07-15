import {test,expect} from '@playwright/test';

test('GetNo.OfLinks',async({page})=>{
    await page.goto('https://the-internet.herokuapp.com/')
    console.log("Page loaded successfully");

//
    // get the total no of links present on page.
            const links =  page.locator('#content a');
            const noOfLinks = await links.count(); // this method would return the total no. of links (size);
            console.log(`total number of  ${noOfLinks} links`); // 44 links present.

            for(let i = 0 ; i < noOfLinks; i++){
                    const link = links.nth(i); // links hold the element attribute and noOfLinks hold count only.
                   const title =  (await link.textContent()).trim();
                   console.log(`${i} txt is ${title}`);

                   await link.click();
                   console.log("title of the page "+ await page.title());
                   page.goBack(); // takes user to previous page.
                   //page.goForward(); // this takes user to next page
            }






})