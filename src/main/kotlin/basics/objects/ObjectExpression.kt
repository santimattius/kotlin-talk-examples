package basics.objects

fun main() {

    setOnClickListener(object : OnClickListener {
        override fun onClick() {

        }
    })

    val type = object {
        var name: String = ""
    }

    type.name = "Santiago"

}

fun setOnClickListener(onClickListener: OnClickListener) {
    onClickListener.onClick()
}

interface OnClickListener {

    fun onClick()
}