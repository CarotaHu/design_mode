package github.radishhu.designmode.W解释器模式

import java.math.BigDecimal

/**
 * Description: 乘法 <br>
 * Date: 2024/2/28 14:56 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class MultiplyExpression(val front : Expression, val back : Expression):Expression {
    override fun interpret(): BigDecimal {
        return front.interpret()*back.interpret()
    }
}