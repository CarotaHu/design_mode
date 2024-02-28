package github.radishhu.designmode.G模板方法模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/21 10:04 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class CleanerTest {


    @Test
    fun test() {
        val cleanerA: CleanerTemplate = RoomCleaner()
        cleanerA.clearing()
        val cleanerB: CleanerTemplate = StreetCleaner()
        cleanerB.clearing()
    }

}