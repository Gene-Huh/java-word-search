# Word Search Kata

A word search is a class puzzle, where you find a list of words hidden in a grid of random letters.  

```
F H K E F F H D
F D O G I O P V
F J D K O I A Q
F J E I H Q R M
C W B X X N R I
A A E S F U O F
C U T H E S T U
F J J S N J I O

The above grid contains the words DOG, CAT, and PARROT
```

Write a program that first creates a grid of random letters, and then identifies all valid words in the provided word list that can be found in the grid.  Words can be foud along any diagonal, forward, upward, downward, or backward.  

This Kata can be completed using any language and either a visual or command line based UI.  

## Application Requirements

1. Create a grid of random letters.  
    * The grid will always be a square
    * The grid can be any size.  A size of at least 15x15 is recommended
    * The grid size can be hardcoded or provided by the user
2. Display the grid to the user in all uppercase letters
3. Search the Grid for all valid words that were generated.
    * A word list has been provided, however, any word list or dictionary can be provided.
4. Display the results to the user as the number of words found, a list of found words, and by marking them in the original grid in a visual manner.
    * For a CLI application change the case of the letters of the found words to lowercase

## Rules

1. Words can be found:
    * any diagonal
    * up or down
    * forward or backword
2. Words should be complete along a linear path and not wrap between edges of the board
3. Words may have overlapping letters
4. It is possible that no valid words will be generated
5. A word list has been provided, however, any word list may be used
6. The grid should be random and not take the word list into account
7. Solving the problem is more important than the performance.

## Example

Generated Grid

```
F H K E F F H D
F D O G I O P V
F J D K O I A Q
F J E I H Q R M
C W B X X N R I
A A E S F U O F
C U T H E S T U
F J J S N J I O

3 Words found: CAT, DOG, PARROT

F H K E F F H D
F d o g I O p V
F J D K O I a Q
F J E I H Q r M
c W B X X N r I
A a E S F U o F
C U t H E S t U
F J J S N J I O
```

## Language Choice

Any language can be used to complete this Kata.  Katas are a great way to practice a language you already know (Java, C#, JavaScript), or to explore learning a new language (Python, Ruby, Kotlin).  

It can also be completed using any UI: web based, command line, mobile, desktop.  Each type of UI provides unique challenges.

## Word List

A list of words has been provided in the kata repository as `word-list.text`.  This word list can be used, but any list of words or dictionary can be used.  The size of the word list will affect the number of words that may be found and the probability of valid words being generated. 

## Tips

1. Use Test Cases with Test Driven Development Techniques
2. Create your grid generation and word search algorithms as seperate units of code, so they can be written and tested in isolation. 
3. It is recommended that you start with the word search functionality using pre-generated grids.  Unit Testing can help isolate this functionality. 
4. It is statistically possible, though unlikely, that a randomly generated board will not generate any of the valid words in the list.
5. The board size affects the difficulty of the problem.  A small board is less likely to generate words, while a large one will take longer to search.  A recommend size is 15x15.
6. Pre-generated boards with known words and location can be used to test the word search unit of code.  Web sites like https://www.puzzle-maker.com/wordsearch_Entry.cgi can be used to generate grids with a known list of words.
7. While solving the problem is not as important as performance, keep in mind that a solution that works well on a small board may not scale to a larger board.  
8. Save performance optimizations until after the problem has been solved on a smaller scale.  A solution that works on a 15x15 board, but not a 50x50 board still solves the problem, and until the problem is solved it can be difficult to correctly determine where optimization should be done.
9. Keep in mind data structures available for the language you use, and how each can help you represent the grid and search the word list. 
10. Read the word list into memory once when the application starts.
