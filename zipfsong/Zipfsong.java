import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class Zipfsong {

	public static void main(String[] args) throws IOException {

		//Buffed input and output for optimization
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] values = extractValues(input);
		int songsOnTheAlbum = Integer.valueOf(values[0]);
		int songsToSelect = Integer.valueOf(values[1]);

		TreeSet<Song> allSongs = new TreeSet<Song>();
		
		//Add all songs in order
		for (int i = 1; i <= songsOnTheAlbum; i++) {

			values = extractValues(input);
			long timesListened = Long.valueOf(values[0]);
			allSongs.add(new Song(i, timesListened, values[1]));
		}

		//Only print the ones i need
		for (int i = 0; i < songsToSelect; i++) {
			output.write(allSongs.pollFirst().getName());
			output.newLine();
		}

		output.flush();
		output.close();
	}

	private static String[] extractValues(BufferedReader input)	throws IOException {
		return input.readLine().split(" ");
	}
}