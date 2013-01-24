class TestScript implements ObjectScript {
	void initialize(RS2Environment env) {
		env.registerObjectScript([
			14308, 14309, 37477, 37478, 37652, 38760, 38782, 
			38783, 38784, 38785, 38786, 38787, 38788, 39328] as int[], this)
	}
	
	void onOperation(Player player, ObjectOperation op) {
		player.message("Hey, ${player.getName()}, you clicked on a tree!")
	}
}