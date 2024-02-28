package github.radishhu.designmode.N备忘录模式

/**
 * Description: 管理者 <br>
 * Date: 2024/2/23 10:52 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Caretaker {

    private val mementoList : MutableList<Memento> = mutableListOf()

    fun saveMemento(memento: Memento){
        mementoList.add(memento)
    }

    fun getMemento():MutableList<Memento>{
        return mementoList
    }

}