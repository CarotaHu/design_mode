package github.radishhu.designmode.Q单例模式

import kotlin.random.Random

/**
 * Description:  <br>
 * Date: 2024/2/26 14:37 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class SingleBeanUtil {

    companion object{
        val user = User("王老吉",Random(1).nextInt())
    }

}