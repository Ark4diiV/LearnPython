#!/usr/bin/python3
# Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
# Note: the built-in min(v1, v2) and max(v1, v2) functions return the smaller or larger of two values.

def big_diff(nums):
  maxElement = nums[0]
  minElement = nums[0]
  for i in nums:
    maxElement = max(i, maxElement)
    minElement = min(i, minElement)
  return maxElement - minElement

print(big_diff([10, 2]))
print(big_diff([2]))
print(big_diff([7, 7, 6, 8, 5, 5, 6]))
print(big_diff([2, 10, 7, 2]))