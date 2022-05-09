package create.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder title(String title);

    TourPlanBuilder dayAndNight(int day, int night);

    TourPlanBuilder start(LocalDate start);

    TourPlan build();
}
