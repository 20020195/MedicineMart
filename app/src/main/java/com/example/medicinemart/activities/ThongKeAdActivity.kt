package com.example.medicinemart.activities

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.medicinemart.R
import com.example.medicinemart.databinding.ThongkeAdminBinding
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.google.android.material.bottomnavigation.BottomNavigationView


private lateinit var binding_thongke_ad: ThongkeAdminBinding
private var a0 = 1.4F
private var a1 = 4.2F
private var a2 = 6.6F
private var a3 = 3.4F
private var a4 = 1.2F
private var a5 = 7.8F
private var a6 = 8.9F
private var a7 = 6.2F
private var a8 = 5.1F
private var a9 = 8.6F
private var a10 = 9.2F
private var a11 = 1.9F
private var a12 = 7.9F
private var a13 = 6.9F
private var a14 = 7.2F

class ThongKeAdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding_thongke_ad = ThongkeAdminBinding.inflate(layoutInflater)
        setContentView(binding_thongke_ad.root)

        val barChart = findViewById<BarChart>(R.id.bar_chart)

// Create an array of data entries
        var entries = arrayListOf<BarEntry>()
        entries.add(BarEntry(0f, a0))
        entries.add(BarEntry(1f, a1))
        entries.add(BarEntry(2f, a2))
        entries.add(BarEntry(3f, a3))
        entries.add(BarEntry(4f, a4))
        entries.add(BarEntry(5f, a5))
        entries.add(BarEntry(6f, a6))

// Create a BarDataSet from the data entries
        var dataSet = BarDataSet(entries, "Sales Data")
        dataSet.color = Color.BLUE
        dataSet.valueTextColor = Color.BLACK
        dataSet.valueTextSize = 12F

// Set the data and styling properties of the chart
        var barData = BarData(dataSet)
        barChart.data = barData
        barChart.description.isEnabled = false
        barChart.setTouchEnabled(true)
        barChart.setPinchZoom(true)

// Set the X and Y axis labels and styling properties
        val xAxis = barChart.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.valueFormatter = IndexAxisValueFormatter(arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"))
        xAxis.textColor = Color.BLACK

        val yAxisLeft = barChart.axisLeft
        yAxisLeft.axisMinimum = 0f
        yAxisLeft.textColor = Color.BLACK

        val yAxisRight = barChart.axisRight
        yAxisRight.isEnabled = false

        // Update the chart
        barChart.invalidate()

        binding_thongke_ad.bottomNavigationView.setSelectedItemId(R.id.thongke)
        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // put your code here
                    val intent = Intent(this@ThongKeAdActivity, TrangChuAdActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.no_animation,  R.anim.no_animation)
                    return@OnNavigationItemSelectedListener true
                }

                R.id.chat -> {
                    // put your code here
                    val intent = Intent(this@ThongKeAdActivity, ChatAdActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.no_animation,  R.anim.no_animation)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.chucnang -> {
                    // put your code here
                    val intent = Intent(this@ThongKeAdActivity, ChucNangAdActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.no_animation,  R.anim.no_animation)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

        binding_thongke_ad.bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        binding_thongke_ad.btnDoanhThu.setOnClickListener {
            entries.clear()
            entries.add(BarEntry(0f, a0))
            entries.add(BarEntry(1f, a1))
            entries.add(BarEntry(2f, a2))
            entries.add(BarEntry(3f, a3))
            entries.add(BarEntry(4f, a4))
            entries.add(BarEntry(5f, a5))
            entries.add(BarEntry(6f, a6))

            // Create a BarDataSet from the data entries
            var dataSet = BarDataSet(entries, "Sales Data")
            dataSet.color = Color.BLUE
            dataSet.valueTextColor = Color.BLACK
            dataSet.valueTextSize = 12F


            // Set the data and styling properties of the chart
            var barData = BarData(dataSet)
            barChart.data = barData

            // Update the chart
            barChart.invalidate()
        }

        binding_thongke_ad.btnLuongKhachHang.setOnClickListener {
            entries.clear()
            entries.add(BarEntry(0f, a10))
            entries.add(BarEntry(1f, a11))
            entries.add(BarEntry(2f, a12))
            entries.add(BarEntry(3f, a13))
            entries.add(BarEntry(4f, a7))
            entries.add(BarEntry(5f, a8))
            entries.add(BarEntry(6f, a9))

            // Create a BarDataSet from the data entries
            var dataSet = BarDataSet(entries, "Customer")
            dataSet.color = Color.BLUE
            dataSet.valueTextColor = Color.BLACK
            dataSet.valueTextSize = 12F


            // Set the data and styling properties of the chart
            var barData = BarData(dataSet)
            barChart.data = barData

            // Update the chart
            barChart.invalidate()
        }

    }

}