#-------------------------------------------------------------------------------
# File--------project8.py
# Developer---Mason Shepherd
# Course------CS1213-01
# Project-----Project #8
# Due---------April 17 2017
#
# This program peeves off pigeons.
#-------------------------------------------------------------------------------

#-------------------------------------------------------------------------------
# Function for distance traveled where 'a' is the angle and 'd' is the draw
# length, 'f' is the distance traveled.
#-------------------------------------------------------------------------------

def flight(a, d):
    import math
    f = (((10*d)**2)*(math.sin(math.radians(a)*2)))/32.2
    return f

#-------------------------------------------------------------------------------
# Main program.
#-------------------------------------------------------------------------------

goalDistance = float(input("Distance to pig (feet) -------- "))
print()
angle = float(input("Angle of elevation (degrees) -- "))
draw = float(input("Draw length (inches) ---------- "))
print()

stone = flight(angle, draw)
while stone > goalDistance + 2 or stone < goalDistance - 2:
    if stone > goalDistance + 2:
        long = stone - (goalDistance + 2)
        print("Result of shot ---------------- %d feet too long"%long)
        print()
        angle = float(input("Angle of elevation (degrees) -- "))
        draw = float(input("Draw length (inches) ---------- "))
        print()
    else:
        short = (goalDistance - 2) - stone
        print("Result of shot ---------------- %d feet too short"%short)
        print()
        angle = float(input("Angle of elevation (degrees) -- "))
        draw = float(input("Draw length (inches) ---------- "))
        print()
    stone = flight(angle, draw)
    
print("Result of shot ---------------- OINK!!")
