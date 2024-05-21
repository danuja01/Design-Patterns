package Command;

public class Main {	
	
	public static void main(String[] args) {
		RemoteContrller rc = new RemoteContrller();
		
		Command onKitchenCmd = new OnCommand(new Kitchen());
		Command offKitchenCmd = new OffCommand(new Kitchen());
				
		Command onLivingRoomCmd = new OnCommand(new LivingRoom());
		Command offLivingRommCmd = new OffCommand(new LivingRoom());
		
		Command onGarageCmd = new OnCommand(new Garage());
		Command offGarageCmd = new OffCommand(new Garage());
		
		rc.setCommand(0,onKitchenCmd, offKitchenCmd);
		rc.OnButtonPushed(0);   
		
		rc.setCommand(1, onGarageCmd, offGarageCmd);
		rc.OffButtonPushed(1);
		
		rc.setCommand(2, onLivingRoomCmd, offLivingRommCmd);
		rc.OnButtonPushed(2);
	}
}
