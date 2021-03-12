package usingapplicationlifecycle.ca

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.widget.Toast

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        registerActivityLifecycleCallbacks(
            object : ActivityLifecycleCallbacks {
                override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                    Toast.makeText(activity, "onActivityCreated", Toast.LENGTH_LONG).show()
                }

                override fun onActivityStarted(activity: Activity) {
                    Toast.makeText(activity, "onActivityStarted", Toast.LENGTH_LONG).show()
                }

                override fun onActivityResumed(activity: Activity) {
                    Toast.makeText(activity, "onActivityResumed", Toast.LENGTH_LONG).show()
                }

                override fun onActivityPaused(activity: Activity) {
                    Toast.makeText(activity, "onActivityPaused", Toast.LENGTH_LONG).show()
                }

                override fun onActivityStopped(activity: Activity) {
                    Toast.makeText(activity, "onActivityStopped", Toast.LENGTH_LONG).show()
                }

                override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                    Toast.makeText(activity, "onActivitySaveInstanceState", Toast.LENGTH_LONG)
                        .show()
                }

                override fun onActivityDestroyed(activity: Activity) {
                    Toast.makeText(activity, "onActivityDestroyed", Toast.LENGTH_LONG).show()
                }
            }
        )
    }
}