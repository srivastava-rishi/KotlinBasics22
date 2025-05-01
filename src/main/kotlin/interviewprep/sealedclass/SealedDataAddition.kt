package interviewprep.sealedclass

fun main() {
    val filerValueOptions: Map<FilterCategoryTitle, List<FilterValueOptions>> = mapOf(
        FilterCategoryTitle.TRANSACTION_STATUS to listOf(
            FilterValueOptions(
                optionName = "Successful"
            ),
            FilterValueOptions(
                optionName = "Failed"
            ),
            FilterValueOptions(
                optionName = "Processing"
            ),
        ),
        FilterCategoryTitle.PAYMENT_TYPE to listOf(
            FilterValueOptions(
                optionName = "Successful"
            ),
            FilterValueOptions(
                optionName = "Failed"
            ),
            FilterValueOptions(
                optionName = "Processing"
            )
        )
    )

   // println(filerValueOptions.entries)
    println(filerValueOptions.values)
    println(filerValueOptions.values.flatten())
}

data class FilterValueOptions(
    val optionName: String = "",
    val isSelected: Boolean = false,
    val extraData: String = ""
)

enum class FilterCategoryTitle(val title: String) {
    TRANSACTION_STATUS("Status"),
    PAYMENT_TYPE("Payment type"),
    TIME_PERIOD("Time period"),
    AMOUNT("Amount"),
    PAYMENT_METHOD("Payment Method")
}