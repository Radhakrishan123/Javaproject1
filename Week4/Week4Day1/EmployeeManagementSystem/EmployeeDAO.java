public interface EmployeeDAO {

    void updateEmployee(int id, String email);

    void deleteEmployee(int id);

	void addEmployee(EmployeeDb e);
}