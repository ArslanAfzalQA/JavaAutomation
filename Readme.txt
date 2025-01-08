# JavaAutomation - Selenium Parallel Testing with TestNG

This project demonstrates how to run Selenium WebDriver tests in parallel on multiple browsers (Chrome, Firefox, Edge, and Safari) using TestNG and the Page Object Model.

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- **Java** (JDK 8 or later)
- **Maven** (for dependency management)
- **IntelliJ IDEA** (or any other Java IDE)
- **Browsers**:
  - Chrome
  - Firefox
  - Edge
  - Safari (Safari should already be installed on macOS)

## Setup Instructions

### 1. Clone the Repository

Clone the repository to your local machine using the following command:

```bash
https://github.com/ArslanAfzalQA/JavaAutomation.git

2. Import the Project
Open IntelliJ IDEA (or your IDE).
Choose Open and navigate to the folder where the project is saved.
3. Install Dependencies
Open the terminal in your IDE and run the following command to install the required dependencies:
bash

mvn install

This will download all the necessary libraries, including Selenium, WebDriverManager, and TestNG.

4. Run the Tests
Open the test.xml file located in the root of the project.
Right-click the file and select Run to execute the tests in parallel on the different browsers.
5. Notes
If you don't have the necessary browser drivers installed, WebDriverManager will handle them automatically.
The tests are configured to run in parallel on Chrome, Firefox, Edge, and Safari using the parallel="tests" configuration in test.xml.
