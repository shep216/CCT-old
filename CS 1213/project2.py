#-------------------------------------------------------------------------------
# File--------project2.py
# Developer---Mason Shepherd
# Course------CS1213-01
# Project-----Project #2
# Due---------February 10, 2017
#
# This program computes an approximation of pi
# using Wallis's formula and input values for
# the number of iterations and decimal place.
#-------------------------------------------------------------------------------

terms = int(input("How many terms? "))
decimal = int(input("Rounded to what decimal place? "))

pi = 2

for count in range(2,terms*2+1,2):
    element = count**2
    pi = pi * element/(element-1)
    
pi = round(pi,decimal)
print("Estimate of pi: ",pi)
