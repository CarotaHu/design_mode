package github.radishhu.designmode.I建造者模式

/**
 * Description: 吃货建造类 <br>
 * Date: 2024/2/21 10:56 <br>
 *
 * @author moon
 * @since 1.0.3
 */
abstract class FoodieBuilder {


    abstract fun glove(glove:String)
    abstract fun scarf(scarf:String)

    abstract fun build():Foodie
}