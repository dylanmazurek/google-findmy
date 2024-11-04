package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fto {
    public final ftm a;
    public final long b;
    public final int c;
    private final ftm d;
    private final ftm e;

    public fto(ftm ftmVar, ftm ftmVar2, ftm ftmVar3, long j, int i) {
        this.a = ftmVar;
        this.d = ftmVar2;
        this.e = ftmVar3;
        this.b = j;
        this.c = i;
    }

    public final String toString() {
        String format = String.format(Locale.US, "elapsedRealtime (ms) %d | distance (m) %f", Long.valueOf(this.b / 1000000), Float.valueOf(this.a.a));
        if (this.d != null) {
            format = String.valueOf(format).concat(String.valueOf(String.format(Locale.US, " | azimuth: %f", Float.valueOf(this.d.a))));
        }
        if (this.e != null) {
            format = String.valueOf(format).concat(String.valueOf(String.format(Locale.US, " | elevation: %f", Float.valueOf(this.e.a))));
        }
        return String.valueOf(format).concat(String.valueOf(String.format(Locale.US, " | rssi: %d", Integer.valueOf(this.c))));
    }
}
