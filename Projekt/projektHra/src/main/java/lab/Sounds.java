package lab;



public class Sounds {

	private boolean soundsEnabled;
	
	
	public Sounds(boolean state) {
		
		this.soundsEnabled=state;
	}
	public Sounds() {}
	
	public void toggleSounds() {
        soundsEnabled = !soundsEnabled;
        if (soundsEnabled) {
            System.out.println("Sounds enabled.");
        } else {
            System.out.println("Sounds disabled.");
        }
    }
}
