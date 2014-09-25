�Զ���ʱ�䴦����:

public class STime {
       private int hour ;
       private int minutes ;
       public STime(int hour, int minutes) {
             this.hour = hour;
             this.minutes = minutes;
      }
             public int getHour() {
             return hour ;
      }
       public int getMinutes() {
             return minutes ;
      }
      //���ظ�ʽΪ"XX:XX"��ʱ���ʱ,�ֲ���װ��STime��
       public static STime getTime(String t)
      {
            t = t.trim();
             return new STime(Integer.parseInt (t.substring(0, 2)), Integer.parseInt(t.substring(3, 5)));
      }
      //��һ��STime���͵�����ת���ɸ�ʽΪ"XX:XX"��String
       public static String getTimeBack(STime stime)
      {
            String mytime = "";
             if(stime.getHour() >= 10)
            {
                  mytime += String. valueOf(stime.getHour());
            }
             else
            {
                  mytime += "0"+String.valueOf(stime.getHour());
            }
            mytime += ":";
             if(stime.getMinutes() >= 10)
            {
                  mytime += String. valueOf(stime.getMinutes());
            }
             else
            {
                  mytime += "0"+String.valueOf(stime.getMinutes());
            }
             return mytime;
      }
}

-------------------------

�Զ������ڴ�����

public class SDate {
       private int year ;
       private int month ;
       private int day ;
             public int getYear() {
             return year ;
      }
       public int getMonth() {
             return month ;
      }
       public int getDay() {
             return day ;
      }
             public SDate(int year, int month, int day) {
             this.year = year;
             this.month = month;
             this.day = day;
      }
       //�Ѹ�ʽΪ��XXXX-XX-XX����ʱ�䷵���ꡢ�¡��ղ���װ��SDate��
       public static SDate getDate(String d)
      {
             int year = 1;
             int month = 1;
             int day = 1;
            d = d.trim();
            year = Integer. parseInt(d.substring(0, 4));
             switch(d.length())
            {
             //XXXX-X-X
             case 8:
                  month = Integer. parseInt(d.charAt(5)+"");
                  day = Integer. parseInt(d.charAt(7)+"");
                   break;
             case 9:
                   //XXXX-X-XX
                   if(d.charAt(6) >'9' || d.charAt(6) <'0')
                  {
                        month = Integer. parseInt(d.charAt(5)+"");
                        day = Integer. parseInt(d.substring(7, 9));
                  }
                   //XXXX-XX-X
                   else
                  {
                        month = Integer. parseInt(d.substring(5, 7));
                        day = Integer. parseInt(d.charAt(8)+"");
                  }
                   break;
             //XXXX-XX-XX
             case 10:
                  month = Integer. parseInt(d.substring(5, 7));
                  day = Integer. parseInt(d.substring(8, 10));
                   break;
            }
             return new SDate(year, month, day);
      }
       //��SDate���ظ�ʽΪ��XXXX-XX-XX����String
       public static String getDateBack(SDate sDate)
      {
            String date= "";
            date = sDate.getYear() + "-" + sDate.getMonth() + "-" ;
             if(sDate.getDay() >= 10)
            {
                  date = date + String. valueOf(sDate.getDay());
            }
             else
            {
                  date = date + "0" + String.valueOf(sDate.getDay());
            }
             return date;
      }
}
