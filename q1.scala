@main def main():Unit ={
    val text:String  = "amore amore";
    println( reverse(text,text.length()-1));
}


def reverse(string : String,index: Int):String ={
    if(index<0){
        return "";
    }else{
        return string.charAt(index) + reverse(string,index-1);
    }
}