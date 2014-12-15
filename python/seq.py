import sys

"""
Input
The input will consist of a series of pairs of integers i and j, 
one pair of integers per line. All integers will be less than 
1,000,000 and greater than 0.

Output
For each pair of input integers i and j, output i, j in 
the same order in which they appeared in the input and 
then the maximum cycle length for integers between and 
including i and j. These three numbers should be separated by one space, 
with all three numbers on one line and with one line of output for each line of input.
"""
#Find the number of sequence in n. c should start from 0
def seq(n,c):
	if n == 1:
		return c+1

	elif n % 2 == 0:
		return seq(n / 2, c + 1)
	else:
		return seq(n * 3 + 1, c+1)


#read inputs
input = sys.stdin.readlines()

#print outputs
for x in input:
	list = x.split(" ")
	a = int(list[0])
	b = int(list[1])
	max = seq(a,0)

	for y in range(a, b+1):
		if seq(int(y),0) > max:
			max = seq(int(y),0)
	print str(a) + " " + str(b) + " " + str(max)