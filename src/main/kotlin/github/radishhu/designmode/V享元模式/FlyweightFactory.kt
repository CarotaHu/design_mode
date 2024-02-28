package github.radishhu.designmode.V享元模式

/**
 * Description: 享元工厂 <br>
 * Date: 2024/2/27 16:48 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class FlyweightFactory {


    companion object{
      private  val flyweightMap = mutableMapOf<String,Flyweight>()

        fun getFlyweight(key:String):Flyweight{
            if (!flyweightMap.containsKey(key)){
                flyweightMap[key] = ConcreteFlyweight()
            }
            return flyweightMap[key]!!
        }
    }


}