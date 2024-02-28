package github.radishhu.designmode.D代理模式

import org.junit.jupiter.api.Test
import kotlin.random.Random

/**
 * Description: 代理模式测试类 <br>
 * Date: 2024/2/20 16:42 <br>
 *
 * @author moon
 * @since 1.0.3
 */

class WareHoseKeeperTest {

    @Test
    fun proxy(){
        val proxy = WarehouseManagementSystem(WarehouseKeeper(), 1)
        val random = Random(System.currentTimeMillis())
        val myRunnable1 = Runnable {
            for (i in 0..10) {
                Thread.sleep(random.nextLong(50,150))
                proxy.append()
            }
        }

        val myRunnable2 = Runnable {
            for (i in 0..10) {
                Thread.sleep(random.nextLong(1,100))
                proxy.removal()
            }
        }
        Thread(myRunnable2).start()
        Thread(myRunnable1).start()
        Thread.sleep(1500)
    }

}