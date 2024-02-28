package github.radishhu.designmode.O组合模式.安全模式

/**
 * Description:  <br>
 * Date: 2024/2/26 13:57 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Department(override var name: String, override var code: String) :Organization {
    override fun show() {
        println("部门: $name, 编码: $code")
    }

}