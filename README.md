# Assignment_1-CSC2001F-
This Repository contains an assignment that have apps to comapare Search time of searching in a traditional singly Array and BinarySearchTree to determine the fastest algorithm

## LSArrayApp.java
_LSArrayApp_ is a java Application that reads in a file called **Load_Shedding_All_Areas_Schedule_and_Map.final.txt** which contains key and areas.
Keys are the identifers used to identify places that will be affected by load shedding. The app read the file and store them in a singly traditional Array.
The _LSArrayApp_ contains two methods which are **printAreas()** and **printAllAreas()**. The **printAreas()** takes three arguements which are stage, date & startTime
it compares those into a key that looks like this **1_1_00** and return the areas if a match is found.
