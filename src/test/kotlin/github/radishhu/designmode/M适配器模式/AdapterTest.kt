package github.radishhu.designmode.M适配器模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/22 16:26 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class AdapterTest {

    @Test
    fun test(){
        val innerUser = InnerUser()
        val outerUser = UserAdapter()
        say(innerUser)
        say(outerUser)
    }

    fun say(user: User){
        println("${user.getName()}，${user.getAge()}")
    }

}