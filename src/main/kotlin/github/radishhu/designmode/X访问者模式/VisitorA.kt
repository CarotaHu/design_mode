package github.radishhu.designmode.X访问者模式

/**
 * Description:  <br>
 * Date: 2024/2/28 15:44 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class VisitorA:Visitor {
    override fun visitor(element: HousingElement) {
        println("A: ${element.number}号楼高度为:${element.height}M")
    }
}