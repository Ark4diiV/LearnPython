#!/usr/bin/python3
# Given an array of ints length 3, return the sum of all the elements.

def sum3(nums):
  elementsSum = 0
  for i in range(len(nums)):
    elementsSum += nums[i]
  return elementsSum

print(sum3([5, 11, 2]))
print(sum3([2, 7, 2]))
print(sum3([1, 2, 3]))