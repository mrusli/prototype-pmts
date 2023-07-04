package mil.pusdalops.webui.window;

import java.util.LinkedHashMap;
import java.util.Map;

public class LineBasicData {

    private static Map<String, Integer[]> data;
    static {
        data = new LinkedHashMap<>();
        data.put("Total MASUK", new Integer[] {
                43934, 48656, 65165, 81827, 112143, 142383,
                171533, 165174, 155157, 161454, 154610
        });
        data.put("Total KELUAR", new Integer[] {
                24916, 37941, 29742, 29851, 32490, 30282,
                38121, 36885, 33726, 34243, 31050
        });
        data.put("Total Pendaftaran", new Integer[] {
                11744, 30000, 16005, 19771, 20185, 24377,
                32147, 30912, 29243, 29213, 25663
        });
    }
    
    public static Map<String, Integer[]> getData() {
        return data;
    }
}
