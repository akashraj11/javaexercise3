import java.util.ArrayList;

public class SeriesOfNumbers {
    public boolean CheckSeries(String arrOfString) {
        int count =0;
        boolean value= false;
        ArrayList<Integer> listNUm = new ArrayList<Integer>();
        String[] arrOfStringFields = arrOfString.split(",");
        for(int i = 0;i<arrOfStringFields.length;i++) {
            int number = Integer.parseInt(arrOfStringFields[i]);
            listNUm.add(number);
            count++;
        }
        if((listNUm.get(0)+1 == listNUm.get(1) ) || (listNUm.get(0)-1 == listNUm.get(1) )) {
            if (listNUm.get(0) + 1 == listNUm.get(1)) {
                for (int i = 1; i < 6; i++) {
                    if (listNUm.get(i) + 1 != listNUm.get(i + 1))
                        value = false;
                    else{
                        value = true;
                        break;}
                }
            }
            else if (listNUm.get(0) - 1 == listNUm.get(1)) {
                for (int i = 1; i < 6; i++) {
                    if (listNUm.get(i) - 1 != listNUm.get(i + 1))
                        value = false;
                    else{
                        value = true;
                        break;}
                }
            }
        }



        return value;

    }

}