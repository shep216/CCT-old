#-------------------------------------------------------------------------------
# File--------project4.py
# Developer---Mason Shepherd
# Course------CS1213-01
# Project-----Project #4
# Due---------March 3, 2017
#
# This program computes and displays the average weight for input weights of
# pumpkins, how many are small, medium and large based off of their weights,
# and the weight of the heaviest pumpkin.
#-------------------------------------------------------------------------------

print("Pumpkin weights")
print("---------------")
print()

weight_number = 1
sum = 0.0
small_pumpkins = 0
medium_pumpkins = 0
large_pumpkins = 0

pumpkin_weight = float(input("Weight #%i: "%(weight_number)))
heaviest = pumpkin_weight
   
while pumpkin_weight >= 0:
    weight_number = weight_number + 1
    sum = sum + pumpkin_weight
    if pumpkin_weight < 3:
        small_pumpkins =small_pumpkins + 1
    elif pumpkin_weight >= 3 and pumpkin_weight <= 14:
        medium_pumpkins =medium_pumpkins + 1
    else:
        large_pumpkins =large_pumpkins + 1
    pumpkin_weight = float(input("Weight #%i: "%(weight_number)))
    if pumpkin_weight > heaviest:
        heaviest = pumpkin_weight

average_weight = sum/(weight_number - 1)

print()
print("Average weight: %4.1f"%average_weight,"kilograms")
print()

print("Small pumpkins :",small_pumpkins)
print("Medium pumpkins:",medium_pumpkins)
print("Large pumpkins :",large_pumpkins)
print()

print("Heaviest pumpkin: %4.1f"%heaviest,"kilograms")
