package github.radishhu.designmode.L状态模式

/**
 * Description:  <br>
 * Date: 2024/2/22 15:36 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class ElevatorCloseState : ElevatorState {
    override fun close() {
        println("门处于关闭状态")
    }

    override fun open() {
        println("正在开门。。。")
    }

    override fun goUp() {
        println("上行。。。")
    }

    override fun goDown() {
        println("下行。。。")
    }

    override fun stop() {
        println("停止状态")
    }
}