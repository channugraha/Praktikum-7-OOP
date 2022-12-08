public class MainProgram{
	
	public static void main(String[] args){
		
		Lagu song = new Lagu();
		
		song.judul = "The Night - Avicii";
		song.durasi = 3;
		System.out.println("Title : " + song.judul);
		System.out.println("Duration : " + song.durasi + " min" + "\n");
		
		Pendengar andi = new Pendengar();
		
		andi.nama = "Andi Santoso";
		andi.song = song;
		andi.play();
		andi.pause();
		System.out.println("Nama Pendengar: " + andi.nama + "\n");
		
		Playlist rock = new Playlist();
		rock.nama = "Playlist Rock";
		rock.play(song);
		rock.pause(song);
		rock.autoPlay();
		System.out.println("Nama Playlist : " + rock.nama + "\n");
		
		PemutarLagu ipod = new PemutarLagu("Ipod New");
		ipod.nama = "Ipod New 2022";
		ipod.play();
		ipod.pause();
		System.out.println("Pemutar Lagu  : " + ipod.nama + "\n");
	}
		
}