if k > halfElements:
    return 1 - recursion(n, k - halfElements)
else:
    return recursion(n - 1, k)