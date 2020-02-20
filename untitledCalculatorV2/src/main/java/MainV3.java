import java.util.Scanner;

public class MainV3 {
    static double impactCount(double source, double impactBase) {
        double impact = 0;
        if(source == 0) {
            impact = 6.42 * impactBase;
        } else if (source == 1) {
            impact = 7.52 * (impactBase - 0.029) - 3.25 * Math.pow((impactBase - 0.02), 15);
        }
        return impact;
    }
    static double impactBaseCount(double confReq, double integrityReq, double availReq) {
        double impactBase = 1 - ((1 - confReq) * (1 - integrityReq) * (1 - availReq));
        return impactBase;
    }
    static double exploitCount(double vector, double difficulty, double privilege, double interaction) {
        double exploit = 8.22 * vector * difficulty * privilege * interaction;
        return exploit;
    }
    static double baseCount(double impact, double exploit, double source) {
        double baseScore = 0;
        if (impact <= 0) {
            baseScore = 0;
        } else {
            if (source == 0) {
                baseScore = Math.round((impact + exploit) * 10.0) / 10.0;
                if(baseScore > 10) {
                    baseScore = 10;
                }
            } else if(source == 1) {
                baseScore = Math.round((1.08 * (impact * exploit)) * 10.0) / 10.0;
                if (baseScore > 10) {
                    baseScore = 10;
                }
            }
        }
        return baseScore;
    }
    static double temporalScore(double exploitMetric, double remediation, double conf, double baseScore) {
        double temporalScore = Math.round(baseScore * exploitMetric * remediation * conf);
        return temporalScore;
    }

