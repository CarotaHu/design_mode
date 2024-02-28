package github.radishhu.designmode.K抽象工厂模式

import github.radishhu.designmode.K抽象工厂模式.absFactory.ManFactory
import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/22 14:49 <br>
 * 抽象工厂产生的是一类对象,工厂方法是产生的一个对象
 * 如果一类中只有一种对象,则抽象工厂方法降级为工厂方法
 * @author moon
 * @since 1.0.3
 */
class AbsFactoryTest {

    @Test
    fun absFactoryTest(){
        val manFactory = ManFactory()
        val manYellow = manFactory.yellow()
        manYellow.sex()
        manYellow.color()
    }

}