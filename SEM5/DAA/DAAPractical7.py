def print_tracing_table(X, Y, dp):
    m = len(X)
    n = len(Y)
    
    # Print the tracing table
    for i in range(m + 1):
        for j in range(n + 1):
            print(dp[i][j], end="\t")
        print()

def longest_common_subsequence(X, Y):
    m = len(X)
    n = len(Y)
    
    # Create a 2D table to store the length of LCS
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    
    # Build the tracing table
    for i in range(1, m + 1):
        for j in range(1, n + 1):
            if X[i - 1] == Y[j - 1]:
                dp[i][j] = dp[i - 1][j - 1] + 1
            else:
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
    
    # Print the tracing table
    print("Tracing Table:")
    print_tracing_table(X, Y, dp)
    
    # Trace back to find the LCS
    lcs = []
    i, j = m, n
    while i > 0 and j > 0:
        if X[i - 1] == Y[j - 1]:
            lcs.append(X[i - 1])
            i -= 1
            j -= 1
        elif dp[i - 1][j] > dp[i][j - 1]:
            i -= 1
        else:
            j -= 1
    
    # Reverse and return the LCS
    return ''.join(reversed(lcs))

# Example usage:
X = "ACCGGTCGAGTG"
Y = "GTCGTTCGGAAT"
lcs = longest_common_subsequence(X, Y)
print("LCS: ",lcs)