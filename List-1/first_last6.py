#!/usr/bin/python3
# Given an array of ints, return True if 6 appears as either the first or last element in the array. 
# The array will be length 1 or more.

def first_last6(nums):
  lengthArray = len(nums)
  for i in range(lengthArray):
    if (nums[i] == 6 and (i == 0 or i == lengthArray-1)):
      return True
  return False

print(first_last6([13, 6, 1, 2, 3]))
print(first_last6([5, 5]))
print(first_last6([1, 2, 3, 4]))