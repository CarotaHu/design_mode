package github.radishhu.designmode.K抽象工厂模式.absFactory

import github.radishhu.designmode.K抽象工厂模式.people.People
import github.radishhu.designmode.K抽象工厂模式.people.WomanColoursPeople
import github.radishhu.designmode.K抽象工厂模式.people.WomanYellowPeople

/**
 * Description:  <br>
 * Date: 2024/2/22 14:42 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class WomanFactory : AbsFactory() {
    override fun yellow(): People {
        return WomanYellowPeople()
    }

    override fun colours(): People {
       return WomanColoursPeople()
    }


}