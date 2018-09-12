#-------------------------------------------------------------------------------
# File--------project1.py
# Developer---Mason Shepherd
# Course------CS1213-01
# Project-----Project #1
# Due---------January 30, 2017
#
# This program computes the cost of a vacation with
# BisonTreks given an input number of travelers, miles
# traveled, and tax rate and displays a receipt for
# the vacation.
#-------------------------------------------------------------------------------

# input values
numberOfTravellers = int(input("Number of travelers--- "))
distanceTravelled = float(input("Miles to destination-- "))
taxRate = float(input("Tax rate (percent)---- "))
print()

# calculated values
costPerTraveller = float(29.99 * distanceTravelled / 100)
subtotal = float(costPerTraveller * numberOfTravellers)
salesTax = float(subtotal * taxRate / 100)
total = subtotal + salesTax

# receipt title
print("""Itemized Receipt
----------------""") 
print()

# re-stated inputs for receipt
print("Number of travelers---",numberOfTravellers)
print("Distance--------------",distanceTravelled,"miles")
print()

# yielded outputs
print("Cost per traveler----- $%7.2f" % costPerTraveller)
print("Subtotal-------------- $%7.2f" % subtotal)
print("Sales tax------------- $%7.2f" % salesTax)
print("Total----------------- $%7.2f" % total)


