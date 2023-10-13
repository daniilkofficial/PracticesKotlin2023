package LP4_10And11_AnonymousClassesAndOptimizing

class Sportsman {
    fun invokeWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }

    // Без inline будет создан анонимный клас, c будет просто передана функция
    inline fun invokeWaterBoy(bringWater: () -> Unit) {
        bringWater()
    }
}