package kr.hs.emirim.dialogmultichoiceitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)

        btn.setOnClickListener{
            var idolArray = arrayOf("문동주" ,"문현빈", "문성주")
            var checkArray = booleanArrayOf(true, false, false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 야구선수는?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setMultiChoiceItems(idolArray, checkArray){
                dialog, index, ischecked ->
                if(ischecked)
                btn.text = idolArray[index]
            }
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }
    }
}