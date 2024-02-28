package github.radishhu.designmode.C装饰器模式.decorator

import github.radishhu.designmode.C装饰器模式.Person

/**
 * Description:  <br>
 * Date: 2024/2/20 15:56 <br>
 *
 * @author moon
 * @since 1.0.3
 */
abstract class PersonDecorator(private val person: Person) : Person {

    override fun show() {
        person.show()
    }
}