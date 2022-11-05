//package sound;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//import sun.audio.*;
//
//public class Sound {
//
//	public static void play(String sndFile) {
//		try {
//			InputStream is = new FileInputStream(sndFile);
//			AudioStream as = new AudioStream(is);
//			AudioPlayer.player.start(as);
//			// Thread.sleep(50);
//			// AudioPlayer.player.stop(as);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
