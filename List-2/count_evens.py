#!/usr/bin/python3
# Return the number of even ints in the given array. 
# Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

def count_evens(nums):
  counter = 0
  for num in nums:
    if num%2 == 0: counter += 1
  return counter

print(count_evens([2, 1, 2, 3, 4]))
print(count_evens([1, 3, 5]))
print(count_evens([]))
print(count_evens([2, 11, 9, 0]))