package github.radishhu.designmode.M适配器模式

import java.time.LocalDate

/**
 * Description:  <br>
 * Date: 2024/2/22 16:13 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class OuterUser {

    fun getUsername(): String {
        return "张三"
    }

    fun getBirthday(): LocalDate {
        return LocalDate.of(1994,9,27)
    }

}