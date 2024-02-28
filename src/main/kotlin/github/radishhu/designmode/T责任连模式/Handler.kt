package github.radishhu.designmode.T责任连模式

/**
 * Description: 处理器接口 <br>
 * Date: 2024/2/27 9:22 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface Handler {
    val handler:Handler?
    val type:String
    fun handle(request: Request)
}