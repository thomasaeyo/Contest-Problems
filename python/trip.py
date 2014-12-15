input = [line.strip() for line in open("trip1.txt", "r")]
print input

while input[0] != 0:
	n = input.pop(0)
	expenditure = []
	for x in xrange(n):
		expenditure.append(input.pop(0))
		