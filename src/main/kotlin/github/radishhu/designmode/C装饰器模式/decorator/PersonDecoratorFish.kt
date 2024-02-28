package github.radishhu.designmode.C装饰器模式.decorator

import github.radishhu.designmode.C装饰器模式.Person

/**
 * Description:  <br>
 * Date: 2024/2/20 16:01 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class PersonDecoratorFish(private val person: Person) : PersonDecorator(person) {
    override fun show() {
        super.show()
        println("偷偷的摸鱼")
    }
}