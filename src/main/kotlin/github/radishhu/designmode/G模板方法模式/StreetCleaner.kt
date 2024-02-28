package github.radishhu.designmode.G模板方法模式

/**
 * Description:  <br>
 * Date: 2024/2/21 10:02 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class StreetCleaner :CleanerTemplate {
    override fun clearWork() {
        println("打扫树叶")
    }

    override fun getCleanerClass(): String {
        return "街道清洁工"
    }
}