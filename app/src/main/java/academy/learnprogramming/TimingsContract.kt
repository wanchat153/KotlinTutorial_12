package academy.learnprogramming

import android.provider.BaseColumns

object TimingsContract {

    internal const val TABLE_NAME = "Timings"

    object Columns {
        const val ID = BaseColumns._ID
        const val TASK_NAME = "Name"
        const val TIMING_DESCRIPTION = "Description"
        const val TIMING_SORT_CRDER  = "SortOrder"
    }
}