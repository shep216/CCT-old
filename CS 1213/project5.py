#-------------------------------------------------------------------------------
# File--------project5.py
# Developer---Mason Shepherd
# Course------CS1213-01
# Project-----Project #5
# Due---------March 10, 2017
#
# This program computes how many months are required
# to pay off an input loan with a given interest rate.
#-------------------------------------------------------------------------------

P = float(input("Principal-------- "))
AnnInt = float(input("Annual interest-- "))
payment = float(input("Monthly payment-- "))
print()

MonInt = AnnInt/12
MonIntOfP = P * MonInt/100
TotalInt = 0
months = 0

while P > 0:
    if payment <= MonIntOfP:
        print("Loan not approved.")
        break
    elif payment > MonIntOfP:
        if payment < MonIntOfP + P:
            P = P - (payment - MonIntOfP)
            TotalInt = TotalInt + MonIntOfP
            MonIntOfP = P * MonInt/100
            months = months + 1
        else:
            TotalInt = TotalInt + MonIntOfP
            months = months + 1
            print("Months   :",months)
            print("Interest : $%6.2f"%TotalInt)
            break
  


