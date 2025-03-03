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
splitMultiply(32434, 17021) // 552059114
splitMultiply(8271, 1827) // 15111117
splitMultiply(9, 21) // 189
splitMultiply(6371, 82712) // 526958152

//Fast algorithm (Karatsuba)
println("--FAST ALGORITHM--")
fastMultiply(8231, 1271) // 10461601
fastMultiply(78128, 23838) // 1862415264
fastMultiply(8, 76) // 608
fastMultiply(812, 21245) // 17.250.940
fastMultiply(8612, 6127) // 52765724

