package github.radishhu.designmode.N备忘录模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/23 10:55 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class MementoTest {

    @Test
    fun test(){
        // 创建管理类
        val caretaker = Caretaker()

        // 创建被管理对象
        val originator = Originator("狂暴")
        caretaker.saveMemento(originator.createMemento())
        println(originator)

        // 切换状态
        originator.state="沉默"
        caretaker.saveMemento(originator.createMemento())
        println(originator)

        // 恢复之前的状态
        originator.restoreMemento(caretaker.getMemento()[0])
        println(originator)
    }

}