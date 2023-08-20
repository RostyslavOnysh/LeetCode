Our football team has finished the championship.

Our team's match results are recorded in a collection of strings. Each match is represented by a string in the format "x:y", where x is our team's score and y is our opponents score.

For example: ["3:1", "2:2", "0:1", ...]

Points are awarded for each match as follows:

if x > y: 3 points (win)
if x < y: 0 points (loss)
if x = y: 1 point (tie)
We need to write a function that takes this collection and returns the number of points our team (x) got in the championship by the rules given above.

Notes:

our team always plays 10 matches in the championship
0 <= x <= 4
0 <= y <= 4


* int totalScore = 0;: Initializes the totalScore variable to keep track of the total points earned by the team.
* for (String value : games) {: Starts a loop that iterates through each element (value) in the games array.
* String[] score = value.split(":");: Splits the value string using the colon : as the delimiter and stores the resulting substrings in the score array.
* int right = Integer.parseInt(score[0]);: Parses the first substring (representing the team's score) into an integer variable right.
* int left = Integer.parseInt(score[1]);: Parses the second substring (representing the opponent's score) into an integer variable left.
* totalScore += (right > left) ? 3 : (right == left) ? 1 : 0;: This line uses nested ternary operators to determine the points earned in the current match:
* If right (team's score) is greater than left (opponent's score), it adds 3 points.
* If right is equal to left, it adds 1 point.
* If neither of the above conditions is met, it adds 0 points.
* return totalScore;: Returns the totalScore as the result of the points method.
* This code calculates the total points earned by the team based on the match results stored in the games array.
* It iterates through each match result, extracts the scores, and adds the appropriate points to the totalScore variable using the ternary operator. 
* The final total score is then returned as the result of the method.