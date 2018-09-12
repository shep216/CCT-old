#-------------------------------------------------------------------------------
# File--------project9.py
# Developer---Mason Shepherd
# Course------CS1213-01
# Project-----Project #9
# Due---------April 24 2017
#
# This program counts palindromes in a txt file input by user.  
#-------------------------------------------------------------------------------

#-------------------------------------------------------------------------------
# This function indicates whether a given string is a palindrome.
#-------------------------------------------------------------------------------

def palindrome(string):
    if #string is palindrome:
        return True
    else:
        return False

#-------------------------------------------------------------------------------
# This is the function for the main program.
#-------------------------------------------------------------------------------

def main():
    number = 0
    file = open(input("Enter file name: "))
    for line in file:
        if palindrome(line):
            number = number + 1
            print(number, line)

#-------------------------------------------------------------------------------
# Execution.
#-------------------------------------------------------------------------------

main()
