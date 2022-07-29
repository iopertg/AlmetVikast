public class TroladofunproProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("N\u00E3o tem poder ainda?"), ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (entity instanceof Player _player)
			_player.giveExperienceLevels(9);
	}
}