package github.radishhu.designmode.J观察者模式

import java.util.*

/**
 * Description: 爱坤类-被观察者 <br>
 * Date: 2024/2/22 13:26 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class AiKunObservable : Observable() {

    fun sing(){
        println("爱坤:唱歌了")
        super.setChanged()
        super.notifyObservers("sing")
    }

    fun jump(){
        println("爱坤:跳舞了")
        super.setChanged()
        super.notifyObservers("jump")
    }

    fun rap(){
        println("爱坤:rap了")
        super.setChanged()
        super.notifyObservers("rap")
    }
}
