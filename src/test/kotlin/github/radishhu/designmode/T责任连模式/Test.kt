package github.radishhu.designmode.T责任连模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/27 9:35 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Test {

    @Test
    fun test(){
        val requestA = Request("a")
        val requestB = Request("b")
        val requestC = Request("c")

        val c = HanlderA(null, "c")
        val b = HanlderB(c, "b")
        val a = HanlderC(b, "a")

        a.handle(requestA)
        a.handle(requestB)
        a.handle(requestC)
    }

}