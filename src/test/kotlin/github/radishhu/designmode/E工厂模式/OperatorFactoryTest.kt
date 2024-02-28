package github.radishhu.designmode.E工厂模式

import github.radishhu.designmode.A简单工厂模式.OperatorEnum
import github.radishhu.designmode.A简单工厂模式.OperatorSimpleFactory
import org.junit.jupiter.api.Test

/**
 * Description: 工厂模式测试类 <br>
 * Date: 2024/2/21 8:55 <br>
 *  简单工厂模式如果需要扩展Operator时，需要新增Operator实现类并修改简单工厂方法，工厂模式则需要新增Operator实现类和新增对应工厂类。简单工厂类违反了开闭原则
 *  工厂模式在调用时判断Operator类型
 *  如果一开始就能固定Operator所有实现类，并能保证不会（频繁）增加，使用简单工厂更优
 *
 * @author moon
 * @since 1.0.3
 */
class OperatorFactoryTest {

    @Test
    fun simpleOperatorFactoryTest(){
        val operator1 = OperatorSimpleFactory.createOperator(OperatorEnum.ADDITION.ordinal)
        val operator2 = OperatorSimpleFactory.createOperator(OperatorEnum.ADDITION.ordinal)
        val operator3 = OperatorSimpleFactory.createOperator(OperatorEnum.ADDITION.ordinal)
    }

    @Test
    fun operatorFactoryTest(){
        val _operator = 1
        when(_operator){
            1-> {
                val operator1 = AdditionOperatorFactory().createOperator()
                val operator2 = AdditionOperatorFactory().createOperator()
                val operator3 = AdditionOperatorFactory().createOperator()
            }
            else->{
                throw RuntimeException("出错了")
            }
        }


    }

}