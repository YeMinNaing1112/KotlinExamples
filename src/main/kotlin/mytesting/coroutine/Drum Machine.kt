package mytesting.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.File
import javax.sound.sampled.AudioSystem

fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")

    var count = 0
    for (part in parts) {
        count += part.length + 1;
        if (part == "") {
            playSong(file)
        } else {
            Thread.sleep(100 * (part.length + 1L))
            if (count < beats.length) {
                playSong(file)
            }
        }
    }
}


fun playSong(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputString = AudioSystem.getAudioInputStream(
        File(
            file
        )
    )
    clip.open(audioInputString)
    clip.start()

}

fun main() {

//    playBeats("x-x-x-x-x-x-x", "audio/toms.aiff")
//    playBeats("x------x--------", "audio/crash_cymbal.aiff")

//    GlobalScope.launch {
//        playBeats("x-x-x-x-x-x-x", "audio/toms.aiff")
//    }
//    playBeats("x------x--------", "audio/crash_cymbal.aiff")


//    runBlocking {
//        launch {
//            playBeats("x-x-x-x-x-x-x", "audio/toms.aiff")
//        }
//        playBeats("x------x--------", "audio/crash_cymbal.aiff")
//
//    }

}