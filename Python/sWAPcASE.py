def swap_case(s):
    res = ''
    for c in s:
        #Usando ASCII para identificar a letra maiuscula, verificando se a letra esta entre A e Z maiusculo
        if ord('A') <= ord(c) <= ord('Z'):
            res += chr(ord(c) | (1 << 5))
        #Usando ASCII para identificar a letra minuscula, verificando se a letra esta entre a e z minusculo    
        elif ord('a') <= ord(c) <= ord('z'):
            res += chr(ord(c) & ~(1 << 5))      
        else:
            res += c
    return res
if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
    
'''
You are given a string and your task is to swap cases. In other words, convert all lowercase letters to uppercase letters and vice versa.

For Example:

Www.HackerRank.com → wWW.hACKERrANK.COM
Pythonist 2 → pYTHONIST 2  

Function Description

Complete the swap_case function in the editor below.

swap_case has the following parameters:

string s: the string to modify
Returns

string: the modified string

Input Format

A single line containing a string s.

Constraints

0 < len(s) <=1000

Sample Input 0

HackerRank.com presents "Pythonist 2".

Sample Output 0

hACKERrANK.COM PRESENTS "pYTHONIST 2".
'''