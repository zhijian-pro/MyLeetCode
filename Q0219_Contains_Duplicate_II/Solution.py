class Solution:
    def containsNearbyDuplicate(self, nums, k: int) -> bool:
        my_set = set()
        for i, v in enumerate(nums):
            if v in my_set:
                return True
            my_set.add(v)

            if len(my_set) == k + 1:
                my_set.remove(nums[i - k])

        return False


if __name__ == '__main__':
    print(Solution().containsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2))
