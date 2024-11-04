package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ApiVersion {
    private static final int API_LEVEL = 32;
    private static final String CRONET_VERSION = "127.0.6521.0";
    private static final String LAST_CHANGE = "2bf4b62968523855a8bdb3e934c535e476ab5a87-refs/branch-heads/6521@{#1}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "127.0.6521.0@".concat("2bf4b629");
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 32;
    }
}
