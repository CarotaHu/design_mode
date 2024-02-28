package github.radishhu.designmode.M适配器模式

/**
 * Description:  <br>
 * Date: 2024/2/22 16:25 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class InnerUser:User {
    override fun getName(): String {
        return "李四"
    }

    override fun getAge(): Int {
        return 18
    }


}