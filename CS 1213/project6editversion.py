#-------------------------------------------------------------------------------
# File--------project6.py
# Developer---Mason Shepherd
# Course------CS1213-01
# Project-----Project #6
# Due---------March 27, 2017
#
# This program translates an English txt file to Pig Latin
#-------------------------------------------------------------------------------

infileName = input("Enter input file name: ")
outfileName = input("Enter output file name: ")

inFile = open(infileName, 'r')
outFile = open(outfileName, 'w')

for line in inFile:
    newLine = ""
    wordlist = line.split()
    for word in wordlist:
        if word.isalpha():
            oink = word[1:] + word[0] + "ay"
            newLine = newLine + " " + oink
        else:
            newLine = newLine + " " + word
    outFile.write(newLine + "\n")
    
inFile.close()
outFile.close()

