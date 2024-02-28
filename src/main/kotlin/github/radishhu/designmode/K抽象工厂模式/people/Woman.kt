package github.radishhu.designmode.K抽象工厂模式.people

/**
 * Description:  <br>
 * Date: 2024/2/22 14:34 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface Woman : People {
    override fun sex() {
        println("女人")
    }
}