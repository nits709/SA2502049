// in pW multiple way to take screenshot
//1. pageview
//2. fullpage
//3. locator specific screenshot.

import {test,expect} from "@playwright/test"

test('pageview screenshot',async({page})=>{
    await page.goto('https://demoblaze.com');
    await page.waitForTimeout(2000);
   // await page.screenshot({path:'Homepage.png'}); //syntax.

    await page.screenshot({path:'tests/screenshots/pageView/'+Date.now()+'_Homepage.png'});
})

test('fullPage screenshot',async({page})=>{
    await page.goto('https://demoblaze.com');
    await page.waitForTimeout(2000);
   // await page.screenshot({path:'Homepage.png'}); //syntax.

    await page.screenshot({path:'tests/screenshots/fullPage/'+Date.now()+'_Homepage.png',fullPage:true});
})

test('locator screenshot',async({page})=>{
    await page.goto('https://demoblaze.com');
    await page.waitForTimeout(2000);
   // await page.screenshot({path:'Homepage.png'}); //syntax.

    await page.locator('.d-block.img-fluid').first().screenshot({path:'tests/screenshots/locator/'+Date.now()+'_carousel.png'});
})