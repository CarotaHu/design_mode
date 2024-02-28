package github.radishhu.designmode.V享元模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/27 16:56 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class FlyweightTest {

    @Test
    fun test(){
        val flyweight1 = FlyweightFactory.getFlyweight("A")
        flyweight1.operation("One")

        val flyweight2 = FlyweightFactory.getFlyweight("B")
        flyweight2.operation("Two")

        val flyweight3 = FlyweightFactory.getFlyweight("A")
        flyweight3.operation("Three")
    }

}