package github.radishhu.designmode.O组合模式.透明模式

/**
 * Description:  <br>
 * Date: 2024/2/26 14:11 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface Organization {

    var name:String
    var code:String
    val type:Int

    fun show()

    fun add(organization: Organization)

    fun remove(organization: Organization)

    fun childrenList():ArrayList<Organization>

}