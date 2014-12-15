"""
Input:
The input will consist of an arbitrary number of fields. 
The first line of each field contains two integers n and m ( 0 < n, m$ \le$100) 
which stand for the number of lines and columns of the field, respectively. 
Each of the next n lines contains exactly m characters, representing the field.

Safe squares are denoted by ``.'' and mine squares by ``*,'' both without the quotes. 
The first field line where n = m = 0 represents the end of input and should not be processed.

Output:
For each field, print the message Field #x: on a line alone, 
where x stands for the number of the field starting from 1. 
The next n lines should contain the field with the ``.'' characters 
replaced by the number of mines adjacent to that square. 
There must be an empty line between field outputs.
"""


input = [line.strip() for line in open("minefield1.txt", "r")]
#print input
def printm(m):
	for r in xrange(len(m)):
		s = ""
		for c in xrange(len(m[0])):
			s += str(m[r][c])
		print s

field_n = 0
while input[0] != "0 0":
	field_n += 1
	rowcol = input.pop(0)
	row = int(rowcol[0:1])
	col = int(rowcol[2:3])

	#minefield matrix
	field = [[0 for x in xrange(col)] for x in xrange(row)]
	#empty list to store the mine location in two digits "13" = row 1 col 3
	minelist = []

	#find the location of mines and put it in field
	for r in xrange(row):
		for c in xrange(col):
			mine = 0
			if input[r][c:c+1] == "*":
				field[r][c] = "*"
				minelist.append(str(r) + str(c))


	#increment the values of locations next to mine			
	for x in xrange(len(minelist)):
		m_r = int(minelist[x][0:1])
		m_c = int(minelist[x][1:2])
		if m_r == 0:
			if m_c == 0:
				if field[m_r + 1][m_c + 1] != "*": field[m_r + 1][m_c + 1] += 1
				if field[m_r + 1][m_c] != "*": field[m_r +1][m_c] += 1
				if field[m_r][m_c + 1] != "*": field[m_r][m_c + 1] += 1
			elif m_c == c:
				if field[m_r + 1][m_c] != "*": field[m_r + 1][m_c] += 1
				if field[m_r + 1][m_c - 1] != "*": field[m_r +1][m_c - 1] += 1
				if field[m_r][m_c - 1] != "*": field[m_r][m_c - 1] += 1
			else:
				if field[m_r + 1][m_c + 1] != "*": field[m_r + 1][m_c + 1] += 1
				if field[m_r + 1][m_c] != "*": field[m_r +1][m_c] += 1
				if field[m_r + 1][m_c - 1] != "*": field[m_r +1][m_c - 1] += 1
				if field[m_r][m_c + 1] != "*": field[m_r][m_c + 1] += 1
				if field[m_r][m_c - 1] != "*": field[m_r][m_c - 1] += 1
		elif m_r == r:
			if m_c == 0:
				if field[m_r - 1][m_c + 1] != "*": field[m_r - 1][m_c + 1] += 1
				if field[m_r - 1][m_c] != "*": field[m_r - 1][m_c] += 1
				if field[m_r][m_c + 1] != "*": field[m_r][m_c + 1] += 1
			elif m_c == c:
				if field[m_r - 1][m_c] != "*": field[m_r - 1][m_c] += 1
				if field[m_r - 1][m_c - 1] != "*": field[m_r - 1][m_c - 1] += 1
				if field[m_r][m_c - 1] != "*": field[m_r][m_c - 1] += 1
			else:
				if field[m_r - 1][m_c + 1] != "*": field[m_r - 1][m_c + 1] += 1
				if field[m_r - 1][m_c] != "*": field[m_r - 1][m_c] += 1
				if field[m_r - 1][m_c - 1] != "*": field[m_r - 1][m_c - 1] += 1
				if field[m_r][m_c + 1] != "*": field[m_r][m_c + 1] += 1
				if field[m_r][m_c - 1] != "*": field[m_r][m_c - 1] += 1
		else:
			if m_c == 0:
				if field[m_r + 1][m_c] != "*": field[m_r + 1][m_c] += 1
				if field[m_r - 1][m_c] != "*": field[m_r - 1][m_c] += 1
				if field[m_r][m_c + 1] != "*": field[m_r][m_c + 1] += 1
				if field[m_r + 1][m_c + 1] != "*": field[m_r + 1][m_c + 1] += 1
				if field[m_r - 1][m_c + 1] != "*": field[m_r - 1][m_c + 1] += 1
			elif m_c == c:
				if field[m_r - 1][m_c] != "*": field[m_r - 1][m_c] += 1
				if field[m_r + 1][m_c] != "*": field[m_r + 1][m_c] += 1
				if field[m_r][m_c - 1] != "*": field[m_r][m_c - 1] += 1
				if field[m_r + 1][m_c - 1] != "*": field[m_r + 1][m_c - 1] += 1
				if field[m_r - 1][m_c - 1] != "*": field[m_r - 1][m_c - 1] += 1
			else:
				if field[m_r + 1][m_c + 1] != "*": field[m_r + 1][m_c + 1] += 1
				if field[m_r + 1][m_c] != "*": field[m_r +1][m_c] += 1
				if field[m_r + 1][m_c - 1] != "*": field[m_r +1][m_c - 1] += 1
				if field[m_r - 1][m_c + 1] != "*": field[m_r - 1][m_c + 1] += 1
				if field[m_r - 1][m_c] != "*": field[m_r - 1][m_c] += 1
				if field[m_r - 1][m_c - 1] != "*": field[m_r - 1][m_c - 1] += 1
				if field[m_r][m_c + 1] != "*": field[m_r][m_c + 1] += 1
				if field[m_r][m_c - 1] != "*": field[m_r][m_c - 1] += 1
	for i in xrange(row):
		input.pop(0)
	print("Field #%s:" %str(field_n))
	printm(field)
	print ""