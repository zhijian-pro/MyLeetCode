class Solution:
    def repeatedNTimes(self, A: List[int]) -> int:

        for i, v in enumerate(A):
            if i < len(A) - 1 and v == A[i + 1]:
                return v

        return A[0] if (A[0] == A[2] or A[0] == A[3]) else A[1]


list_1 = [1, 3, 2, 3]
print(Solution().repeatedNTimes(list_1))
