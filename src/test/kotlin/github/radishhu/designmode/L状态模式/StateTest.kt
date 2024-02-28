package github.radishhu.designmode.L状态模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/22 15:42 <br>
 * Elevator引用一个状态ElevatorState，每种状态在进行同一个操作时会表现出不同的动作。电梯的动作有状态类代替实现
 * @author moon
 * @since 1.0.3
 */
class StateTest {

    @Test
    fun test(){
        val elevator = Elevator(ElevatorCloseState())
        elevator.goDown()
        elevator.close()

        elevator.state = ElevatorDownState()
        elevator.goUp()
        elevator.close()
        elevator.open()



    }

}