@main def main():Unit = {
    var list = List(1,2,3,12,13,14,21,54);
    println(sum(list));
}

def sum(list: List[Int]):Int = {
    var sum:Int=0;
    for(int <- list ){
        if (int%2 == 0){
            sum += int;
        }
    } 
    return sum;
}