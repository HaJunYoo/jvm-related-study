int add1(int a, int b) {
    return a + b
}
println(add1(a=3, b=4))

def add2(int a, int b) {
    return a + b
}
println(add2(a=3, b=4))

def add3(a, b) {
    return a + b
}
println(add3(a=3, b=4))

// 마지막 라인만 인식
def add4(a, b) {
    a * b
    a + b
}
println(add4(a=5, b=6))

int add5(int a, int b) {
    a + b
}
println(add5(a=3, b=4))