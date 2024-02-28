package github.radishhu.designmode.U中介者模式.用户

import github.radishhu.designmode.U中介者模式.中介.Mediator

/**
 * Description: 同事类 <br>
 * Date: 2024/2/27 16:03 <br>
 *
 * @author moon
 * @since 1.0.3
 */
abstract class Colleague(val mediator: Mediator) {

    init {
        mediator.registerColleague(this)
    }

    abstract fun sendMessage(msg: String)
    abstract fun receiveMessage(msg:String)

}