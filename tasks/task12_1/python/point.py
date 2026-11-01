# Task 12.1: Point class
import math

class point:
    def __init__(self, x: float = 0.0, y: float = 0.0):
        self.x = x
        self.y = y
    
    def distance(self) -> float:
        return math.hypot(self.x, self.y)
    
    def distanceTo(self, other: "Point") -> float:
        return math.hypot(other.x - self.x , other.y - self.y)


