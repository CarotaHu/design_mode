package github.radishhu.designmode.I建造者模式

/**
 * Description: 吃货类 <br>
 * Date: 2024/2/21 16:31 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class Foodie(private val type:String){

     var glove:String = ""
     var scarf:String = ""

    fun show(){
        println("${type} ${glove} ${scarf}")
    }
}
