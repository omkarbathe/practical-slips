import math

class circle:
    def __init__(self,r):
        self.r=r;
        
    def getradius(self):
        return self.r;
    
    def area(self):
        return math.pi*self.r*r;

    def __add__(self,another_circle):
        return circle(self.r+another_circle.r)



c1=circle(4)        
c2=circle(5)

c3=c1+c2
print(c3.getradius())