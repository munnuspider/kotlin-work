# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
if __name__ == "__main__":
    p = point(3.0, 4.0)
    print(f"x: {p.x}")
    print(f"y: {p.y}")
    print(f"distance from origin: {p.distance()}")
    target = point(6.7, 8.9)
    print(f"distance to target: {p.distanceTo(target)}")