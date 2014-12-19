let _ = 
	let int_list_of_bytes (b : bytes) : int list = 
		let l = ref [] in
		Bytes.iter (fun b' -> if b' = ' ' then () else l := (int_of_char(b') - 48)::!l) b;
		List.rev !l in

	let addFloors (h : int list) (f : int list) : int list = 
		List.rev(List.fold_left2 (fun acc x y -> (x+y)::acc) [] h f) in

	let getMax (l : int list) : int = 
		let rec getMax' l max max_i cur_i = 
			match l with
			| [] -> max_i
			| h::t -> if h >= max then getMax' t h cur_i (cur_i+1) else getMax' t max max_i (cur_i+1) in
		getMax' l 0 1 1 in

	let first_line = read_line() in
	let q = int_of_char(Bytes.get first_line 2) - 48 in

	let heights = ref (int_list_of_bytes(read_line())) in
	let floors = int_list_of_bytes(read_line()) in

	for i=1 to q do
		print_int(getMax !heights);
		print_newline();
		heights := addFloors !heights floors;
	done