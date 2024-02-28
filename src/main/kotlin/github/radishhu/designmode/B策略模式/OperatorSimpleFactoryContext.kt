package github.radishhu.designmode.B策略模式

import github.radishhu.designmode.A简单工厂模式.OperatorEnum
import github.radishhu.designmode.A简单工厂模式.operator.*

/**
 * Description:  <br>
 * Date: 2024/2/20 15:02 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class OperatorSimpleFactoryContext private constructor(val operator: Operator) {

    companion object {
        /**
         * 简单工厂方法获取context
         */
        fun getContext(operatorIndex: Int): OperatorSimpleFactoryContext {
            val _operator: Operator = when (operatorIndex) {
                OperatorEnum.ADDITION.ordinal -> AdditionOperator()
                OperatorEnum.SUBTRACTION.ordinal -> SubtractionOperator()
                OperatorEnum.MULTIPLICATION.ordinal -> MultiplicationOperator()
                OperatorEnum.DIVISION.ordinal -> DivisionOperator()
                else -> {
                    throw RuntimeException("未知操作符类型")
                }
            }
            return OperatorSimpleFactoryContext(_operator);
        }
    }

    /**
     * 获取计算结果
     */
    fun getResult(numberA: Double, numberB: Double): Double {
        return operator.operation(numberA, numberB)
    }

}
