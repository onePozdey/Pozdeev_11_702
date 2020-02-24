import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Catalog {

    private Employee employee;
    private String destination;
    private LocalDateTime begin;
    private LocalDateTime end;
    //Контекстная переменная из задания
    private Duration duration;

    public Catalog(Employee employee, String destination, LocalDateTime begin) {
        this.employee = employee;
        this.destination = destination;
        this.begin = begin;
        this.end = null;
        this.duration = null;
    }

    public Employee getEmployee() {
        return employee;
    }
    public String getDestination() {
        return destination;
    }
    public LocalDateTime getBegin() {
        return begin;
    }
    public LocalDateTime getEnd() {
        return end;
    }
    public Duration getDuration() {
        return duration;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }
    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    //Рассчет контекстной переменной
    public void setDuration(LocalDateTime start, LocalDateTime end) {
        this.duration = Duration.between(start, end);
    }
}
