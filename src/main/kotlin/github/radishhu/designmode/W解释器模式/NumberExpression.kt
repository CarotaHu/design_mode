package github.radishhu.designmode.W解释器模式

import java.math.BigDecimal

/**
 * Description: 中支付表达式 <br>
 * Date: 2024/2/28 14:43 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class NumberExpression(val number: BigDecimal) : Expression{

    override fun interpret(): BigDecimal {
       return number;
    }
}