package github.radishhu.designmode.X访问者模式

import org.junit.jupiter.api.Test
import kotlin.random.Random

/**
 * Description:  <br>
 * Date: 2024/2/28 15:54 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Test {

    @Test
    fun test(){
        val a = VisitorA()
        val b = VisitorB()
        for (i in 0..100) {
            val housingElement = HousingElement(
                i,
                Random(System.currentTimeMillis()).nextDouble(50.0, 200.0),
                Random(System.currentTimeMillis()).nextInt(10, 20)
            )
            housingElement.accept(a)
            housingElement.accept(b)
        }
    }

}