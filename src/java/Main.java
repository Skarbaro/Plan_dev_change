package java;

import com.microsoft.gctoolkit.GCToolKit;
import com.microsoft.gctoolkit.io.GCLogFile;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            throw new IllegalArgumentException("This sample requires a path to a GC log file as an argument.");
        }        
        Main main = new Main();
        main.execute(args[0]);
		int a = 14;
		int b = 17;
    }

    public void execute(String gcLogFilePath) {
        GCLogFile logFile = new SingleGCLogFile(Path.of(gcLogFilePath));
        GCToolKit gcToolKit = new GCToolKit();
        JavaVirtualMachine machine = gcToolKit.analyze(logFile);
        HeapOccupancyAfterCollectionSummary results = machine.getAggregation(HeapOccupancyAfterCollectionSummary.class);
        results.get().forEach((gcType, dataSet) ->
            System.out.println("The XYDataSet for " + gcType + " contains " + dataSet.size() + " items.")
        );
    }
}