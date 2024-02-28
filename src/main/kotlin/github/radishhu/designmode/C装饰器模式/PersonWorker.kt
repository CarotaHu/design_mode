package github.radishhu.designmode.C装饰器模式

/**
 * Description: 工作狂 <br>
 * Date: 2024/2/20 15:52 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class PersonWorker(private val user : String) : Person {
    override fun show() {
        print("${user}整天坐在工位上")
    }
}