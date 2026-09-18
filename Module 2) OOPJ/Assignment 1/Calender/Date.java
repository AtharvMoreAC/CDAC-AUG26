public class Date {

    private int day;
    private int month;
    private int year;

    public void setDate(int dd, int mm, int yy) {

        year = yy;

        if(mm < 1 || mm > 12)
            month = 1;
        else
            month = mm;

        if(month == 1 || month == 3 || month == 5 ||
           month == 7 || month == 8 || month == 10 || month == 12) {

            if(dd < 1 || dd > 31)
                day = 1;
            else
                day = dd;
        }

        else if(month == 4 || month == 6 ||
                month == 9 || month == 11) {

            if(dd < 1 || dd > 30)
                day = 1;
            else
                day = dd;
        }

        else if(month == 2) {

            if((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0) {

                if(dd < 1 || dd > 29)
                    day = 1;
                else
                    day = dd;
            }

            else {

                if(dd < 1 || dd > 28)
                    day = 1;
                else
                    day = dd;
            }
        }
    }

    public void addDays(int days) {

        day = day + days;

        while(true) {

            int maxDays;

            if(month == 2) {

                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    maxDays = 29;
                else
                    maxDays = 28;
            }

            else if(month == 4 || month == 6 ||
                    month == 9 || month == 11) {

                maxDays = 30;
            }

            else {

                maxDays = 31;
            }

            if(day <= maxDays)
                break;

            day = day - maxDays;
            month++;

            if(month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public void addMonths(int months) {

        month = month + months;

        while(month > 12) {

            month = month - 12;
            year++;
        }

        // Check whether day is valid in new month

        if(month == 2) {

            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

                if(day > 29)
                    day = 29;
            }

            else {

                if(day > 28)
                    day = 28;
            }
        }

        else if(month == 4 || month == 6 ||
                month == 9 || month == 11) {

            if(day > 30)
                day = 30;
        }
    }

    public void addYear(int years) {

        year = year + years;

        // Special case: 29 February

        if(month == 2 && day == 29) {

            if(!((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {

                day = 28;
            }
        }
    }

    public void display() {

        System.out.println("DATE : " + day + "/" + month + "/" + year);
    }

    public int getDay() {

        return day;
    }

    public int getMonth() {

        return month;
    }

    public int getYear() {

        return year;
    }
}