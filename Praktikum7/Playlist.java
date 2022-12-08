public class Playlist{

	public String nama;
	
	public void play(Lagu e){
		e.play();
	}
	
	public void pause(Lagu e){
		e.pause();
	}
	
	public void autoPlay(){
		System.out.println("Memainkan lagu secara otomatis ");
	}
}
	