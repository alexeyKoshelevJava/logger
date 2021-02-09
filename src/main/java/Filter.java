
import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        int countPassedFilter = 0;
        int countAllElements = 0;
        for (int value : source) {
            countAllElements++;
            if (value <= treshold) {
                logger.log("Элемент " + value + " прошел");
                result.add(value);
                countPassedFilter++;
            } else {
                logger.log("Элемент " + value + " НЕ прошел!");

            }
        }

        logger.log(" прошло фильтр " + countPassedFilter + " из " + countAllElements);
        return result;
    }

}