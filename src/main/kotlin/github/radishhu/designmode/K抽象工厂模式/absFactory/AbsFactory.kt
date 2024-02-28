package github.radishhu.designmode.K抽象工厂模式.absFactory

import github.radishhu.designmode.K抽象工厂模式.people.People

/**
 * Description:  <br>
 * Date: 2024/2/22 14:39 <br>
 *
 * @author moon
 * @since 1.0.3
 */
abstract class AbsFactory {

    abstract fun yellow():People
    abstract fun colours():People

}