package github.radishhu.designmode.R桥梁or桥接模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/26 15:04 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Test {

    @Test
    fun test(){
        val brush1 = CircleBrush(GreenColor())
        brush1.drow()

        val brush2 = CircleBrush(ReadColor())
        brush2.drow()
    }

}