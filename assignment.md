# The Problem(s)

Source: [Advent of Code - 2015 - Day 1](https://adventofcode.com/2015/day/1)

## Part 1

Santa is trying to deliver presents in a large apartment building, but he can't find the right floor - the directions he got are a little confusing. He starts on the ground floor (floor 0) and then follows the instructions one character at a time.

An opening parenthesis, `(`, means he should go up one floor, and a closing parenthesis, `)`, means he should go down one floor.

The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.

For example:
- `(())` and `()()` both result in floor `0`.
- `(((` and `(()(()(` both result in floor `3`.
- `))(((((` also results in floor `3`.
- `())` and `))(` both result in floor `-1` (the first basement level).
- `)))` and `)())())` both result in floor `-3`.

To what floor do the instructions take Santa?

## Part 2

Now, given the same instructions, find the position of the first character that causes him to enter the basement (floor `-1`). The first character in the instructions has position `1`, the second character has position `2`, and so on.

For example:
- `)` causes him to enter the basement at character position `1`.
- `()())` causes him to enter the basement at character position `5`.

What is the position of the character that causes Santa to first enter the basement?

---

## Interacting with this Repository

Your solution to this problem will be coded in the `Assignment.java` file. It already has existing code set up to initialize the `String` variable `puzzleInput` so you can begin working.

To see the puzzle input, look in the `string.txt` file. Note that the `String` of parentheses is roughly 7,000 characters long, so this is not a puzzle you can calculate the answer to by hand (at least not reasonably).

Since it will not be easy to determine the answer by hand, the answer to your input has been included in the `answer.txt` file for your reference. Use this to determine if you got the final answers right.

Running the `Setup.java` file will randomly generate a new string of parentheses in the `string.txt` file (and therefore the `String` you are coding with), as well as a new answer based on that new `String` in the `answer.txt` file.

---

## Your Answer

You should format your answer based on the formatting in `answer.txt`, down to the capitalization and punctuation.

Verify that your work is accurate once you think you are done, by alternating between running `Assignment.java`, checking your answer via the `answer.txt` file, and then running `Setup.java` to shuffle the input and test again. This will ensure that you have a solid, working solution and not just one that works in particular situations.