package io.github.kenbme.businesscard

import android.app.Application
import io.github.kenbme.businesscard.data.AppDatabase
import io.github.kenbme.businesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}