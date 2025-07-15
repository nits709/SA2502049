import {test,expect} from '@playwright/test';

test('fileUploadScenario',async ({page})=>{
    await page.goto('https://the-internet.herokuapp.com/upload')

    // use absolute file page for playwright
    const filenamePath = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/POM_Concept.docx";


    //set the file to the input element - method name  setInputFiles("elementLocator", filepath)
    await page.setInputFiles('#file-upload',filenamePath);
    await page.locator('#file-submit').click();

    const textOfElement = await page.locator('.example div').textContent()  // i'll get an exception.
    const textOFElementInnerText = await page.locator('.example div').innerText();

    console.log(` text of element ${textOfElement} and ${textOFElementInnerText}`);



})