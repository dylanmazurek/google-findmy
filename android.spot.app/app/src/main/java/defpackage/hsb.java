package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsb {
    public final long a;
    public long b;
    public long c;
    public int d;
    public int e;
    final String f;
    final String g;
    final boolean h;
    String i;
    int j;
    public String k;
    nej l;
    ndq m;
    int n;
    int o;
    public int p;
    public int q;
    int t;
    public int u;
    final int v = 1;
    public int r = -1;
    public jer s = jdl.a;

    public hsb(String str, String str2, boolean z, long j) {
        this.g = ivc.m(str);
        this.f = ivc.m(str2);
        this.h = z;
        this.a = j;
    }

    public static hsb a(String str, hmq hmqVar) {
        return new hsb(str, hmq.c(hmqVar), true, SystemClock.elapsedRealtime());
    }
}
