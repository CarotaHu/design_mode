package github.radishhu.designmode.A简单工厂模式

import github.radishhu.designmode.A简单工厂模式.operator.*

/**
 * Description: 简单工厂模式 <br>
 * Date: 2024/2/20 13:03 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class OperatorSimpleFactory {

    companion object{
        /**
         * 生产操作符对象
         */
        fun createOperator(operatorIndex:Int): Operator {
            return when (operatorIndex) {
                OperatorEnum.ADDITION.ordinal -> AdditionOperator()
                OperatorEnum.SUBTRACTION.ordinal -> SubtractionOperator()
                OperatorEnum.MULTIPLICATION.ordinal -> MultiplicationOperator()
                OperatorEnum.DIVISION.ordinal -> DivisionOperator()
                else -> {throw RuntimeException("未知操作符类型")}
            }
        }
    }

}