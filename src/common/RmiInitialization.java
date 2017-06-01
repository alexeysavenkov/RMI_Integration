package common;

public class RmiInitialization {
	static {
		System.setProperty("java.security.policy","file:" + System.getProperty("user.dir") + "/security.policy");
		//System.setProperty("java.rmi.server.codebase", System.getProperty("user.dir") + "/bin/functions");
	}
}
