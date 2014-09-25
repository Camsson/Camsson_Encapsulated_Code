1)�򵥶Ի���
private void showSimple()
{
     new AlertDialog.Builder(this)
     .setmessage("ȷ���뿪��?")
     .setTitle("�򵥶Ի���")
     .setPositiveButton("ȷ��",new DialogInterface.OnClickListener(){
          @Override
          public void onClick(DialogInterface view,int arg1){
               Log.e("click", "done");
          }
     })
     .setNegativeButton("ȡ��",new DialogInterface.OnClickListener(){
          @Override
          public void onClick(DialogInterface view,int arg1){
               Log.e("click", "cancel");
          }
     })
     .show();
}

2)�����
private void showInputDialog()
{
     new AlertDialog.Builder(this)
     .setTitle("������")
     .setIcon(android.R.drawable.ic_input_add)
     .setView(new EditText(this))
     .setPositiveButton("ȷ��",null)
     .setNegativeButton("ȡ��",null)
     .show();
}

3)��ѡ��
private void showDialog()
{
     final String items[] =  new String[]{"����","����","���ӹ�"};
     new AlertDialog.Builder(this)
     .setTitle("��ϲ���ĸ�����?")
     .setSingleChoiceItems(item, 0, new DialogInterface.OnClickListener(){
          @Override
          public void onClick(DialogInterface arg0, int position){
               Log.e("single choice", items[position]);
          }
     })
     .show();
}

4)��ѡ��
private void showMutipleDialog()
{
     final String items[] = new String[]{"����","����","���ӹ�"};
     new AlertDialog.Builder(this)
     .setTitle("��ϲ����Щ����?")
     .setMultiChoiceItems(items, new boolean[]{false, true, true},
          new OnMultiChoiceClickListener(){
          @Override
          public void onClick(DialogInterface arg0, int position, boolean flag){
               Log.e("mutiple choice", items[position]+" "+flag);
          }
     })
     .show();
}

5)�б��
private void showListDialog()
{
     final String items[] = new String[]{"����","����","���ӹ�"};
     new AlertDialog.Builder(this)
     .setTitle("�б��")
     .setItems(items, new DialogInterface.OnClickListener(){
          @Override
          public void onClick(DialogInterface arg0, int position){
               Log.e("list",items[position]);
          }
     })
     .show();
}

6)�Զ���Ի���
�����úò����ļ�dialog.xml
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
     .setTitle("�Զ��岼��")
     .setView(layout)
     .setPositiveButton("ȷ��",null)
     .setNagativeButton("ȡ��",null)
     .show();
}

7)ѡ��ʱ��Ի���
TimerPickerDialog�Ĺ��캯��Ϊ:
TimePickerDialog(Context context, OnTimeSetListener callBack, int hourOfDay, int minute,boolean is24HourView)

private void showTimeDialog()
{
     new TimePickerDialog(this,new TimePickerDialog.OnTimeSetListene(){
          public void onTimeSet(TimePicker view,int hourOfDay, int minute){
               Log.e("time picker",hourOfDay+":"+minute);
          }
     },8, 0, true).show();
    
}

8)ѡ�����ڶԻ���
DatePickerDialog�Ĺ��캯��Ϊ:
DatePickerDialog(Context context, OnDateSetListener callback, int year,int monthOfYear, int dayOfMonth)
private void showDateDialog()
{
     new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener(){
          public void onDateSet(DatePicker view,int year,int monthOfYear,int dayOfMonth){
               Log.e("date picker",year+"-"+monthOfYear+"-"+dayOfMonth);
          }
     }, 2012, 1, 1).show();
}