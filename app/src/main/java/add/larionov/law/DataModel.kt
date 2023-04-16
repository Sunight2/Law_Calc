package add.larionov.law

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//для клавиатуры в расчете госпошлины
open class DataModel : ViewModel() {
    val massage: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}

    //для передачи в подробном расчете госпошлины текста и суммы
open class DataModeltwo : ViewModel() {
        val massage: MutableLiveData<String> by lazy {
            MutableLiveData<String>()
        }
    }

open class DataModeltwoChena : ViewModel() {
    val massage: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}

