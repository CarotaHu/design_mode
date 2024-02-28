package github.radishhu.designmode.Q单例模式

/**
 * Description:  <br>
 * Date: 2024/2/26 14:37 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class User(val name:String,val age:Int){
    fun show(){
        println("$name 今年 $age 岁了")
    }
}
