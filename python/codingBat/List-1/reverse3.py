#!/usr/bin/python3
# Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

def reverse3(nums):
  nums.reverse()
  return nums

print(reverse3([2, 11, 3]))
print(reverse3([0, 6, 5]))
print(reverse3([5, 11, 9]))