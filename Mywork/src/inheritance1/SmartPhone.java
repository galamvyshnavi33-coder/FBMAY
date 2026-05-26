package inheritance1;

public class SmartPhone implements Camera{
	public void takePhoto()
	{
		System.out.println("photo captured");
	}
	public void playMusic()
	{
		System.out.println("music is playing");
	}

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.takePhoto();
		s.playMusic();
		
		

	}

}
