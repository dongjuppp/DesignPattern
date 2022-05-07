package builder;

import java.time.LocalDate;

public class Main {


    public void main(){

        TourPlan london = MyTourBuilder.builder()
                .title("런던 여행")
                .start(LocalDate.of(2024,1,1))
                .dayAndNight(6,7)
                .build();
    }
}
