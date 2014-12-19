let _  = 
	let tallest_index (h : int list ref) = 
		let rec tallest_index' (h : int list) (m : int) (max_i : int) (cur_i : int): int =
			match h with
			| [] -> max_i
			| x::xs -> 
				if x > m then tallest_index' xs x (cur_i) (cur_i+1)
				else tallest_index' xs m max_i (cur_i+1)
		in
		tallest_index' !h 0 1 1
	in

	let add_floors (h : int list ref) (f : int list ref) : unit = 
		let new_h = List.rev(List.fold_left2 (fun acc x y -> (x+y)::acc) [] !h !f) in
		h := new_h
	in

	let first_line = read_line() in
	let n = int_of_char(Bytes.get first_line 0) - 48 in
	let q = int_of_char(Bytes.get first_line 2) - 48 in
	let heights = ref [] in
	let floors = ref [] in
	
	let second_line = read_line() in

	for i = 0 to n-1 do
		let h = int_of_char(Bytes.get second_line (2*i)) - 48 in
		heights := h::(!heights)
	done;
	heights := List.rev(!heights);

	let third_line = read_line() in

	for i = 0 to n-1 do
		let f = int_of_char(Bytes.get third_line (2*i)) - 48 in
		floors := f::(!floors)
	done;	
	floors := List.rev(!floors);

	for i = 1 to q do
		add_floors heights floors;
		print_int (tallest_index heights);
		print_newline ();
	done