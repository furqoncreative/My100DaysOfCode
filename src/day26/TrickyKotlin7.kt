package day26

fun f(s:String)=Regex("[{}<>()]").replace(s){"{}<>()"["}{><)(".indexOf(it.value)].toString()}
