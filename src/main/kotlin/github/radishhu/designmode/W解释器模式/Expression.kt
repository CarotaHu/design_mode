package github.radishhu.designmode.W解释器模式

import java.math.BigDecimal

/**
 * Description: 解释器模式接口 <br>
 * Date: 2024/2/28 14:30 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface Expression {

    /**
     * 解释方法
     */
    fun interpret() : BigDecimal

}