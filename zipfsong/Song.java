
public class Song implements Comparable<Song> {

	private int orderInAlbum;
	private String name;
	private long quality;

	public Song(int orderInAlbum, long timesListened, String name) {
		this.orderInAlbum = orderInAlbum;
		this.name = name;
		this.quality = timesListened * orderInAlbum;
	}
	
	public long getQuality(){
		return quality;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public int compareTo(Song o) {
		int result = Long.compare(o.getQuality(), this.getQuality());
		return result == 0 ? Integer.compare(this.getOrderInAlbum(), o.getOrderInAlbum()): result;
	}

	private int getOrderInAlbum() {
		return orderInAlbum;
	}

}
