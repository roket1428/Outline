package substratum.theme.template;

class ThemerConstants {
    // Simple AntiPiracy Configuration
    static final Boolean PIRACY_CHECK = false;

    // Miscellaneous Checks
    static final Boolean THEME_READY_GOOGLE_APPS = true;
    static final Boolean ENFORCE_MINIMUM_SUBSTRATUM_VERSION = true;
    static final int MINIMUM_SUBSTRATUM_VERSION = 560; // 510 is the final MM build
    static final String TARGETED_SUBSTRATUM_VERSION = ""; // Erase to nullify being latest

    // Dynamic filter that only works on Substratum 627+
    static final Boolean SUBSTRATUM_FILTER_CHECK = TARGETED_SUBSTRATUM_VERSION.equals("Latest");

    // Play Store AntiPiracy LVL configurations (Relies on PIRACY_CHECK)
    static final String BASE_64_LICENSE_KEY = "***REMOVED***";
    static final String APK_SIGNATURE_PRODUCTION = "***REMOVED***";

    // AntiPiracy Library Configurations (Relies on PIRACY_CHECK)
    static final Boolean ENFORCE_INTERNET_CHECK = true;
    static final Boolean ENFORCE_GOOGLE_PLAY_INSTALL = true;
    static final Boolean ENFORCE_AMAZON_APP_STORE_INSTALL = false;

    // Blacklisted APKs to prevent theme launching
    static final Boolean ENABLE_BLACKLISTED_APPLICATIONS = false;
    static final String[] BLACKLISTED_APPLICATIONS = new String[]{
            "com.android.vending.billing.InAppBillingService.LOCK",
            "com.android.vending.billing.InAppBillingService.LACK",
            "uret.jasi2169.patcher",
            "com.dimonvideo.luckypatcher",
            "com.chelpus.lackypatch",
            "com.forpda.lp",
            "com.android.vending.billing.InAppBillingService.LUCK",
            "com.android.protips",
    };
}
