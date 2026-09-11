Given the sonnet below, write a program that prints out the sonnet and stops at a random word,
printing a series of underscores instead, and not printing the rest of the sonnet.
The program should prompt the user for the next word.
Once the user responds, the program should indicate correct or error, and restart the sonnet, stopping at a different word.
The program continues this prompting until the user gets three words correct or three words incorrect.
You have liberty to design the program how you like, as long as it meets the requirements.

Shall I compare thee to a summer’s day?
Thou art more lovely and more temperate:
Rough winds do shake the darling buds of May,
And summer’s lease hath all too short a date;
Sometime too hot the eye of heaven shines,
And often is his gold complexion dimm’d;
And every fair from fair sometime declines,
By chance or nature’s changing course untrimm'd;
But thy eternal summer shall not fade,
Nor lose possession of that fair thou ow’st;
Nor shall death brag thou wander’st in his shade,
When in eternal lines to time thou grow’st:
   So long as men can breathe or eyes can see,
   So long lives this, and this gives life to thee.

- threePrithee pseudocode
    - split the sonnet into an array seperated by white space "\\s+"
    - Create correct and incorrect guesses counters
    - loop through the game while (numCorrect < 3 && numWrong < 3)
    - generate a random number which corresponds to an index in the sonnet array
    - create an empty string
    - loop through sonnet array of words until random number is reached
    - add the words to the empty string to build the sonnet substring
    - print the sonnet substring followed by "__________"
    - Ask user for input
    - compare user input with next word in array
    - if wrong --> add to incorrect counter
    - if correct --> add to correct counter
    - if 3 correct --> tell user they guessed 3 correctly
    - if 3 incorrect --> tell user they guessed 3 incorrectly