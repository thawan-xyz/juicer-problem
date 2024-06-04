fun main() {
    val (numberOfOranges, maxOrangeSize, wasteThreshold) = readln().split(" ").map(String::toInt)
    val listOfOrangeSizes = readln().split(" ").map(String::toInt)

    var numberOfCleanings = 0; var currentWaste = 0
    for (orangeSize in listOfOrangeSizes) {
        if (orangeSize <= maxOrangeSize) {
            currentWaste += orangeSize
            if (currentWaste > wasteThreshold) {
                currentWaste = 0
                numberOfCleanings += 1
            }
        }
    }

    println(numberOfCleanings)
}
