# Tic-Tac-Toe with AI

In this project, you'll write a game called Tic-Tac-Toe that you can play with your computer. The computer will have three levels of difficulty - easy, medium, hard.

But, for starters, let's write a program that knows how to work with coordinates and determine the state of the game.

Suppose the bottom left cell has the coordinates (1, 1) and the top right cell has the coordinates (3, 3) like in this table:

(1, 3) (2, 3) (3, 3)
(1, 2) (2, 2) (3, 2)
(1, 1) (2, 1) (3, 1)

The program should work in the following way:

1. Get the 3x3 field from the first input line (it contains 9 symbols containing X, O and _, the latter means it's an empty cell),

2. Output this 3x3 field with cells before the user's move,

3. Then ask the user about his next move,

4. Then the user should input 2 numbers that represent the cell on which user wants to make his X or O. (9 symbols representing the field would be on the first line and these 2 numbers would be on the second line of the user input). Since the game always starts with X, if the number of X's and O's on the field is the same, the user should make a move with X, and if X's is one more than O's, then the user should make a move with O.

5. Then output the table including the user's most recent move.

6. Then output the state of the game.

Possible states:

"Game not finished" - when no side has a three in a row but the field has empty cells;

"Draw" - when no side has a three in a row and the field has no empty cells;

"X wins" - when the field has three X in a row;

"O wins" - when the field has three O in a row;


If the user input wrong coordinates, the program should keep asking until the user enters coordinate that represents an empty cell on the field and after that output the field with that move. You should output the field only 2 times - before the move and after a legal move.