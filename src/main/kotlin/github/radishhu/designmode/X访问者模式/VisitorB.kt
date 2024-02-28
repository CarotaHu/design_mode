package github.radishhu.designmode.X访问者模式

/**
 * Description:  <br>
 * Date: 2024/2/28 15:47 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class VisitorB:Visitor {
    override fun visitor(element: HousingElement) {
        println("B: ${element.number}号楼层数为${element.floors}层")
    }
}