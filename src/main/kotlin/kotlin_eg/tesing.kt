package kotlin_eg

fun main() {
    mainDummyNetWorkCall(
        input = 1,
        onSuccess = { susuccessMessagecesMessage ->
            print(susuccessMessagecesMessage)
        },
        onFailure = { FailureMessage ->
            print(FailureMessage)
        }
    )
}

fun mainDummyNetWorkCall(
    input: Int,
    onSuccess: (String) -> Unit,
    onFailure: (String) -> Unit
) {
    Thread.sleep(2000)
    when (input) {
        0 -> onFailure("The network call did not success")
        else -> onSuccess("The network call was successful")
    }

}
