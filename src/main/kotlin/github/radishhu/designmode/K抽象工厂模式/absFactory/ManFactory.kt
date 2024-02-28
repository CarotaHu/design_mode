package github.radishhu.designmode.K抽象工厂模式.absFactory

import github.radishhu.designmode.K抽象工厂模式.people.*

/**
 * Description:  <br>
 * Date: 2024/2/22 14:44 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class ManFactory:AbsFactory() {
    override fun yellow(): People {
        return ManYellowPeople()
    }

    override fun colours(): People {
        return ManColoursPeople()
    }
}