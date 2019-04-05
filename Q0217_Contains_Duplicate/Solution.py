class Solution:
    def containsDuplicate(self, nums) -> bool:
        myset = set()
        for i in nums:
            if i in myset:
                return True
            else:
                myset.add(i)

        return False


if __name__ == '__main__':
    print(Solution().containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]))
