package github.radishhu.designmode.N备忘录模式

/**
 * Description: 原生器类(需要备份的类) <br>
 * Date: 2024/2/23 10:50 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class Originator(var state:String){

    fun createMemento():Memento{
        return Memento(state)
    }

    fun restoreMemento(memento: Memento){
        state=memento.state
    }


}
