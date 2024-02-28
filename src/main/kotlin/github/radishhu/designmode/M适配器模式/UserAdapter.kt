package github.radishhu.designmode.M适配器模式

import java.time.LocalDate
import java.time.Period
import java.util.Date

/**
 * Description:  <br>
 * Date: 2024/2/22 16:16 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class UserAdapter:User {

    val outerUser = OuterUser()

    override fun getName(): String {
       return outerUser.getUsername()
    }

    override fun getAge():Int {
        return Period.between(LocalDate.now(),outerUser.getBirthday()).years
    }
}