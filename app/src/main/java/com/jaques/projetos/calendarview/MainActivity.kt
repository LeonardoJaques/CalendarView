package com.jaques.projetos.calendarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //    private lateinit var calendar: CalendarView
    private lateinit var calendar: MaterialCalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendar = calendarView

        val meses = arrayOf<CharSequence>(
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        )
        calendar.setTitleMonths(meses)

        val semana = arrayOf<CharSequence>("S", "T", "Q", "Q", "S", "S", "D")
        calendar.setWeekDayLabels(semana)

        /*calendar.state().edit()
                        .setMinimumDate(CalendarDay.from(2019,1,1))
                        .setMaximumDate(CalendarDay.from(2021,1,1))
                        .commit()
                        */

        calendar.setOnMonthChangedListener(OnMonthChangedListener { widget, date ->
            Log.i("data:", " Valor 1:${date.month}/${date.year}")
        })


//        calendar.setOnDateChangedListener(OnDateSelectedListener { widget, date, selected ->
//            Log.i("data:", " Valor 1:${date}")
//        })
//

        /*
        calendar = calendarView
        calendar.setOnDateChangeListener(CalendarView.OnDateChangeListener { view, year, month, dayOfMonth ->
            Log.i("data:", " Valor 1:${dayOfMonth}/${month}/${year}")
        })
        */


    }

}