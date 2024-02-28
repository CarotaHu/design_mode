package github.radishhu.designmode.U中介者模式.用户

import github.radishhu.designmode.U中介者模式.中介.Mediator

/**
 * Description:  <br>
 * Date: 2024/2/27 16:17 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Landlord(mediator: Mediator): Colleague(mediator) {
    override fun sendMessage(msg: String) {
        mediator.sendMessage(msg,this)
    }

    override fun receiveMessage(msg: String) {
        println("房东接收到信息:${msg}")
    }
}