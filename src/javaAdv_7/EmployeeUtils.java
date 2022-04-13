package javaAdv_7;

public class EmployeeUtils {



    static void findViaName(Employee[] employeesArr, String name) {
        Boolean searchResult = false;

        for (Employee employee : employeesArr) {
            if (name.equals(employee.getName())) {
                searchResult = true;
                break;
            }
            continue;
        }
        System.out.println(searchResult);


    }

    static void findViaSubstring(Employee [] employeesArr, String substr){
        Boolean searchResult = false;

        for (Employee employee : employeesArr) {
            if (employee.getName().contains(substr)) {
                searchResult = true;
                break;
            }
            //continue;
        }
        System.out.println(searchResult);

    }

    static void salaryBudget(Employee [] employeesArr){
        float salaryBudget = 0f;

        for (Employee employee : employeesArr) {
            salaryBudget = salaryBudget + employee.getSalary();
        }
        System.out.println("Total: " + salaryBudget);
    }

    static float findMinSalary(Employee [] employeesArr){
        float minSalary = employeesArr[0].getSalary();

        for ( int i = 1; i < employeesArr.length; i++){
            if (employeesArr[i].getSalary() < minSalary){
                minSalary = employeesArr[i].getSalary();
            }

        }
        return minSalary;
    }

    static float findMaxSalary(Employee [] employeesArr){
        float maxSalary = employeesArr[0].getSalary();

        for ( int i = 1; i < employeesArr.length; i++){
            if (employeesArr[i].getSalary() > maxSalary){
                maxSalary = employeesArr[i].getSalary();
            }

        }
        return maxSalary;
    }

    static int findMinNumberOfSubs(Manager [] managersArr){
        int minNumberOfSubs = managersArr[0].getNumberOfSubs();

        for (int i = 1; i < managersArr.length; i++){
            if (managersArr[i].getNumberOfSubs() < minNumberOfSubs){
                minNumberOfSubs = managersArr[i].getNumberOfSubs();
            }
        }
        return minNumberOfSubs;
    }

    static int findMaxNumberOfSubs(Manager [] managersArr){
        int maxNumberOfSubs = managersArr[0].getNumberOfSubs();

        for (int i = 1; i < managersArr.length; i++){
            if (managersArr[i].getNumberOfSubs() > maxNumberOfSubs){
                maxNumberOfSubs = managersArr[i].getNumberOfSubs();
            }
        }
        return maxNumberOfSubs;
    }

    static float findMinSupplement(Manager [] managersArr){
        float minSupplement = managersArr[0].salary - managersArr[0].getBaseSalary();

        for (int i = 1; i < managersArr.length; i++){
            if ((managersArr[i].salary - managersArr[i].getBaseSalary()) < minSupplement){
                minSupplement = managersArr[i].salary - managersArr[i].getBaseSalary();
            }
        }
        return minSupplement;
    }

}
