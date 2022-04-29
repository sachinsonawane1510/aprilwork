Feature: Manage Address

Background: User is successfully Logged
When user open "Chrome" browser with exe as 
When user open URL as 
When user click on login cancle button
When user move to login
When user click on login
When user enter "9021553876" as a username
When user enter "Sachin@1510" as a password
When user click on login button
Then application shows login successfully

@regressiontest
 Scenario Outline: validate manage address functionality
 When user click on manage address
 When user click on ADD A NEW ADDRESS
 When user enter <name> as name
 When user enter <mobilenumber> as mobile number
 When user enter <pincode> as pincode
 When user enter <locality> as locality
 When user enter <addaddress> as address
 When user click on home button
 When user click on save button
 Then application shows address add successfully
 
 Examples: 
 |name|mobilenumber|pincode|locality|addaddress|
 |bhushan|7304366083|431116|Aurngabad|at.post-tunki,ta-vaijapur,dist-aurngabad|
 |rahul|7568946445|422102|nashik|at post- naigaon,ta-sinnar,dist-nashik|
 |kiran|8978457565|422102|nashik|at post-agaskhind,ta-sinnar,dist-nashik|
 
 
 
 
 
 
 
 
 
 
 
 
 