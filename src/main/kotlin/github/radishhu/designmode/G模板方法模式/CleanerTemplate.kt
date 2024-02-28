package github.radishhu.designmode.G模板方法模式

/**
 * Description: 清洁工 <br>
 * Date: 2024/2/21 9:55 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface CleanerTemplate {

    fun clearing(){
        print("${getCleanerClass()}工作开始，")
        clearWork()
    }

    /**
     * 主要清洁工作
     */
    fun clearWork()

    /**
     * 获取清洁工类型
     */
    fun getCleanerClass():String
}