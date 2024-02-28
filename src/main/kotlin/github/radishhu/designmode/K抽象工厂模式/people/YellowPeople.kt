package github.radishhu.designmode.K抽象工厂模式.people

/**
 * Description:  <br>
 * Date: 2024/2/22 14:27 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface YellowPeople : People {
    override fun color() {
        println("黄种人")
    }
}