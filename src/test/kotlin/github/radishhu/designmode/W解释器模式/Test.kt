package github.radishhu.designmode.W解释器模式

import org.junit.jupiter.api.Test
import java.math.BigDecimal

/**
 * Description:  <br>
 * Date: 2024/2/28 14:32 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Test {

    @Test
    fun test(){
        // 解释的语法
        var str = "3+4*7*(3-4)"
        // 构建语法树 - 解释器模式不负责构建语法树
        val expression = AddExpression(
            NumberExpression(BigDecimal(3)),
            MultiplyExpression(
                NumberExpression(BigDecimal(4)),
                MultiplyExpression(
                    NumberExpression(BigDecimal(7)),
                    SubtractExpression(
                        NumberExpression(BigDecimal(3)),
                        NumberExpression(BigDecimal(4))
                    )
                )
            )
        )
        println("计算结果是${expression.interpret()}")   // 计算结果是-25
    }

}