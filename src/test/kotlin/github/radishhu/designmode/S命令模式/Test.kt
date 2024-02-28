package github.radishhu.designmode.S命令模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/26 15:43 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Test {

    @Test
    fun test(){
        val light = Light()
        val invoker = Invoker(TurnOffCommand(light))
        invoker.pressButton()

        invoker.command = TurnOnCommand(light)
        invoker.pressButton()
    }

}