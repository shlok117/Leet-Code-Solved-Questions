class Solution:
    def maxArea(self, height: list[int]) -> int:
        left = 0
        right = len(height)-1
        maxA = 0
        for i in range(len(height)):
            width = right - left
            lft = height[left]
            rgt = height[right]
            curr = min(rgt,lft)*width
            maxA = max(maxA,curr)
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return maxA





        