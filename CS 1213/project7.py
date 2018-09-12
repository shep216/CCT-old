#-------------------------------------------------------------------------------
# File--------project7.py
# Developer---Mason Shepherd
# Course------CS1213-01
# Project-----Project #7
# Due---------April 10 2017
#
# This program reads an input file, computes average test scores from
# said file, then writes a new file with the averages displayed.
#-------------------------------------------------------------------------------

#---------------------
# Assigns letter grade
#---------------------

def letter(num):
    if num >= 90:
        lGrade = "A"
    elif num >= 80 and average < 90:
        lGrade = "B"
    elif num >= 70 and average < 80:
        lGrade = "C"
    elif num >= 60 and average < 70:
        lGrade = "D"
    else:
        lgrade = "F"

#-------------
# Main Program
#-------------

infileName = input("Enter infile name: ")
outfileName = input("Enter outfile name: ")

infile = open(infileName, "r")
outfile = open(outfileName, "w")

outfile.write("Student Average Grade\n------- ------- -----\n")

sum = 0
kids = 0

for line in infile:
    kids = kids + 1
    studentList = line.split()
    studentNumber = int(studentList[0])
    exam1 = float(studentList[1])*25/100
    exam2 = float(studentList[2])*25/100
    final = float(studentList[3])*5/10
    average = exam1 + exam2 + final
    sum = sum + average
    grade = str(letter(average))
    outfile.write("%7s%8.1f" % \
              (studentNumber, average) + "     " + grade + "\n")

classAverage = sum/kids
classGrade = str(letter(classAverage))

outfile.write("\n")
outfile.write("  Class" + "%8.1f"%(classAverage) + "     " + classGrade)
              
infile.close() 
outfile.close()
