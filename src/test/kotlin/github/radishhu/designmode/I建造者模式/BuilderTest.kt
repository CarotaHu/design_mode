package github.radishhu.designmode.I建造者模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/21 16:56 <br>
 * 模板方法模式定义了方法的基本骨架，抽象了部分自定义方法。建造者则是用户自定义属性
 * @author moon
 * @since 1.0.3
 */
class BuilderTest {

    @Test
    fun test(){
        val builder:FoodieBuilder = ElegantFoodieBuilder()
        builder.glove("带着白色手套")
        builder.scarf("围着黄色围巾")
        builder.build().show()
    }

}