#!/usr/bin/python3
# Given an array of ints, return True if the array is length 1 or more, and the first element and the last element are equal.

def same_first_last(nums):
  if len(nums) == 0: return False
  if len(nums) == 1: return True
  return nums[0] == nums[len(nums)-1]

print(same_first_last([]))
print(same_first_last([1, 2, 3, 4, 5, 13]))
print(same_first_last([13, 2, 3, 4, 5, 13]))