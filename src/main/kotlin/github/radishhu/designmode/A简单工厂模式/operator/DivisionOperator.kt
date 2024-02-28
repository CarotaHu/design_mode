package github.radishhu.designmode.A简单工厂模式.operator

/**
 * Description: 除法 <br>
 * Date: 2024/2/20 13:23 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class DivisionOperator : Operator() {
    override fun operation(numberA: Double, numberB: Double): Double {
        assert(numberB.compareTo(0)!=0){"'numberB'不能是0"}
        return numberA/numberB
    }


}