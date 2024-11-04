package defpackage;

import android.content.Context;
import android.icu.util.ULocale;
import android.os.LocaleList;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.os.health.TimerStat;
import android.os.storage.StorageVolume;
import android.view.PointerIcon;
import java.io.File;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ct$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ Context m(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static /* bridge */ /* synthetic */ ULocale m(ULocale uLocale) {
        return ULocale.addLikelySubtags(uLocale);
    }

    public static /* bridge */ /* synthetic */ ULocale m(Object obj) {
        return (ULocale) obj;
    }

    public static /* bridge */ /* synthetic */ ULocale m(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ LocaleList m73m(Object obj) {
        return (LocaleList) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ HealthStats m74m(Object obj) {
        return (HealthStats) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ SystemHealthManager m75m(Object obj) {
        return (SystemHealthManager) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ TimerStat m77m(Object obj) {
        return (TimerStat) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ StorageVolume m78m(Object obj) {
        return (StorageVolume) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ PointerIcon m79m(Object obj) {
        return (PointerIcon) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ File m81m(Context context) {
        return context.getDataDir();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ String m82m(ULocale uLocale) {
        return uLocale.getScript();
    }

    public static /* bridge */ /* synthetic */ void m(Consumer consumer, Object obj) {
        consumer.accept(obj);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m89m(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
