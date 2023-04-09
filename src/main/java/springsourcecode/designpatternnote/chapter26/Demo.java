package springsourcecode.designpatternnote.chapter26;

import springsourcecode.designpatternnote.chapter26.dto.RequestInfo;

public class Demo {

    public static void main(String[] args) {
         MetricsStorage redisMetricsStorage = new RedisMetricsStorage();
        ConsoleReportor consoleReportor = new ConsoleReportor(redisMetricsStorage);
        consoleReportor.startRepeatedReport(10,10);

        EmailReporter emailReporter = new EmailReporter(redisMetricsStorage);
        emailReporter.addToAddress("123@qq.com");
        emailReporter.startDailyReport();

        MetricsCollector collector = new MetricsCollector(redisMetricsStorage);
        collector.recordRequest(new RequestInfo("login",132,132));
        collector.recordRequest(new RequestInfo("login",132,132));
        collector.recordRequest(new RequestInfo("register",132,132));
        collector.recordRequest(new RequestInfo("register",132,132));
        collector.recordRequest(new RequestInfo("register",132,132));

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
