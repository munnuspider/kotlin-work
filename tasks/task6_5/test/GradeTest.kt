// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here
    "Mark of 55 gives a Pass" {
        grade(55) shouldBe "Pass"
    }

    "Mark between 70 and 100 gives a grade of Distinction"{
        assertSoftly {
            withClue("mark=70") { grade(70) shouldBe "Distinction" }
            withClue("mark=85") { grade(85) shouldBe "Distinction" }
            withClue("mark=100") { grade(100) shouldBe "Distinction" }
        }
    }

    "Mark between 40 and 69 gives a grade of Pass"{
        assertSoftly {
            withClue("mark=40") { grade(40) shouldBe "Pass" }
            withClue("mark=69") { grade(69) shouldBe "Pass" }
        }
    }

    "Mark between 0 and 39 gives a grade of Fail"{
        assertSoftly {
            withClue("mark=0") { grade(0) shouldBe "Fail" }
            withClue("mark=20") { grade(20) shouldBe "Fail" }
            withClue("mark=39") { grade(39) shouldBe "Fail" }
        }
    }

    "Mark outside of 0 and 100 gives a grade of ?"{
        assertSoftly {
            withClue("mark=-1") { grade(-1) shouldBe "?" }
            withClue("mark=-10") { grade(-10) shouldBe "?" }
            withClue("mark=105") { grade(105) shouldBe "?" }
        }
    }

})
