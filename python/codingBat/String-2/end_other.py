#!/usr/bin/python3
# Given two strings, return True if either of the strings appears at the very end of the other string, 
# ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
# Note: s.lower() returns the lowercase version of a string.

def end_other(a, b):
  A = a.lower()
  B = b.lower()
  if len(A) < len(B): return B.endswith(A)
  elif len(A) > len(B): return A.endswith(B)
  else: return A.endswith(B)
  
print(end_other('yz', '12xz'))
print(end_other('xyz', '12xyz'))
print(end_other('abcXYZ', 'abcDEF'))