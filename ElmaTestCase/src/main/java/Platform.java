import java.time.LocalDateTime;
import java.util.ArrayList;
// Platform - класс, необходимй для распоряжения сотрудниками
public class Platform {
    private ArrayList<Catalog> notes;

    public Platform() {
        this.notes = new ArrayList<>();
    }
    // отправить сотрудника в командировку
    public void sendEmployee(Employee employee, String destination, int bYear, int bMonth, int bDay, int bHour, int bMin) {
        //проверяем, может ли сотрудник быть послан в командировку на основе его должности и того,
        // находится ли он в данный момент в командировке
        if(((employee.getPosition().equals("Manager")) || (employee.getPosition().equals("Sales manager")) ||
                (employee.getPosition().equals("Analyst"))) && (employee.getAway().equals(false))) {
            //создаем запись о том, что сотрудник уехал
            setNotes(new Catalog(employee, destination, LocalDateTime.of(bYear, bMonth, bDay, bHour, bMin)));
            employee.setAway(true);
        } else {
            System.out.println("Employee can't go on business trip");
        }
    }

    private Catalog findNoteByName(String name) {
        int i = 0;
        for(Catalog c: notes) {
            if(c.getEmployee().getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
    // Возвращаем сотрудника из командировки
    public void returnEmployee(Employee employee, int eYear, int eMonth, int eDay, int eHour, int eMin) {
        Catalog current = findNoteByName(employee.getName());
        current.setEnd(LocalDateTime.of(eYear, eMonth, eDay, eHour, eMin));
        current.setDuration(current.getBegin(), current.getEnd());
        employee.setAway(false);
    }
    //Замена шаблону документа, который необходимо выводить
    public void printRecapByIndex(Catalog catalog) {
        System.out.println(catalog.getEmployee().getName() + " was in " + catalog.getDestination() + " for " +
                catalog.getDuration().toDays() + " days.");
    }
    //Замена шаблону жокумента, который надо выводить
    public void printRecapByEmployee(Employee employee) {
        printRecapByIndex(findNoteByName(employee.getName()));
    }

    public ArrayList<Catalog> getNotes() {
        return notes;
    }

    public void setNotes(Catalog catalog) {
        this.notes.add(catalog);
    }

}
