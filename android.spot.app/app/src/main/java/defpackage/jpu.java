package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jpu {
    private static String a = "jqd";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] d = {"jqd", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int a() {
        return ((jrf) jrf.a.get()).b;
    }

    public static long b() {
        return jps.a.c();
    }

    public static jow d(String str) {
        return jps.a.e(str);
    }

    public static jpa f() {
        return i().a();
    }

    public static jpt g() {
        return jps.a.h();
    }

    public static jql i() {
        return jps.a.j();
    }

    public static jqs k() {
        return i().b();
    }

    public static String l() {
        return jps.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract jow e(String str);

    protected abstract jpt h();

    protected jql j() {
        return jqn.a;
    }

    protected abstract String m();
}
