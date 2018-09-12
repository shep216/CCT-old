#-------------------------------------------------------------------------------
# File--------project3.py
# Developer---Mason Shepherd
# Course------CS1213-01
# Project-----Project #3
# Due---------February 20, 2017
#
# This program calculates and displays a customer's
# itemized bill from Burger Blast
#-------------------------------------------------------------------------------

bigBangs = int(input("Number of Big Bangs-- "))
pickles = int(input("Number of pickles---- "))
cheese = input("Cheese (Y or N)------ ") 

costOfBigBangs = bigBangs * 395/100

if pickles > 2:
    costOfPickles = (pickles - 2) * bigBangs * 5/100
else:
    costOfPickles = 0

if cheese == "Y" or cheese == "y":
    costOfCheese = bigBangs * 35/100
else:
    costOfCheese = 0

subtotal = costOfBigBangs + costOfPickles + costOfCheese
tax = subtotal * 6/100
total = subtotal + tax

print()
print("Your Bill From Burger Blast")

print()
print("Big Bangs.. $%5.2f"%costOfBigBangs)
print("Pickles....  %5.2f"%costOfPickles)
print("Cheese.....  %5.2f"%costOfCheese)
print("            ------")
print("Subtotal...  %5.2f"%subtotal)
print("Tax........  %5.2f"%tax)
print("            ------")
print("Total...... $%5.2f"%total)

if pickles > 5:
    print()
    print("Warning! The Surgeon General has determined that eating")
    print("too many pickles may cause hiccups in laboratory rats.")

