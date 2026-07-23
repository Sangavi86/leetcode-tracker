# Last updated: 7/23/2026, 2:55:28 PM
class Solution:
    def isHappy(self, n: int) -> bool:
        l=[]
        l.append(n)
        while n!=1:
            s=0
            for i in str(n):
                s+=int(i)**2
            if s not in l:
                l.append(s)
            else:
                return False
            print(s)
            n=s
        return True