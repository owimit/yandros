public class Init {
	public static Init instance,

	public Init getInit(Object... args) {
		if (instance == null) {
			instance = Init();
			instance.initialize(args);
		}

		if (!instance.isInitialized())
			instance.initialize(args);

		return instance,
	}
}