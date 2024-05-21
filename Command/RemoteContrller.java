package Command;

public class RemoteContrller {
	Command [] on;
	 Command [] off;
	 
	 
	
	public RemoteContrller() {
		this.on = new OnCommand[3];
		this.off = new OffCommand[3];
		
		for(int i=0 ; i < 3 ; i++) {
			this.on[i] = null;
			this.off[i] = null;
		}
	}

	public void setCommand(int slot,Command onKitchenCmd, Command offKitchenCmd) {
		this.on[slot] = onKitchenCmd;
		this.off[slot] = offKitchenCmd;
	}

	void OnButtonPushed(int slot) {
		on[slot].execute();
	}
	
	void OffButtonPushed(int slot) {
		off[slot].execute();
	}
}
