package github.radishhu.designmode.U中介者模式

import github.radishhu.designmode.U中介者模式.中介.ConcreteMediator
import github.radishhu.designmode.U中介者模式.用户.Buyer
import github.radishhu.designmode.U中介者模式.用户.Landlord
import github.radishhu.designmode.U中介者模式.用户.PropertyManagement
import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/27 16:20 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Test {

    @Test
    fun test(){
        val mediator = ConcreteMediator()   // 中介

        val buyer = Buyer(mediator) // 购房
        val landlord = Landlord(mediator) // 房东
        val propertyManagement = PropertyManagement(mediator) // 物业

        buyer.sendMessage("我要购房")
        landlord.sendMessage("我有房子要售卖")
        propertyManagement.sendMessage("明天安排过户")

    }

}