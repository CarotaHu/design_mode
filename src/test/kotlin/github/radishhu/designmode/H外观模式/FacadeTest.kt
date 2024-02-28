package github.radishhu.designmode.H外观模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/21 10:22 <br>
 * 外观模式就是将一堆杂乱的接口整理归档，方便使用者调用，多用在不同应用的对接上 <br>
 * @author moon
 * @since 1.0.3
 */
class FacadeTest {
    @Test
    fun test() {
        val facade = Facade()

        // 面试流程
        facade.interview()
        println()
        // 上班流程
        facade.work()
    }

}