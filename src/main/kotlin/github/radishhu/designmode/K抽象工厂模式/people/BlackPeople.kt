package github.radishhu.designmode.K抽象工厂模式.people

/**
 * Description:  <br>
 * Date: 2024/2/22 14:28 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface BlackPeople:People {
    override fun color() {
        println("黑种人")
    }
}