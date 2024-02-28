package github.radishhu.designmode.L状态模式

/**
 * Description: 电梯状态类 <br>
 * Date: 2024/2/22 15:30 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface ElevatorState {

    fun close()
    fun open()
    fun goUp()
    fun goDown()
    fun stop()

}