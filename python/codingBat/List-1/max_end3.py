#!/usr/bin/python3
# Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. 
# Return the changed array.

def max_end3(nums):
  maxElement = max(nums[0], nums[2])
  nums = []
  for i in range(3):
    nums.insert(i, maxElement)
  return nums

print(max_end3([3, 11, 11]))
print(max_end3([11, 5, 9]))
print(max_end3([0, 0, 1]))