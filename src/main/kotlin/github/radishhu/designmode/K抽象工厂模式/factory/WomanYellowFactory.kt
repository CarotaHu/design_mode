package github.radishhu.designmode.K抽象工厂模式.factory

import github.radishhu.designmode.K抽象工厂模式.people.People
import github.radishhu.designmode.K抽象工厂模式.people.WomanYellowPeople

/**
 * Description:  <br>
 * Date: 2024/2/22 14:48 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class WomanYellowFactory:Factory {
    override fun createPeople(): People {
        return WomanYellowPeople()
    }
}