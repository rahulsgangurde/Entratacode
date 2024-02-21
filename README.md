Entrata.com Coding Challenge
##### **This repository contains automated test scripts for the Entrata website using Selenium WebDriver and TestNG**

**Test Case 1: Verify the title of the home page**
Method: verifyHomePageTitle
Description: Verifies if the actual title of the home page matches the expected title with the help of assertions.

Test Steps:
1)Open the Entrata website by navigating to "https://www.entrata.com".
2)Retrieve the actual title of the home page.
3)Compare the actual title with the expected title, "Property Management Software | Entrata".

Expected Result:
The actual title should match the expected title, confirming the correctness of the home page.

**Test Case 2: Perform sign in with wrong data**
Method: SignINButton
Description: Tests the sign-in functionality with incorrect credentials and verifies the error message. Here we used scrolling, explict wait and assertions to verify result.

Test Steps:
1)Open the Entrata website by navigating to "https://www.entrata.com".
2)Click on the "Sign In" button.
3)Scroll down the page.
4)Accept the cookies by clicking the confirmation button.
5)Click on the "Property Manager Login" link.
6)Enter an incorrect username and password.
7)Click the "Sign In" button.
8)Capture the displayed error message.

Expected Result:
The error message should indicate that the provided username and password are not valid.

**Test Case 3: Navigate to Products page and select category**
Method: navigateToProductsPageAndSelectCategory
Description: Navigates to the Products page, selects a category, and verifies that the selected category is displayed.

Test Steps:
1)Open the Entrata website by navigating to "https://www.entrata.com".
2)Click on the "Products" link in the navigation menu.
3)Select a specific category, for example, "ResidentPay".
4)Verify that the selected category page is displayed.

Expected Result:
The selected category page (e.g., ResidentPay) should be visible, indicating successful navigation to the Products page and selection of the category.



Above test cases cover different functionalities of the Entrata website, including verifying the title, signing in with incorrect data, and navigating to the Products page.
