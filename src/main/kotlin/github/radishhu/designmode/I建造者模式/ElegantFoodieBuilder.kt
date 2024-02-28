package github.radishhu.designmode.I建造者模式

/**
 * Description:  <br>
 * Date: 2024/2/21 16:33 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class ElegantFoodieBuilder : FoodieBuilder() {
    val foodie : Foodie = Foodie("优雅的吃货")

    override fun glove(glove:String) {
        foodie.glove = glove
    }

    override fun scarf(scarf:String) {
        foodie.scarf = scarf
    }

    override fun build():Foodie {
        return foodie
    }
}