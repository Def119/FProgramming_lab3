@main def main():Unit ={
    val stringList = List("hello!","lehan","iwiw","adsasdsadasd","jjljlj");
    println(filterStrings(5,stringList));
}

def filterStrings(n:Int,strings : List[String]):List[String] = {
    var result = List[String]();
    for(string <- strings){
        if(string.length > n){
            result = result :+ string;
        }
    }
    return result;
}