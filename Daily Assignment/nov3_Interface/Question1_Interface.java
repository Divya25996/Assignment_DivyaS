package nov3_Interface;

interface Camera
{
	void takePhoto();
	void recordVideo();		
}
interface MusicPlayer
{
	void playMusic();
	void stopMusic();
}
class SmartPhone implements Camera, MusicPlayer
{
	    public void takePhoto()
	    {
	        System.out.println("Photo captured successfully.");
	    }

	    public void recordVideo()
	    {
	        System.out.println("Video recording started.");
	    }

	    public void playMusic()
	    {
	        System.out.println("Music is playing.");
	    }

	    public void stopMusic()
	    {
	        System.out.println("Music stopped.");
	    }

	    void makeCall()
	    {
	        System.out.println("Making a phone call.");
	    }
}

public class Question1_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		sp.takePhoto();
		sp.recordVideo();
		sp.playMusic();
		sp.stopMusic();
		sp.makeCall();

	}

}
