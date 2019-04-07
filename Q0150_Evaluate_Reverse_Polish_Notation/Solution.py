class Solution:
    def evalRPN(self, tokens) -> int:
        stack = []
        for i in tokens:
            if i in ["+", "-", "*", "/"]:
                a = stack.pop()
                b = stack.pop()
                if i is "/":
                    stack.append(str(int(eval(b + i + a))))
                else:
                    stack.append(str(eval(b + i + a)))

            else:
                stack.append(i)

        return int(stack.pop())


if __name__ == '__main__':
    print(Solution().evalRPN(["4", "-2", "/", "2", "-3", "-", "-"]))
