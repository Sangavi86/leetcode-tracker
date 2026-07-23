# Last updated: 7/23/2026, 2:57:15 PM
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d={}
        for i in strs:
            s="".join(sorted(i))
            if s not in d:
                d[s]=[i]
            else:
                d[s].append(i)
        return list(d.values())