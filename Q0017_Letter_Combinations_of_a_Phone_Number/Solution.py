class Solution:
    res = []
    letter_map = ["",
                  " ",
                  "abc",
                  "def",
                  "ghi",
                  "jkl",
                  "mno",
                  "pqrs",
                  "tuv",
                  "wxyz"]

    # 这里要进行初始化操作
    def __init__(self):
        self.res = []

    def letterCombinations(self, digits: str):
        if digits == "":
            return self.res

        self.find_combination(digits, 0, "")
        return self.res

    def find_combination(self, digits: str, index: int, s: str):
        if len(digits) == index:
            self.res.append(s)
            return self.res

        c = digits[index]
        for i in self.letter_map[ord(c) - ord('0')]:
            self.find_combination(digits, index + 1, s + i)


if __name__ == '__main__':
    print(Solution().letterCombinations("234"))

    print(Solution().letterCombinations(""))
