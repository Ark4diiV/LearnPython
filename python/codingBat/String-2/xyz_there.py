#!/usr/bin/python3
# Return True if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). 
# So "xxyz" counts but "x.xyz" does not.

def xyz_there(str):
  if len(str) < 3: return False
  elif str[0:3].endswith('xyz') == True: return True
  for i in range(len(str)-3):
    if str[i:i+1] != '.'  and str[i+1:i+4].endswith('xyz') == True: return True
  return False

print(xyz_there('xyz.abc'))
print(xyz_there('xyz'))
print(xyz_there(''))
print(xyz_there('abc.xyzxyz'))
print(xyz_there('1.xyz.xyz2.xyz'))