package github.radishhu.designmode.E工厂模式

import github.radishhu.designmode.A简单工厂模式.operator.MultiplicationOperator
import github.radishhu.designmode.A简单工厂模式.operator.Operator

/**
 * Description: 乘法工厂类 <br>
 * Date: 2024/2/21 8:52 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class MultiplicationOperatorFactory:OperatorFactory {
    override fun createOperator(): Operator {
        return MultiplicationOperator()
    }
}