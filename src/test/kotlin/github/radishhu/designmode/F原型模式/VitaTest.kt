package github.radishhu.designmode.F原型模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/21 9:46 <br>
 *  原型模式就是维护一个clone方法，可以在原有的对象基础上快速创建一个新的对象，对心对象的操作不会影响原始对象（需要注意深浅拷贝）<br>
 * @author moon
 * @since 1.0.3
 */
class VitaTest {

    @Test
    fun vita() {

        val vita = Vita("马大哈", 28, "道格斯大学")
        vita.show()

        val copy1 = vita.copy(age = 39)
        copy1.show()

    }

}