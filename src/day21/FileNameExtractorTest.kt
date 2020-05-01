package day21

import org.junit.Assert.*
import org.junit.Test

class FileNameExtractorTest {
    @Test
    fun testSample() {
        assertEquals(
            "FILE_NAME.EXTENSION",
            FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
        )
        assertEquals(
            "FILE_NAME.EXTENSION",
            FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34")
        )
    }
}