// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "single element list" {
        median(listOf(4.5f)) shouldBe (4.5 plusOrMinus tolerance)
    }

    "odd numebr of sorted elements" {
        median(listOf(1.0f, 3.0f, 7.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }

    "even number of elements" {
        median(listOf(1.0f, 2.0f, 4.0f, 6.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }

    "unsorted list with negative integers" {
        median(listOf(-2.0f, 9.0f, 5.0f, 0.0f, 3.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }
})
