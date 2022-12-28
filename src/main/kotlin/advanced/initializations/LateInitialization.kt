package advanced.initializations

class LateinitSample {
    lateinit var envs: Map<String, String>

    fun initVars(env: Map<String, String>) {
        envs = env
    }
}

fun main() {

}