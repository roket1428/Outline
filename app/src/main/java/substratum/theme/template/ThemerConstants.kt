package substratum.theme.template

object ThemerConstants {
    // Simple AntiPiracy Configuration
    val PIRACY_CHECK = true

    // Miscellaneous Checks
    val ENABLE_KNOWN_THIRD_PARTY_THEME_MANAGERS = BuildConfig.SUPPORTS_THIRD_PARTY_THEME_SYSTEMS
    val ENFORCE_MINIMUM_SUBSTRATUM_VERSION = true
    val MINIMUM_SUBSTRATUM_VERSION = 712 // 510 is the final MM build
    // Blacklisted APKs to prevent theme launching
    val ENABLE_BLACKLISTED_APPLICATIONS = false
    val BLACKLISTED_APPLICATIONS = arrayOf(
            "com.android.vending.billing.InAppBillingService.LOCK",
            "com.android.vending.billing.InAppBillingService.LACK",
            "cc.madkite.freedom",
            "zone.jasi2169.uretpatcher",
            "uret.jasi2169.patcher",
            "com.dimonvideo.luckypatcher",
            "com.chelpus.lackypatch",
            "com.forpda.lp",
            "com.android.vending.billing.InAppBillingService.LUCK",
            "com.android.protips"
    )
    val OTHER_THEME_SYSTEMS = arrayOf(
            "com.slimroms.thememanager"
    )
    internal val THEME_READY_GOOGLE_APPS = BuildConfig.NEEDS_THEME_READY_GAPPS
    // Dynamic filter that only works on Substratum 627+
    // WARNING: Only enable if you are sure you want certification status to pass on Substratum
    //          before launching the theme, or else it will throw an unauthorized toast!
    internal val SUBSTRATUM_FILTER_CHECK = false
    // Play Store AntiPiracy LVL configurations (Relies on PIRACY_CHECK)
    internal val BASE_64_LICENSE_KEY = BuildConfig.LICENSE
    internal val APK_SIGNATURE_PRODUCTION = BuildConfig.SIGNATURE
    // AntiPiracy Library Configurations (Relies on PIRACY_CHECK)
    internal val ENFORCE_INTERNET_CHECK = false
    internal val ENFORCE_GOOGLE_PLAY_INSTALL = true
    internal val ENFORCE_AMAZON_APP_STORE_INSTALL = false
}