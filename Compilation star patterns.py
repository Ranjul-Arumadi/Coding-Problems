'''
Q: Popular star patterns
   
    Pattern 1:
    
    *
    **
    ***
    ****
    *****
    ******
    
    Pattern 2:
    
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
    
    Pattern 3:
    
        *
       ***
      *****
     *******
    *********
    
    Pattern 4:
    
         *
        * *
       *   *
      *     *
     *       *
    * * * * * * 

Notes:
------
Usually the outer for loop determines the height of the pattern

Output screenshot: https://github.com/Ranjul-Arumadi/Coding-Problems/blob/main/Output%20Screenshots/patterns.jpg
'''

'''*-------------------------Solution in python-------------------------'''

#pattern 1

for i in range(0,7):
    for j in range(i):
        print('*', end="")
    print()    
    
#pattern 2

for i in range(6, 0, -1):
    for j in range(i):
        print('*', end=" ")
    print()    

#pattern 3

print('Enter tree height: ',end='')
height = int(input())
count=1
for i in range(height, 0, -1):
    for j in range(i):
        print(' ', end="")
    for k in range(count):
        print('*', end="")
    count = count+2
    print()    
    
#pattern 4    

print('Enter tree height: ',end='')
height = int(input())
count=1
lineOne = True
for i in range(height, 0, -1):
    for j in range(i):
        print(' ', end="")
    print('*',end="")
    if i==1:
        for x  in range(height-1):
            print(' *',end='')
        exit()
    else:        
        if lineOne==False:
            for k in range(count):
                print(' ',end="")
            print('*',end="")    
            count = count+2
    print()
    lineOne = False
    
    
