package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.util.Optional;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyy {
    public static final jnk a = jnk.l("com/google/android/libraries/precisionfinding/ranging/PrecisionRangingImpl");
    public final long b;
    public final Object c;
    public hyx d;
    public final Map e;
    public final jiy f;
    public final Map g;
    public final EnumSet h;
    public final Context i;
    public final hyv j;
    public Optional k;
    public Optional l;
    public Optional m;
    public final ScheduledExecutorService n;
    public final ExecutorService o;
    public Optional p;
    public Optional q;
    public Optional r;
    public Instant s;
    public Instant t;
    public Instant u;
    public Instant v;
    public boolean w;

    public hyy(lqz lqzVar, Context context, hyv hyvVar, ScheduledExecutorService scheduledExecutorService) {
        long millis;
        Optional empty = Optional.empty();
        Optional empty2 = Optional.empty();
        this.c = new Object();
        this.i = context;
        this.j = hyvVar;
        this.n = scheduledExecutorService;
        this.o = scheduledExecutorService;
        this.w = false;
        this.h = EnumSet.noneOf(hyh.class);
        this.g = new HashMap();
        this.e = new HashMap();
        this.s = Instant.EPOCH;
        this.u = Instant.EPOCH;
        this.v = Instant.EPOCH;
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.r = Optional.empty();
        if (hyvVar.c.isZero()) {
            millis = 100;
        } else {
            millis = hyvVar.c.toMillis();
        }
        this.b = millis;
        this.l = empty;
        empty2.isPresent();
        HashMap hashMap = new HashMap();
        jis jisVar = hyvVar.a;
        int i = ((jmi) jisVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            hyh hyhVar = (hyh) jisVar.get(i2);
            int ordinal = hyhVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    throw new UnsupportedOperationException("CS support not implemented.");
                }
            } else {
                hashMap.put(hyhVar, (hzb) lqzVar.a());
            }
        }
        this.f = jiy.i(hashMap);
        synchronized (this.c) {
            this.d = hyx.STOPPED;
        }
    }

    public final void a(int i) {
        synchronized (this.c) {
            hyx hyxVar = this.d;
            hyx hyxVar2 = hyx.STOPPED;
            if (hyxVar != hyxVar2) {
                this.d = hyxVar2;
                ((jni) ((jni) a.e()).j("com/google/android/libraries/precisionfinding/ranging/PrecisionRangingImpl", "stopPrecisionRanging", 445, "PrecisionRangingImpl.java")).s("Stopping Precision Ranging with reason: %s", i);
                ((hyf) this.k.get()).e.d(((Integer) hyg.a.getOrDefault(Integer.valueOf(i), 0)).intValue());
                hyv hyvVar = this.j;
                int i2 = 0;
                while (true) {
                    jis jisVar = hyvVar.a;
                    if (i2 >= ((jmi) jisVar).c) {
                        break;
                    }
                    hyh hyhVar = (hyh) jisVar.get(i2);
                    synchronized (this.c) {
                        Object obj = this.e.get(hyhVar);
                        hyx hyxVar3 = hyx.STOPPED;
                        if (obj != hyxVar3) {
                            this.e.put(hyhVar, hyxVar3);
                            this.o.execute(new hka(this, hyhVar, 11, (byte[]) null));
                        }
                    }
                    i2++;
                }
                if (this.j.b) {
                    this.o.execute(new hsi(this, 17));
                }
                synchronized (this.c) {
                    this.p = Optional.empty();
                    this.q = Optional.empty();
                    this.r = Optional.empty();
                }
                this.s = Instant.EPOCH;
                this.u = Instant.EPOCH;
                this.v = Instant.EPOCH;
                this.g.clear();
                this.h.clear();
                this.m = Optional.empty();
                this.k = Optional.empty();
                this.w = false;
            }
        }
    }
}
