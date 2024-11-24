*How to run the number plates test on AutoTrader site and compare the details*

Use Selenium Java 4.25.0
Use TestNG 7.6.1
Test is in the CarTest package
The browser launch and tearDown from LaunchBrowserTearDown package
All the webElements are in pages package
All the Car input and output text files under resources folder

Run "carTest-> CarNumberPlateComparisonTest.java" as TestNG test
Which will launch https://www.autotrader.co.uk/cars/valuation
From the input Content text file (car_input V4.txt) with reg expression it reads all the number plates
It will feed into Auto Trader search field and get all the details of that car
The details will be compared from the Output Content text file and print the details which matches
4 car details will be posted onto terminal/console
Then the browser will be closed after the test

