package github.radishhu.designmode.K抽象工厂模式.factory

import github.radishhu.designmode.K抽象工厂模式.people.ManYellowPeople
import github.radishhu.designmode.K抽象工厂模式.people.People

/**
 * Description:  <br>
 * Date: 2024/2/22 14:47 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class ManYellowFactory:Factory {
    override fun createPeople(): People {
        return ManYellowPeople()
    }
}