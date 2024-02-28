package github.radishhu.designmode.S命令模式

/**
 * Description: 调用者 <br>
 * Date: 2024/2/26 15:41 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Invoker(var command: Command) {

    fun pressButton(){
        command.execute()
    }

}