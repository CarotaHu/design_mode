package github.radishhu.designmode.J观察者模式

import java.util.*

/**
 * Description: 小黑子B <br>
 * Date: 2024/2/22 13:29 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class BlackGayB:Observer {
    override fun update(o: Observable?, arg: Any?) {
        println("BlackGayB:${arg ?: "我瞎了"}")
    }
}