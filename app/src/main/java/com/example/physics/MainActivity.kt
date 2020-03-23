package com.example.physics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ph = LinearLayoutManager(baseContext)
        recycler.layoutManager = ph

        var hp = FormulaAdapter()
        hp.formuls = mutableListOf(
            Formula("Закон сохранения заряда", R.drawable.ph1),
            Formula("Сила Кулона", R.drawable.ph2),
            Formula("Напряженность ЭСП точечного заряда", R.drawable.ph3),
            Formula("Сила Кулона(через напряженность ЭСП)", R.drawable.ph4),
            Formula("Напряженность ЭСП точечного заряда", R.drawable.ph5),
            Formula("Напряженность ЭСП металлического шара(сферы)", R.drawable.ph6),
            Formula("Напряженность ЭСП металлического шара(сферы)", R.drawable.ph7)
        )
        recycler.adapter = hp
    }
}
