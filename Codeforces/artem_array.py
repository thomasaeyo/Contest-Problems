input = [1,1,9,3,2,5]
def recurseRem(input, score):
	cur = 0
	maxI = 0
 
	# Base case
	if len(input) == 2:
		print "Score: " , score
		return
 
	# Find max
	for i in range(0, len(input)-2):
		if ((input[i]+input[i+2]) > maxI):
			maxI = input[i]+input[i+2]
			cur = i
 
	# Remove middle
	input.pop(cur+1)
 
	# Calculate score
	score += min(input[cur], input[cur+1])
 
	# Recurse
	recurseRem(input, score)
 
# Execute the method
recurseRem(input, 0)