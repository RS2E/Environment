class TestScript implements ObjectScript {
	void initialize(RS2Environment env) {
		env.registerObjectScript(ObjectDefinition.matchingAction(env, "chop down") as int[], this)
	}
	
	void handleObjectAction(Player player, ObjectAction action) {
		if(action.getOption() == ObjectAction.RightClickOption.CLICK) {
			def object = action.getPosition().getObject()
			
			player.message("You tried to chop down a ${object.getDef().getName().toLowerCase()}.")
		}
	}
}
