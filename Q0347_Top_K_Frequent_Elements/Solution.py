class Solution:
    def topKFrequent(self, nums, k: int):
        from collections import Counter
        c = Counter(nums)
        list_res = c.most_common(k)
        res = []
        for item in list_res:
            res.append(item[0])
        return res


if __name__ == '__main__':
    print(Solution().topKFrequent([1, 2, 3, 4, 51, 2, 2], 2))
