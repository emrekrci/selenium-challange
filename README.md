# selenium-challange

This project created to learn Selenium WebDriver with Trendyol Tech.

There are 4 main steps to reproduce testcase;

1. Login with specified user
2. Validate All boutiques
3. Validate one boutique and its images randomly
4. Click a product and add to card. 

But this test cases was seperated 5 classes like 'Login', 'AddProductToCard', 'ValidateBoutiques', 'ValidateBoutiqueImages', 'MainCase'.
'MainCase' class reproduce our main test case, and the other 4 class is our helper class to implement 'MainCase'. 

You can define browser driver in config.properties file. Only you have to change browser property. You can set only 'Chrome', 'Firefox', 'IE', 'Opera'.
You can also define username and password in config.properties. 

To Loggin issue, We have used log4j library. 
