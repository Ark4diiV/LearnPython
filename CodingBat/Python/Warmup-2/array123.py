# Given an array of ints, return True if the sequence of numbers 1, 2, 3 appears in the array somewhere.


def array123(nums):
    subarray = [1, 2, 3]

    for i in range(len(nums)):
        if nums[i:i + 3] == subarray:
            return True
    return False


print(array123([1, 1, 2, 3, 1]))
print(array123([1, 1, 2, 4, 1]))
print(array123([1, 1, 2, 1, 2, 3]))