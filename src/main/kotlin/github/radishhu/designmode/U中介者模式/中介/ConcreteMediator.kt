package github.radishhu.designmode.U中介者模式.中介

import github.radishhu.designmode.U中介者模式.用户.Colleague

/**
 * Description:  <br>
 * Date: 2024/2/27 16:05 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class ConcreteMediator : Mediator {

    val colleagueList = ArrayList<Colleague>()

    override fun registerColleague(colleague: Colleague) {
        colleagueList.add(colleague)
    }

    override fun sendMessage(msg: String,colleague: Colleague) {
        for (each in colleagueList) {
            if (each!= colleague){
                each.receiveMessage(msg)
            }
        }
    }
}