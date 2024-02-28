package github.radishhu.designmode.W解释器模式

import java.math.BigDecimal

/**
 * Description: 减法 <br>
 * Date: 2024/2/28 14:54 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class SubtractExpression(val front : Expression, val back : Expression):Expression{
    override fun interpret(): BigDecimal {
        return front.interpret()-back.interpret()
    }

}
