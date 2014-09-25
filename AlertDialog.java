1)简单对话框
private void showSimple()
{
     new AlertDialog.Builder(this)
     .setmessage("确定离开吗?")
     .setTitle("简单对话框")
     .setPositiveButton("确定",new DialogInterface.OnClickListener(){
          @Override
          public void onClick(DialogInterface view,int arg1){
               Log.e("click", "done");
          }
     })
     .setNegativeButton("取消",new DialogInterface.OnClickListener(){
          @Override
          public void onClick(DialogInterface view,int arg1){
               Log.e("click", "cancel");
          }
     })
     .show();
}

2)输入框
private void showInputDialog()
{
     new AlertDialog.Builder(this)
     .setTitle("请输入")
     .setIcon(android.R.drawable.ic_input_add)
     .setView(new EditText(this))
     .setPositiveButton("确定",null)
     .setNegativeButton("取消",null)
     .show();
}

3)单选框
private void showDialog()
{
     final String items[] =  new String[]{"吉他","钢琴","架子鼓"};
     new AlertDialog.Builder(this)
     .setTitle("你喜欢哪个乐器?")
     .setSingleChoiceItems(item, 0, new DialogInterface.OnClickListener(){
          @Override
          public void onClick(DialogInterface arg0, int position){
               Log.e("single choice", items[position]);
          }
     })
     .show();
}

4)复选框
private void showMutipleDialog()
{
     final String items[] = new String[]{"吉他","钢琴","架子鼓"};
     new AlertDialog.Builder(this)
     .setTitle("你喜欢哪些乐器?")
     .setMultiChoiceItems(items, new boolean[]{false, true, true},
          new OnMultiChoiceClickListener(){
          @Override
          public void onClick(DialogInterface arg0, int position, boolean flag){
               Log.e("mutiple choice", items[position]+" "+flag);
          }
     })
     .show();
}

5)列表框
private void showListDialog()
{
     final String items[] = new String[]{"吉他","钢琴","架子鼓"};
     new AlertDialog.Builder(this)
     .setTitle("列表框")
     .setItems(items, new DialogInterface.OnClickListener(){
          @Override
          public void onClick(DialogInterface arg0, int position){
               Log.e("list",items[position]);
          }
     })
     .show();
}

6)自定义对话框
先配置好布局文件dialog.xml
<LinearLayout ...
     amdroid:id="@+id/dialog">
     <TextView ... />
     <EditView ... />
</LinearLayout>
private void showDialog()
{
     LayoutInflater inflater = getLayoutInflater();
     View layout  = inflater.inflate(R.layout.dialog,(ViewGroup)findViewById(R.id.dialog));
     new AlertDialog.Builder(this)
     .setTitle("自定义布局")
     .setView(layout)
     .setPositiveButton("确定",null)
     .setNagativeButton("取消",null)
     .show();
}

7)选择时间对话框
TimerPickerDialog的构造函数为:
TimePickerDialog(Context context, OnTimeSetListener callBack, int hourOfDay, int minute,boolean is24HourView)

private void showTimeDialog()
{
     new TimePickerDialog(this,new TimePickerDialog.OnTimeSetListene(){
          public void onTimeSet(TimePicker view,int hourOfDay, int minute){
               Log.e("time picker",hourOfDay+":"+minute);
          }
     },8, 0, true).show();
    
}

8)选择日期对话框
DatePickerDialog的构造函数为:
DatePickerDialog(Context context, OnDateSetListener callback, int year,int monthOfYear, int dayOfMonth)
private void showDateDialog()
{
     new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener(){
          public void onDateSet(DatePicker view,int year,int monthOfYear,int dayOfMonth){
               Log.e("date picker",year+"-"+monthOfYear+"-"+dayOfMonth);
          }
     }, 2012, 1, 1).show();
}