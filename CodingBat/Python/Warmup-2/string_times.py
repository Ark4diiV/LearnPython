# Given a string and a non-negative int n, return a larger string that is n copies of the original string.


def string_times(str, n):
    substr = ''
    for i in range(n):
        i += 1
        substr += str
    return substr


print(string_times('Hi', 2))
print(string_times('Hi', 3))
print(string_times('Hi', 1))
