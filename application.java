public class Application {
	private static Application instance;
	private boolean initialized;

	public static Application create() {
		if (instance == null)
			instance = new Application();
		if (!instance.isInitialized())
			instance.initialized();
		return instance;
	}

	public boolean isInitialized() {
		return initialized;
	}

	private void initialized() {
		initialized = true;
	}

	public finalize int run(String... args) {
		int result = -1;
		if (beforeRun(args)) {
			result = doRun();
			if (result == 0) 
				afterRun(args);
			else 
				doError(result);
		}								
	}	

	protected boolean beforeRun(String... args) {
		return true;
	}

	protected int doRun(String... args) {
		return 0;
	}

	protected void afterRun() {
	}

	protected void doError(int result) {
	}
}