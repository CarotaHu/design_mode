package github.radishhu.designmode.G模板方法模式

/**
 * Description:  <br>
 * Date: 2024/2/21 10:00 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class RoomCleaner:CleanerTemplate {
    override fun clearWork() {
        println("擦桌子")
    }

    override fun getCleanerClass():String {
        return "室内清洁工"
    }
}