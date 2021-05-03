#!/usr/bin/python3
# Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. 
# If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. 
# Use int division to produce the final average. 
# You may assume that the array is length 3 or more.

def centered_average(nums):
  maxElement = nums[0]
  minElement = nums[0]
  centeredAverage = 0
  
  for i in nums:
    maxElement = max(i, maxElement)
    minElement = min(i, minElement)
    centeredAverage += i

  centeredAverage = (centeredAverage - maxElement - minElement) // (len(nums) - 2)
  return centeredAverage

print(centered_average([0, 2, 3, 4, 100]))
print(centered_average([7, 7, 7]))
print(centered_average([1000, 0, 1, 99]))
print(centered_average([-10, -4, -2, -4, -2, 0]))