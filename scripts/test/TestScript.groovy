class TestScript implements ObjectScript {
	void initialize(RS2Environment env) {
		env.registerObjectScript(ObjectDefinition.matchingAction(env, "chop down") as int[], this)
	}
	
	void handleObjectOperation(Player player, ObjectOperation operation) {
		if(operation.getOption() == ObjectOperation.RightClickOption.CLICK) {
			def object = operation.getPosition().getObject()
			
			player.message("Hey, ${player.getName()}, you tried to chop down a ${object.getDef().getName().toLowerCase()}.")
		}
	}
}