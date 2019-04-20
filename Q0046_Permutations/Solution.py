class Solution:
    def permute(self, nums):
        if nums is None:
            return []
        if len(nums) == 1:
            return [nums]

        res = []

        for x in nums:
            ys = nums + []
            ys.remove(x)
            for i in self.permute(ys):
                res.append([x] + i)
        return res


if __name__ == '__main__':
    print(Solution().permute([1, 2, 3]))
