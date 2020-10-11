package concurrency;

import java.util.concurrent.*;

public class java8Concurrency {

        public static void main(String[] args) {


            // Java 8
            // executing runnable is only 3 lines


            Runnable r = ()  -> System.out.println("Example of Java 8 Runnable");

            Thread thread = new Thread(r);
            thread.start();

            // For callable there are only
            // 1) Define Callable
            // 2)             ExecutorService executorService = Executors.newFixedThreadPool(5);
            // 3)             Future future1 = executorService.submit(callable);
            // 4)                   returnVariable = future1.get();
            // 5)            } catch (InterruptedException e)

            Callable callable = () -> {

                    System.out.println("Calllable called return 5");
                    Integer i = 5;
                    return i;

                };

            ExecutorService executorService = Executors.newFixedThreadPool(5);
            Future future1 = executorService.submit(callable);
            Object returnVariable = null;
            try {
                returnVariable = future1.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            System.out.println( "Value is =" + (Object) returnVariable );

            if ( returnVariable instanceof Integer) {
                System.out.println( "Value is =" + (Object) returnVariable );
            }

        }
}
