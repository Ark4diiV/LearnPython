#!/usr/bin/python3
# Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). 
# Return 0 for no numbers.

def sum67(nums):
  founded6 = False
  sum = 0

  if len(nums) == 0: return 0
  
  for i in range(len(nums)):
    if nums[i] == 6:
        founded6 = True
    elif not founded6:
        sum += nums[i]
    elif nums[i] == 7 and founded6:
        founded6 = False
  
  return sum

print(sum67([1, 2, 2, 6, 33, 7, 4, 5]))
print(sum67([1, 2, 2, 6, 99, 99, 7]))
print(sum67([1, 1, 6, 7, 2]))