    //base metrics
    static double setAttackVector() {
        double vector = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Удаленность атакующего объекта от уязвимого: \n Физичекский (P) \n  Локальный (L) \n  Смежная сеть (A) \n Сетевой (N)");
        String metric = scanner.nextLine();
        if (metric.equals("P")) {
            vector = 0.2;
        } else if (metric.equals("L")) {
            vector = 0.55;
        } else if (metric.equals("A")) {
            vector = 0.62;
        } else if (metric.equals("N")) {
            vector = 0.85;
        } else {
            System.out.println("Неверный ввод");
            setAttackVector();
        }
        return vector;
    }
    static double setAttackDifficulty() {
        double difficulty = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Степень сложности осуществления атаки: \n Высокая (H) \n  Низкая (L)");
        String metric = scanner.nextLine();
        if (metric.equals("H")) {
            difficulty = 0.44;
        } else if (metric.equals("L")) {
            difficulty = 0.77;
        } else {
            System.out.println("Неверный ввод");
            setAttackDifficulty();
        }
        return difficulty;
    }
    static double setPrivileges(double source) {
        double privileges = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимость аутентификации: \n Выскойи (H) \n  Низкий (L) \n  Не требуется (N)");
        String metric = scanner.nextLine();
        if (metric.equals("H")) {
            if(source == 0) {
                privileges = 0.27;
            } else if (source == 1) {
                privileges = 0.50;
            }
        } else if (metric.equals("L")) {
            if(source == 0) {
                privileges = 0.62;
            } else if (source == 1) {
                privileges = 0.68;
            }
        } else if (metric.equals("N")) {
            privileges = 0.85;
        }  else {
            System.out.println("Неверный ввод");
            setPrivileges(source);
        }
        return privileges;
    }
    static double setUserInteraction() {
        double interaction = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимы ли действия со стороны пользователя?: \n Требуется (T) \n Не требуется (N)");
        String metric = scanner.nextLine();
        if (metric.equals("R")) {
            interaction = 0.62;
        }  else if (metric.equals("N")) {
            interaction = 0.85;
        } else {
            System.out.println("Неверный ввод");
            setUserInteraction();
        }
        return interaction;
    }
    static double setScope() {
        double scope = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Возможно ли путём эксплуатации уязвимости одного компонента системы " +
                "нарушить конфиденциальность, целостность и доступность другого: \n Можно (U) \n Нельзя (C)");
        String metric = scanner.nextLine();
        if (metric.equals("U")) {
            scope = 0;
        } else if (metric.equals("C")) {
            scope = 1;
        } else {
            System.out.println("Неверный ввод");
            setScope();
        }
        return scope;
    }
    static double setConfidentiality() {
        double conf = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Степень влияния на конфиденциальность: \n Не оказывает (N) \n  Низкое (L) \n  Высокое (H)");
        String metric = scanner.nextLine();
        if (metric.equals("N")) {
            conf = 0;
        } else if (metric.equals("L")) {
            conf = 0.22;
        } else if (metric.equals("H")) {
            conf = 0.56;
        }  else {
            System.out.println("Неверный ввод");
            setConfidentiality();
        }
        return conf;
    }
    static double setIntegrity() {
        double integrity = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Степень влияния на целостность: \n Не оказывает (N) \n  Низкое (L) \n  Высокое (H)");
        String metric = scanner.nextLine();
        if (metric.equals("N")) {
            integrity = 0;
        } else if (metric.equals("L")) {
            integrity = 0.22;
        } else if (metric.equals("H")) {
            integrity = 0.56;
        }  else {
            System.out.println("Неверный ввод");
            setIntegrity();
        }
        return integrity;
    }
    static double setAvailability() {
        double availability = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Степень влияния на доступность: \n Не оказывает (N) \n  Низкое (L) \n  Высокое (H)");
        String metric = scanner.nextLine();
        if (metric.equals("N")) {
            availability = 0;
        } else if (metric.equals("L")) {
            availability = 0.22;
        } else if (metric.equals("H")) {
            availability = 0.56;
        }  else {
            System.out.println("Неверный ввод");
            setAvailability();
        }
        return availability;
    }
    //temporal metrics
    static double setExploit() {
        double exploit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Степень доступности эксплуатации: \n Не определено (ND) \n  Теоретически (U) \n Есть концепция (POC)" +
                "\n Есть сценарий (F) \n  Высокое (H)");
        String metric = scanner.nextLine();
        if (metric.equals("ND")) {
            exploit = 2.0;
        } else if (metric.equals("U")) {
            exploit = 0.91;
        } else if (metric.equals("POC")) {
            exploit = 0.94;
        } else if (metric.equals("F")) {
            exploit = 0.97;
        } else if (metric.equals("H")) {
            exploit = 1.0;
        } else {
            System.out.println("Неверный ввод");
            setExploit();
        }
        return exploit;
    }
    static double setRemediation() {
        double remediation = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уровень исправления: \n Не определено (ND) " +
                "\n Официальное (OF) \n Временное (TF) \n Рекомендации (W) \n Недоступно (U)");
        String metric =  scanner.nextLine();
        if (metric.equals("X")) {
            remediation = 1.0;
        } else if (metric.equals("O")) {
            remediation = 0.95;
        } else if (metric.equals("T")) {
            remediation = 0.96;
        } else if (metric.equals("W")) {
            remediation = 0.97;
        } else if (metric.equals("U")) {
            remediation = 1.0;
        } else {
            System.out.println("Wrong entry");
        }
        return remediation;
    }
    static double setConfidence() {
        double conf = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Степень достоверности источника: \n Не определено (X) \n  Отчеты (U) \n Достоверные отчеты (R)" +
                "\n  Подтверждено (C)");
        String metric = scanner.nextLine();
        if (metric.equals("X")) {
            conf = 1.0;
        } else if (metric.equals("U")) {
            conf = 0.92;
        } else if (metric.equals("R")) {
            conf = 0.96;
        } else if (metric.equals("C")) {
            conf = 1.0;
        } else {
            System.out.println("Неверный ввод");
            setConfidence();
        }
        return conf;
    }
    //environmental metrics
    static double setConfidentialReq() {
        double confidentiality = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уязвимость конфиденциальности:  \n Не определено (X) " +
                "\n Низкая (L) \n Средняя (M) \n Высокая (H)");
        String metric =  scanner.nextLine();
        if (metric.equals("X")) {
            confidentiality = 1.0;
        } else if (metric.equals("L")) {
            confidentiality = 0.5;
        } else if (metric.equals("M")) {
            confidentiality = 1.0;
        } else if(metric.equals("H")){
            confidentiality = 1.51;
        } else {
            System.out.println("di nah");
        }
        return confidentiality;
    }
    static double setIntegrityReq() {
        double integrity = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уязвимость целостности:  \n Не определено (X) " +
                "\n Низкая (L) \n Средняя (M) \n Высокая (H)");
        String metric =  scanner.nextLine();
        if (metric.equals("X")) {
            integrity = 1.0;
        } else if (metric.equals("L")) {
            integrity = 0.5;
        } else if (metric.equals("M")) {
            integrity = 1.0;
        } else if(metric.equals("H")){
            integrity = 1.51;
        } else {
            System.out.println("di nah");
        }
        return integrity;
    }
    static double setAvailabilityReq() {
        double availability = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уязвимость доступности:  \n Не определено (X) " +
                "\n Низкая (L) \n Средняя (M) \n Высокая (H)");
        String metric =  scanner.nextLine();
        if (metric.equals("X")) {
            availability = 1.0;
        } else if (metric.equals("L")) {
            availability = 0.5;
        } else if (metric.equals("M")) {
            availability = 1.0;
        } else if(metric.equals("H")){
            availability = 1.51;
        } else {
            System.out.println("di nah");
        }
        return availability;
    }

    public static void main(String[] args) {
        double attackVector = setAttackVector();
        double attackDifficulty = setAttackDifficulty();
        double scope = setScope();
        double privilege = setPrivileges(scope);
        double userInteraction = setUserInteraction();
        double confidentiality = setConfidentiality();
        double integrity = setIntegrity();
        double availability = setAvailability();
        double confidentialReq = setConfidentialReq();
        double integrityReq = setIntegrityReq();
        double availabilityReq = setAvailabilityReq();
        double exploitMetric = setExploit();
        double remediation = setRemediation();
        double confidence = setConfidence();


        double impactBase = impactBaseCount(confidentialReq, integrityReq, availabilityReq);
        double impact = impactCount(scope, impactBase);
        double exploit = exploitCount(attackVector, attackDifficulty, privilege, userInteraction);
        double baseScore = baseCount(impact, exploit, scope);
        double temporalScore = temporalScore(exploitMetric, remediation, confidence, baseScore);

        System.out.println("Base score: " + baseScore);
        System.out.println("Temporal score: " + temporalScore);
    }
}
