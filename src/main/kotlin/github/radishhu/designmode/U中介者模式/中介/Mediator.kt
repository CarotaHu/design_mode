package github.radishhu.designmode.U中介者模式.中介

import github.radishhu.designmode.U中介者模式.用户.Colleague

/**
 * Description: 中介者接口 <br>
 * Date: 2024/2/27 16:01 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface Mediator {

    fun registerColleague(colleague: Colleague)
    fun sendMessage(msg:String,colleague: Colleague)

}