package onlineFitnessTrain;

public class OnlineSpectator extends Spectator {

	private String _ip;
	private String _platform;
	
	public OnlineSpectator(String name) {
		super(name);
	}
	
	public OnlineSpectator(String name, String platform) {
		super(name);
		
		_platform = platform;
	}

	public OnlineSpectator(String name, String ip, String platform) {
		super(name);
		
		_ip = ip;
		_platform = platform;
	}
	
	public String getIp() {
		return _ip;
	}
	
	public String getPlatform() {
		return _platform;
	}
	
	@Override
	public String toString() {
		String returnString = this.getName() + " (IP: " + (_ip != null ? _ip : "No ip") + ", Platform: " + _platform + ")";
		return returnString;
	}
}
