package github.radishhu.designmode.K抽象工厂模式.factory

import github.radishhu.designmode.K抽象工厂模式.people.People

/**
 * Description:  <br>
 * Date: 2024/2/22 14:46 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface Factory {

    fun createPeople():People

}