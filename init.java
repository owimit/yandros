public class Init {
	private static Init instance;
	private boolean initialized;
	private String signature;

	public Init getInit(Object... args) {
		if (instance == null) {
			instance = Init();
			instance.initialize(args);
		}

		if (!instance.isInitialized())
			instance.initialize(args);

		return instance;
	}

	public boolean isInitialized() {
		return initialized;
	}
}