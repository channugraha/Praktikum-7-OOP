public class PemutarLagu{
	
	public String nama;
	public Lagu song;
	
	public PemutarLagu(String namaPemutar){
		song = new Lagu();
	}
	
	public void play(){
		song.play();
	}
	
	public void pause(){
		song.pause();
	}
	
}
