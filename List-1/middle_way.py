#!/usr/bin/python3
# Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

def middle_way(a, b):
  newArray = []
  newArray.append(a[1])
  newArray.append(b[1])
  return newArray

print(middle_way([1, 9, 7], [4, 8, 8]))
print(middle_way([1, 2, 3], [4, 1, 1]))
print(middle_way([1, 2, 3], [4, 5, 6]))