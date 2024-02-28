package github.radishhu.designmode.S命令模式

/**
 * Description: 开灯 <br>
 * Date: 2024/2/26 15:38 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class TurnOnCommand(var light: Light):Command {
    override fun execute() {
        light.turnOn()
    }
}