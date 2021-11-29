package singleton;

public class Settings {

    private Settings(){}

   private static class SettingsHolder{
       private static final Settings settings = new Settings();
   }

   public static Settings getInstance(){
        return SettingsHolder.settings;
   }

}