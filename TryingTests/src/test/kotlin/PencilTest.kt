import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PencilTest {

    @Test
    fun sharpnessInfo() {
        val pencil = Pencil(50, "green", 100)
        assertEquals(2, pencil.sharpnessInfo())
    }

    @Test
    fun useWithSharpness2() {
        val pencil = Pencil(50, "green", 100)
        pencil.use()

        assertAll(
            { assertEquals(95, pencil.fill) },
            { assertEquals(1, pencil.sharpnessInfo()) }
        )
    }

    @Test
    fun useWithSharpness0() {
        val pencil = Pencil(50, "green", 100)
        pencil.use()// sharpness become 1
        pencil.use()// sharpness become 0
        pencil.use()// sharpness is 0

        assertAll(
            { assertEquals(90, pencil.fill) },
            { assertEquals(0, pencil.sharpnessInfo()) }
        )
    }

    @Test
    fun sharpenPencil() {
        val pencil = Pencil(50, "green", 100)
        pencil.use()// sharpness become 1
        pencil.use()// sharpness become 0
        pencil.use()// sharpness is 0

        pencil.sharpenPencil()
        assertEquals(3, pencil.sharpnessInfo())
    }
}