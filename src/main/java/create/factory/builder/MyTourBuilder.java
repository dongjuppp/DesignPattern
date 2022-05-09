package create.factory.builder;

import java.time.LocalDate;

public class MyTourBuilder implements TourPlanBuilder {

    private String title;

    private int day;

    private int night;

    private LocalDate start;

    private MyTourBuilder(){}

    public static MyTourBuilder builder(){
        return new MyTourBuilder();
    }


    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder dayAndNight(int day, int night) {
        this.day = day;
        this.night = night;
        return this;
    }

    @Override
    public TourPlanBuilder start(LocalDate start) {
        this.start = start;
        return this;
    }

    @Override
    public TourPlan build() {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle(title);
        tourPlan.setDay(day);
        tourPlan.setNight(night);
        tourPlan.setStartDate(start);
        return tourPlan;
    }
}
