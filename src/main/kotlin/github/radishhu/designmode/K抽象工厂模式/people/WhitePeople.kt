package github.radishhu.designmode.K抽象工厂模式.people

/**
 * Description:  <br>
 * Date: 2024/2/22 14:29 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface WhitePeople:People {
    override fun color() {
        println("白种人")
    }
}