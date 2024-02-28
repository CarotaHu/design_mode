package github.radishhu.designmode.J观察者模式

import java.util.*

/**
 * Description: 小黑子A <br>
 * Date: 2024/2/22 13:29 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class BlackGayA:Observer {

    override fun update(o: Observable?, arg: Any?) {
        println("BlackGayA:${arg ?: "我瞎了"}")
    }
}