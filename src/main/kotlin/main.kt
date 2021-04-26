fun main() {
    println("-------")
    while (true){
        print("명령어 : ")
        val command= readLine()!!.trim()
        val commandBits=command.split("?",limit=2) //2등분했다 URI부분 URL부분 분리
        val url=commandBits[0]      //URI
        val paramStr=commandBits[1]    //URL

        val paramMap= mutableMapOf<String,String>()

        val pararmBits = paramStr.split("&")//URL 세부사항분리

        for(paramStrBit in pararmBits){
            val paramStrBitBits = paramStrBit.split("=" , limit = 2)
            val key = paramStrBitBits[0]
            val value = paramStrBitBits[1]
            paramMap.set(key,value)
        }
        when(url){
            "/article/exit"->{
                break
            }
            "/article/list"->{

                println("id : ${paramMap["id"]!!.toInt()} \n title : ${paramMap["title"]!!.toInt()}")
            }
        }

    }
}