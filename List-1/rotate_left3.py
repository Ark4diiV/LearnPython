#!/usr/bin/python3
# Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

def rotate_left3(nums):
  newArray = []
  for i in range(len(nums)):
    newArray.insert(i-1, nums[i])
  return newArray

print(rotate_left3([5, 11, 9]))
print(rotate_left3([1, 2, 1]))
print(rotate_left3([1, 2, 3]))