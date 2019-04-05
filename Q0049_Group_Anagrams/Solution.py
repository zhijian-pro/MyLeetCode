class Solution:
    def groupAnagrams(self, strs):
        ans = {}
        for i in strs:
            new = tuple(sorted(i))
            if not new in ans:
                ans[new] = []
            ans[new].append(i)
        return list(ans.values())


if __name__ == '__main__':
    re = Solution().groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
    print(re)
