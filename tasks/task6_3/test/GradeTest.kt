// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun `Mark of -10 gives ?`() {
        assertEquals("?", grade(-10))
    }

    @Test
    fun `Mark of 105 gives ?`() {
        assertEquals("?", grade(105))
    }

    @Test
    fun `Mark of 70 gives a grade of Distinction`() {
        assertEquals("Distinction", grade(70), "mark=70")
    }

    @Test
    fun `Mark of 85 gives a grade of Distinction`() {
        assertEquals("Distinction", grade(85), "mark=85")
    }

    @Test
    fun `Mark of 100 gives a grade of Distinction`() {
        assertEquals("Distinction", grade(100), "mark=100")
    }

    @Test
    fun `Mark of 70 gives a grade of Pass`() {
        assertEquals("Pass", grade(70), "mark=70")
    }

    @Test
    fun `Mark of 40 gives a grade of Pass`() {
        assertEquals("Pass", grade(40), "mark=40")
    }

    @Test
    fun `Mark of 0 gives a grade of Fail`() {
        assertEquals("Fail", grade(0), "mark=0")
    }

    @Test
    fun `Mark of 20 gives a grade of Fail`() {
        assertEquals("Fail", grade(20), "mark=20")
    }

    @Test
    fun `Mark of 39 gives a grade of Fail`() {
        assertEquals("Fail", grade(39), "mark=39")
    }

    @Test
    fun `Outliers outside of given range for -1`() {
        assertEquals("?", grade(-1), "mark=-1")
    }

    @Test
    fun `Outliers outside of given range for 101`() {
        assertEquals("?", grade(101), "mark=101")
    }

    
}
