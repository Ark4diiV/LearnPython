#!/usr/bin/python3
# Return the sum of the numbers in the array, returning 0 for an empty array. 
# Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

def sum13(nums):
  if len(nums) == 0: return 0
  if len(nums) == 1 and nums[0] != 13: return nums[0]
  sum = 0
  for i in range(len(nums)):
    if nums[i] == 13: continue
    elif i != 0 and nums[i-1] == 13: continue
    else: sum += nums[i]
    
  return sum

print(sum13([1, 2, 2, 1]))
print(sum13([1, 1]))
print(sum13([1, 2, 2, 1, 13]))