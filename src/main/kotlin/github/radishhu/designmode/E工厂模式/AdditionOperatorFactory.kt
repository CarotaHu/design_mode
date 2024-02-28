package github.radishhu.designmode.E工厂模式

import github.radishhu.designmode.A简单工厂模式.operator.AdditionOperator
import github.radishhu.designmode.A简单工厂模式.operator.Operator

/**
 * Description: 加法工厂类 <br>
 * Date: 2024/2/21 8:49 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class AdditionOperatorFactory : OperatorFactory {

    override fun createOperator(): Operator {
        return AdditionOperator()
    }

}