fun main() {
    val (numberOfOranges, maximumSize, wasteThreshold) = readln().split(" ").map(String::toInt)
    val listOfOranges = readln().split(" ").map(String::toInt)

    var numberOfCleanings = 0
    var currentWaste = 0
    for (orange in listOfOranges) {
        if (orange <= maximumSize) {
            currentWaste += orange
            if (currentWaste > wasteThreshold) {
                currentWaste = 0
                numberOfCleanings += 1
            }
        }
    }

    println(numberOfCleanings)
}
