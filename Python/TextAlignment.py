#Replace all ______ with rjust, ljust or center. 

width = int(input()) #widths is odd and 0 < width < 50
t = width*2
c = "H"
#top arrow
for a in range(1,t,2):
    print((c*a).center(t))
#top pillars
for a in range(width+1):
     print((c*width).center(t)+" ".center(t)+(c*width).center(t))
#center
for a in range((width+1)//2):
     print((c*width*5).center(t*3))
#bottom pillars
for a in range(width+1):
     print((c*width).center(t)+" ".center(t)+(c*width).center(t))
#bottom arrow
for a in reversed(range(1,t,2)):
    print(" ".center(t*2)+(c*a).center(t))

'''
In Python, a string of text can be aligned left, right and center.

.ljust(width)

This method returns a left aligned string of length width.

>>> width = 20
>>> print 'HackerRank'.ljust(width,'-')
HackerRank----------  

.center(width)

This method returns a centered string of length width.

>>> width = 20
>>> print 'HackerRank'.center(width,'-')
-----HackerRank-----

.rjust(width)

This method returns a right aligned string of length width.

>>> width = 20
>>> print 'HackerRank'.rjust(width,'-')
----------HackerRank

Task

You are given a partial code that is used for generating the HackerRank Logo of variable thickness.
Your task is to replace the blank (______) with rjust, ljust or center.

Input Format

A single line containing the thickness value for the logo.

Constraints

The thickness must be an odd number.

0 < thickness < 50

Output Format

Output the desired logo.

Sample Input

5

Sample Output

    H    
   HHH   
  HHHHH  
 HHHHHHH 
HHHHHHHHH
  HHHHH               HHHHH             
  HHHHH               HHHHH             
  HHHHH               HHHHH             
  HHHHH               HHHHH             
  HHHHH               HHHHH             
  HHHHH               HHHHH             
  HHHHHHHHHHHHHHHHHHHHHHHHH   
  HHHHHHHHHHHHHHHHHHHHHHHHH   
  HHHHHHHHHHHHHHHHHHHHHHHHH   
  HHHHH               HHHHH             
  HHHHH               HHHHH             
  HHHHH               HHHHH             
  HHHHH               HHHHH             
  HHHHH               HHHHH             
  HHHHH               HHHHH             
                    HHHHHHHHH 
                     HHHHHHH  
                      HHHHH   
                       HHH    
                        H 
'''