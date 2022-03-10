import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

@ExtendWith(MockKExtension::class)
internal class ToyPlaneTest {
    @MockK
    lateinit var pen: Pen
    @MockK
    lateinit var pencil: Pencil

    @ParameterizedTest
    @CsvSource("3, 10, true", "1, 10, false", "3, 50, false", "0, 100, false")
    fun tryFly(sharpness: Int, fill: Int, ans: Boolean) {
        every { pencil.sharpnessInfo() } returns sharpness
        every { pen.fill } returns fill

        val plane = ToyPlane(pencil, pen)

        verify(exactly = 0) { plane.wings.fill }
        assertEquals(ans, plane.tryFly())
    }
}