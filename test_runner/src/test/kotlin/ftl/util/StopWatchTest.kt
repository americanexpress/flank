package ftl.util

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class StopWatchTest {

    @Test(expected = RuntimeException::class)
    fun `stopWatch errorOnCheckWithoutStart`() {
        StopWatch().check()
    }

    @Test
    fun `stopWatch recordTime`() {
        val watch = StopWatch().start()
        assertThat(watch.check(indent = true)).isNotEmpty()
        assertThat(watch.check()).isNotEmpty()
    }
}
