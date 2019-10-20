package academy.learnprogramming

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(), AddEditFragment.OnSaveClicked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

    }

    override fun onSaveClicked(){
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.menumain_addTask -> taskEditRequest(null)
//            R.id.menumain_settings -> true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun taskEditRequest(task: Task?) {
        Log.d(TAG, "taskEditRequest: starts")

        val newFragment = AddEditFragment.newInstance(task)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, newFragment)
            .commit()

        Log.d(TAG, "Exiting taskEditRequest")
    }
}