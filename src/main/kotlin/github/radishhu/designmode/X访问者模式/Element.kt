package github.radishhu.designmode.X访问者模式

/**
 * Description: 抽象元素类 <br>
 * Date: 2024/2/28 15:30 <br>
 *
 * @author moon
 * @since 1.0.3
 */
abstract class Element {

    abstract fun accept(visitor: Visitor)

}