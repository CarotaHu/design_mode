package github.radishhu.designmode.X访问者模式

/**
 * Description:  <br>
 * Date: 2024/2/28 15:41 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class HousingElement(val number:Int, val height: Double, val floors: Int) : Element() {
    override fun accept(visitor: Visitor) {
        visitor.visitor(this)
    }
}