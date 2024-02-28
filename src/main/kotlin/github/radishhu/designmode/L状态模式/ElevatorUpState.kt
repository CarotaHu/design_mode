package github.radishhu.designmode.L状态模式

/**
 * Description:  <br>
 * Date: 2024/2/22 15:37 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class ElevatorUpState:ElevatorState {
    override fun close() {
        println("上行状态，门已关闭")
    }

    override fun open() {
        println("上行状态，不能开门")
    }

    override fun goUp() {
        println("正在上行")
    }

    override fun goDown() {
        println("上行状态，不能下行")
    }

    override fun stop() {
        println("已停止")
    }
}