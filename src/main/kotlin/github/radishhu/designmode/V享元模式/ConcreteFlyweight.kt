package github.radishhu.designmode.V享元模式

import java.util.Random

/**
 * Description: 享元类 <br>
 * Date: 2024/2/27 16:39 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class ConcreteFlyweight(val inner : Int=Random().nextInt(999)) : Flyweight{
    override fun operation(extrinsicState: String) {
        println("具体享元类:${extrinsicState} - ${inner}")
    }
}