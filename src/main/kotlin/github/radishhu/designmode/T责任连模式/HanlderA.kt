package github.radishhu.designmode.T责任连模式

/**
 * Description:  <br>
 * Date: 2024/2/27 9:22 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class HanlderA(override val handler: Handler?, override val type: String) :Handler {


    override fun handle(request: Request) {
        when(request.type){
            type-> println("handler A handle request")
            else->if (handler != null) (handler.handle(request)) else println("未找到适配的处理器")
        }
    }

}