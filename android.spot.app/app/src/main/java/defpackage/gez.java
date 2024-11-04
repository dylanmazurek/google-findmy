package defpackage;

import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gez {
    public static final jsb a = jrw.a;
    private static final TimeZone f = DesugarTimeZone.getTimeZone("America/Los_Angeles");
    public final String b;
    public final int c;
    public final Set d = new HashSet();
    public volatile long e = a();

    public gez(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public static final long a() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f);
        gregorianCalendar.setTimeInMillis(fma.i().toEpochMilli());
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
