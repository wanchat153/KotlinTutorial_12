package academy.learnprogramming

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

class TaskViewHolder(override val containerView: View) :
    RecyclerView.ViewHolder(containerView),
    LayoutContainer {
}

private const val TAG = "CursorRecyclerViewAdapt"

class CursorRecyclerViewAdapter :
    RecyclerView.Adapter<TaskViewHolder>() {
}