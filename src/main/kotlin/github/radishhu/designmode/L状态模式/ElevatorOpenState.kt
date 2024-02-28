package github.radishhu.designmode.L状态模式

/**
 * Description:  <br>
 * Date: 2024/2/22 15:33 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class ElevatorOpenState:ElevatorState {
    override fun close() {
        println("正在关门。。。")
    }

    override fun open() {
        println("不能重复开门")
    }

    override fun goUp() {
        println("门开着，不能上行")
    }

    override fun goDown() {
        println("门开着，不能下行")
    }

    override fun stop() {
        println("开门状态")
    }
}