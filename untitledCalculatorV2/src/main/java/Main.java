import java.util.Scanner;

public class Main {
    static double impactCount(double confidential, double integrity, double availability) {
        double impact = 10.41 * (1 -(1 - confidential) * (1 - integrity) * (1 - availability));
        return impact;
    }
    static double exploitCount(double access, double complex, double auth) {
        double exploit = 20 * access * complex * auth;
        return exploit;
    }
    static double fImpactCount(double impact) {
        double fImpact;
        if(impact == 0) {
            fImpact = 0;
        } else {
            fImpact = 1.176;
        }
        return fImpact;
    }
    static double baseCount(double impact, double exploit, double fImpact) {
        double baseScore = (((0.6*impact) + (0.4*exploit) - 1.5) * fImpact);
        return Math.round(baseScore * 10) / 10.0;
    }

    static double temporalCount(double baseScore, double exploit, double remediation, double confidence) {
        double temporalScore = baseScore * exploit * remediation * confidence;
        return Math.round(temporalScore * 10) / 10.0;
    }
    static double environmentCount(double adjTemporal, double potential, double distribution) {
        double environment = (adjTemporal + (10 - adjTemporal) * potential) * distribution;
        return Math.round(environment * 10) / 10.0;
    }
    static double adjImpactCount(double confidential, double confReq, double integrity, double integrityReq, double availability, double availabilityReq) {
        double adjImpact = 10.41 * (1 -(1 - confidential * confReq) * (1 - integrity * integrityReq) * (1 - availability * availabilityReq));
        if(adjImpact > 10) {
            adjImpact = 10;
        }
        return adjImpact;
    }

