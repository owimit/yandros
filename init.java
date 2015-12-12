public class Init {
	private boolean initialized;

	public Init getInit(Object... args) {
		if (instance == null) {
			instance = Init();
			instance.initialize(args);
		}

		if (!instance.isInitialized())
			instance.initialize(args);

		return instance,
	}

	public boolean isInitialized() {
		return initialized;
	}

}