package day81


val notes = arrayOf("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#")
fun whichNote(keyPressCount: Int) = notes[(keyPressCount - 1) % 88 % 12]