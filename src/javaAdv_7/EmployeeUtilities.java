package javaAdv_7;

public class EmployeeUtilities {



    static void findViaName(Employee[] employeesArr, String name) {
        Boolean searchResult = false;

        for (int i =0; i < employeesArr.length; i++){
            if (name.equals(employeesArr[i].getName())){
                searchResult = true;
                break;
            }
            continue;
        }
        System.out.println(searchResult);


    }
}
