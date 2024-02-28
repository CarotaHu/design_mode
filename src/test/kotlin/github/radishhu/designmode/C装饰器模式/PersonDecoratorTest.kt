package github.radishhu.designmode.C装饰器模式

import github.radishhu.designmode.C装饰器模式.decorator.PersonDecoratorCrazy
import github.radishhu.designmode.C装饰器模式.decorator.PersonDecoratorFish
import org.junit.jupiter.api.Test

/**
 * Description: 装饰者模式测试类 <br>
 * Date: 2024/2/20 16:02 <br>
 *  不侵入主代码的情况下,对原始对象进行增强的方式
 * @author moon
 * @since 1.0.3
 */
class PersonDecoratorTest {

    private var person : PersonWorker = PersonWorker("熊大")

    @Test
    fun personWorkerTest() {
        person.show()   // 原始类
        println()
    }

    @Test
    fun personDecoratorCrazyTest() {
        PersonDecoratorCrazy(person).show() // 增强原始类
    }

    @Test
    fun personDecoratorFishTest() {
        PersonDecoratorFish(person).show() // 增强原始类
    }
}