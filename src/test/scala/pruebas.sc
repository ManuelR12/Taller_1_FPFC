import Multiplicacion._

//Peasant algorithm con recursion lineal
println("--PEASANT ALGORITHM (RECURSIVE)--")
PeasantAlgorithm(928, 1783)  // 1654624
PeasantAlgorithm(7, 3)
PeasantAlgorithm(324, 2030) // 657720
PeasantAlgorithm(2145, 3233) // 6926985
PeasantAlgorithm(122, 11) // 1342

//Forma iterativa
println("--PEASANT ALGORITHM (ITERATIVE)--")
PeasantAlgorithmIt(13, 5) //65
PeasantAlgorithmIt(2312, 12284) // 28400608
PeasantAlgorithmIt(232, 41212) // 9561184
PeasantAlgorithmIt(12712, 34712) // 441258944
PeasantAlgorithmIt(8492, 326) // 2768392

//Split algorithm
println("--SPLIT ALGORIHM--")
splitMultiply(32484, 47382)  // 1539156888
splitMultiply(3243, 100210) // 324981030
splitMultiply(1271, 18277) // 23230067
splitMultiply(9, 21) // 189
splitMultiply(6371, 82712) // 526958152

println("--FAST ALGORITHM--")
fastMultiply(8231, 12714) // 105793194
fastMultiply(78128, 838) // 65471264
fastMultiply(8, 76) // 608
fastMultiply(812, 2) // 1624
fastMultiply(8612, 61278) // 527726136

