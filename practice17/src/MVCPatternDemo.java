public class MVCPatternDemo {
    public static void main(String[] args) {
        // Fetch employee record based on his roll no from the database
        Employee model = retrieveEmployeeFromDatabase();
        // Create a view : to write employee details on console
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        // Update model data
        controller.setEmployeeName("gorou");
        controller.setEmployeeId(777);
        controller.setEmployeeSalary(777777);
        controller.updateView();
    }
    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee("arataki itto", 6669, -1);
        return employee;
    }
}
