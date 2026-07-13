# Last updated: 7/13/2026, 8:53:23 AM
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