    //Base metrics
    static double setAccessVector() {
        double accessVector = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Возможный способ эксплуатации уязвимости: \n Локальный (L) \n Локально-сетевой(A) \n Сетевой(N)");
        String metric =  scanner.nextLine();
        if (metric.equals("L")) {
            accessVector = 0.395;
        } else if (metric.equals("A")) {
            accessVector = 0.646;
        } else if (metric.equals("N")) {
            accessVector = 1.0;
        } else {
            System.out.println("di nah");
        }
        return accessVector;
    }
    static double setAccessComplexity() {
        double accessComplexity = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уровень сложности атаки: \n Высокий (H) \n Средний(M) \n Низкий(L)");
        String metric =  scanner.nextLine();
        if (metric.equals("H")) {
            accessComplexity = 0.35;
        } else if (metric.equals("M")) {
            accessComplexity = 0.61;
        } else if (metric.equals("L")) {
            accessComplexity = 0.71;
        } else {
            System.out.println("di nah");
        }
        return accessComplexity;
    }
    static double setAuthentication() {
        double authentication = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Способ аутентификации для эксплуатации уязвимости: \n Многократная (M) \n Однократная (S) \n Отсутсвует (N)");
        String metric =  scanner.nextLine();
        if (metric.equals("M")) {
            authentication = 0.45;
        } else if (metric.equals("S")) {
            authentication = 0.56;
        } else if (metric.equals("N")) {
            authentication = 0.704;
        } else {
            System.out.println("di nah");
        }
        return authentication;
    }
    static double setConfidential() {
        double confidential = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уязвимость конфиденциальности данных системы: \n Нулевая (N) \n Частичная (P) \n Полная (C)");
        String metric =  scanner.nextLine();
        if (metric.equals("N")) {
            confidential = 0.0;
        } else if (metric.equals("P")) {
            confidential = 0.275;
        } else if (metric.equals("C")) {
            confidential = 0.66;
        } else {
            System.out.println("di nah");
        }
        return confidential;
    }
    static double setIntegrity() {
        double integrity = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уязвимость целостности данных системы: \n Нулевая (N) \n Частичная (P) \n Полная (C)");
        String metric =  scanner.nextLine();
        if (metric.equals("N")) {
            integrity = 0.0;
        } else if (metric.equals("P")) {
            integrity = 0.275;
        } else if (metric.equals("C")) {
            integrity = 0.66;
        } else {
            System.out.println("di nah");
        }
        return integrity;
    }
    static double setAvailability() {
        double availability = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уязвимость доступности системы: \n Нулевая (N) \n Частичная (P) \n Полная (C)");
        String metric =  scanner.nextLine();
        if (metric.equals("N")) {
            availability = 0.0;
        } else if (metric.equals("P")) {
            availability = 0.275;
        } else if (metric.equals("C")) {
            availability = 0.66;
        } else {
            System.out.println("di nah");
        }
        return availability;
    }
    //Temporal metrics
    static double setExploit() {
        double exploit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Наличие или отсутствие кода и технологии эксплуатации: \n Не определено (ND) " +
                "\n Теоритически (U) \n Есть концепция(POC) \n Есть сценарий (F) \n Высокая (H)");
        String metric =  scanner.nextLine();
        if (metric.equals("ND")) {
            exploit = 1.0;
        } else if (metric.equals("U")) {
            exploit = 0.85;
        } else if (metric.equals("POC")) {
            exploit = 0.9;
        } else if (metric.equals("F")) {
            exploit = 0.95;
        } else if (metric.equals("H")) {
            exploit = 1.0;
        } else {
            System.out.println("di nah");
        }
        return exploit;
    }
    static double setRemediation() {
        double remediation = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уровень исправления: \n Не определено (ND) " +
                "\n Официальное (OF) \n Временное (TF) \n Рекомендации (W) \n Недоступно (U)");
        String metric =  scanner.nextLine();
        if (metric.equals("ND")) {
            remediation = 1.0;
        } else if (metric.equals("OF")) {
            remediation = 0.87;
        } else if (metric.equals("TF")) {
            remediation = 0.9;
        } else if (metric.equals("W")) {
            remediation = 0.95;
        } else if (metric.equals("U")) {
            remediation = 1.0;
        } else {
            System.out.println("di nah");
        }
        return remediation;
    }
    static double setReportConfidence() {
        double confidence = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cтепень достоверности источника: \n Не определено (ND) " +
                "\n Не подтверждена (UC) \n Не доказана (UR) \n Подтверждена (C)");
        String metric =  scanner.nextLine();
        if (metric.equals("ND")) {
            confidence = 1.0;
        } else if (metric.equals("UC")) {
            confidence = 0.9;
        } else if (metric.equals("UR")) {
            confidence = 0.95;
        } else if (metric.equals("C")) {
            confidence = 1.0;
        } else {
            System.out.println("di nah");
        }
        return confidence;
    }
    //Environmental metric
    static double setDamagePotential() {
        double potential = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Возможность повреждения или утраты собственности/оборудования: \n Не определено (ND) " +
                "\n Отсутствует (N) \n Низкая (L) \n Средняя (LM) \n Повышенная (MH) \n Высокая (H)");
        String metric =  scanner.nextLine();
        if (metric.equals("ND")) {
            potential = 0.0;
        } else if (metric.equals("N")) {
            potential = 0.0;
        } else if (metric.equals("L")) {
            potential = 0.1;
        } else if (metric.equals("LM")) {
            potential = 0.3;
        } else if (metric.equals("MH")) {
            potential = 0.4;
        } else if(metric.equals("H")){
            potential = 0.5;
        } else {
            System.out.println("di nah");
        }
        return potential;
    }
    static double setDistribution() {
        double distribution = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Процент уязвимых систем относительно их общего числа: \n Не определено (ND) " +
                "\n Отсутствует (N) \n Низкая (L) \n Средняя (M) \n Высокая (H)");
        String metric =  scanner.nextLine();
        if (metric.equals("ND")) {
            distribution = 1.0;
        } else if (metric.equals("N")) {
            distribution = 0.0;
        } else if (metric.equals("L")) {
            distribution = 0.25;
        } else if (metric.equals("M")) {
            distribution = 0.75;
        } else if(metric.equals("H")){
            distribution = 1.0;
        } else {
            System.out.println("di nah");
        }
        return distribution;
    }
    static double setConfidentialReq() {
        double confidentiality = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уязвимость конфиденциальности:  \n Не определено (ND) " +
                "\n Низкая (L) \n Средняя (M) \n Высокая (H)");
        String metric =  scanner.nextLine();
        if (metric.equals("ND")) {
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
        System.out.println("Уязвимость целостности:  \n Не определено (ND) " +
                "\n Низкая (L) \n Средняя (M) \n Высокая (H)");
        String metric =  scanner.nextLine();
        if (metric.equals("ND")) {
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
        System.out.println("Уязвимость доступности:  \n Не определено (ND) " +
                "\n Низкая (L) \n Средняя (M) \n Высокая (H)");
        String metric =  scanner.nextLine();
        if (metric.equals("ND")) {
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
        //Задаем метрики
        System.out.println("Подситаем базовую оценку");
        double accessVector = setAccessVector();
        double accessComplexity = setAccessComplexity();
        double auth = setAuthentication();
        double confidential = setConfidential();
        double integrity = setIntegrity();
        double availability = setAvailability();

        double impact = impactCount(confidential, integrity, availability);
        double exploit = exploitCount(accessVector, accessComplexity, auth);
        double fImpact = fImpactCount(impact);
        double baseScore = baseCount(impact, exploit, fImpact);
        System.out.println("Базовая оценка: " + baseScore);

        System.out.println("Подситаем временную оценку");
        double exploitMetric = setExploit();
        double remediation = setRemediation();
        double reportConfidence = setReportConfidence();
        double temporal = temporalCount(baseScore, exploitMetric, remediation, reportConfidence);
        System.out.println("Временная оценка: " + temporal);

        System.out.println("Подсчтаем контекстную оценку");
        double damagePotential = setDamagePotential();
        double distribution = setDistribution();
        double confidentialReq = setConfidentialReq();
        double integrityReq = setIntegrityReq();
        double setAvailabilityReq = setAvailabilityReq();

        double adjImpact = adjImpactCount(confidential, confidentialReq, integrity, integrityReq, availability, setAvailabilityReq);
        double adjBase = baseCount(adjImpact, exploit, fImpact);
        double adjTemporal = temporalCount(adjBase, exploit, remediation, reportConfidence);
        double environment = environmentCount(adjTemporal, damagePotential, distribution);
        System.out.println("Контекстная оценка: " + environment);


    }



}