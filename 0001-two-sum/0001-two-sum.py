class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dictCheck = {}
        for i in range(len(nums)):
            element = target - nums[i]
            if element in dictCheck:
                return [dictCheck[element],i]
            dictCheck[nums[i]]=i
        return []

        
                        