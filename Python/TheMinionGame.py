def minion_game(string):
    # your code goes here
    alphabet_vowels = ['A', 'E', 'I', 'O', 'U']
    str_len = len(string)

    scorecard_kevin = [1 if string[i] in alphabet_vowels        else 0 for i in iter(range(str_len)) ]

    score_total = sum([*range(1,str_len+1)])
    score_kevin = sum([a*b for a,b in zip(scorecard_kevin,      [*range(1,str_len+1)][::-1])])

    score_stuart = score_total-score_kevin    

    if score_stuart>score_kevin:
        print("Stuart %d"%score_stuart)
    elif score_stuart<score_kevin:    
        print("Kevin %d"%score_kevin)
    else:
        print("Draw")
            
if __name__ == '__main__':
    s = input()
    minion_game(s)

'''
Kevin and Stuart want to play the 'The Minion Game'.

Game Rules

Both players are given the same string, s.
Both players have to make substrings using the letters of the string S.
Stuart has to make words starting with consonants.
Kevin has to make words starting with vowels.
The game ends when both players have made all possible substrings.

Scoring

A player gets +1 point for each occurrence of the substring in the string S.

For Example:

String S = BANANA
Kevin's vowel beginning word = ANA
Here, ANA occurs twice in BANANA. Hence, Kevin will get 2 Points.

For better understanding, see the image below:
(https://github.com/phsrdev/HackerRank/blob/main/Python/TheMinionGame.png)

Your task is to determine the winner of the game and their score.

Function Description

Complete the minion_game in the editor below.

minion_game has the following parameters:

string string: the string to analyze

Prints

string: the winner's name and score, separated by a space on one line, or Draw if there is no winner

Input Format

A single line of input containing the string S.
Note: The string S will contain only uppercase letters: [A - Z].

Constraints

0 < len(S) <= 10^6

Sample Input

BANANA

Sample Output

Stuart 12

Note :
Vowels are only defined as AEIOU. In this problem, Y is not considered a vowel.
'''