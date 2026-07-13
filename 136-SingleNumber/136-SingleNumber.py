# Last updated: 7/13/2026, 8:53:56 AM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        d={}
        for i in nums:
            if i not in d:
                d[i]=1
            else:
                del d[i]
        return list(d.keys())[0]