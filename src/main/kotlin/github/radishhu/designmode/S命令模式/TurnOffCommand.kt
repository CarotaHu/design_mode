package github.radishhu.designmode.S命令模式

/**
 * Description: 关灯 <br>
 * Date: 2024/2/26 15:37 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class TurnOffCommand(val light: Light):Command {
    override fun execute() {
        light.turnOff()
    }

}