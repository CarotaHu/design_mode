package github.radishhu.designmode.J观察者模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/22 13:33 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class ObserverTest {

    @Test
    fun test(){
        val aiKunObservable = AiKunObservable()
        aiKunObservable.addObserver(BlackGayA())
        aiKunObservable.addObserver(BlackGayB())
        aiKunObservable.jump()
        aiKunObservable.jump()
        aiKunObservable.rap()
    }

}