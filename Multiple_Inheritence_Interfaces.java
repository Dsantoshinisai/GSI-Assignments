package Assignments;

interface camera

{
	void takePhoto();
}

interface MusicPlayer
{
	void playMusic();
}
interface SmartFeatures
{
    void connectToWifi();
}

 class Smartphone implements camera ,MusicPlayer ,SmartFeatures
 {
	public void takePhoto()
	 {
		 System.out.println("Photo captured successfully");
	 }

	public void playMusic() 
	{
		System.out.println("Playing music...");
	}
	public void connectToWifi() 
	{
		System.out.println("Connected to WiFi");
	}
 }


public class Multiple_Inheritence_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone obj =new Smartphone();
		obj.takePhoto();
		obj.playMusic();
		obj.connectToWifi();
	}

}
