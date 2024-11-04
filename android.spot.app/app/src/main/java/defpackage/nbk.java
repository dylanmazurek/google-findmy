package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nbk {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final String a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
