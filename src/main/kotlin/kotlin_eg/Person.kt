package kotlin_eg

open class Person(val name: String) {

    open fun eat(){}

    var value: String ="BlaBla"
    set(value) {
        if (value.isNotEmpty()){
            field=value
        }
    }

    companion object{
        val name: String?=null;

        fun person(){
            //null safe
            if (name !=null){
                //first way
            }
            name?.let {
                //second way
            }
            val data= name  ?: ""
            data //third way
        }
    }

}