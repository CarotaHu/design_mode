package github.radishhu.designmode.E工厂模式

import github.radishhu.designmode.A简单工厂模式.operator.Operator
import github.radishhu.designmode.A简单工厂模式.operator.SubtractionOperator

/**
 * Description: 减法工厂类 <br>
 * Date: 2024/2/21 8:53 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class SubtractionOperatorFactory:OperatorFactory {
    override fun createOperator(): Operator {
        return SubtractionOperator()
    }
}