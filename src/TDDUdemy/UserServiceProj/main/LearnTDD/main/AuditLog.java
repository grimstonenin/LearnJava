package LearnTDD.main;

public interface AuditLog {
    void log(String logType, String subType, String data);
}
