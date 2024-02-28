package github.radishhu.designmode.L状态模式

/**
 * Description: 电梯类 <br>
 * Date: 2024/2/22 15:30 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class Elevator(var state: ElevatorState) {

    fun close() {
        state.close()
    }

    fun open() {
        state.open()
    }

    fun goUp() {
        state.goUp()
    }

    fun goDown() {
        state.goDown()
    }

}