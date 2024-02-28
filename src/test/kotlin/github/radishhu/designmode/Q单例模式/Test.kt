package github.radishhu.designmode.Q单例模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/26 14:40 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Test {

    @Test
    fun test(){
        SingleBeanUtil.user.show()
        SingleBeanUtil.user.show()
        SingleBeanUtil.user.show()
        SingleBeanUtil.user.show()
    }

}