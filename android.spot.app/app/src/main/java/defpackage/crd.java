package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crd implements cur {
    private static final String j = cqc.a("Processor");
    public final Context b;
    public final WorkDatabase c;
    private final hph k;
    private final eld l;
    public final Map e = new HashMap();
    public final Map d = new HashMap();
    public final Set g = new HashSet();
    public final List h = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object i = new Object();
    public final Map f = new HashMap();

    public crd(Context context, hph hphVar, eld eldVar, WorkDatabase workDatabase) {
        this.b = context;
        this.k = hphVar;
        this.l = eldVar;
        this.c = workDatabase;
    }

    public static void f(csl cslVar, int i) {
        if (cslVar != null) {
            cslVar.h.s(new csd(i));
            cqc.b();
            return;
        }
        cqc.b();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    private final void h(cvk cvkVar) {
        this.l.c.execute(new bx(this, cvkVar, 19, (byte[]) null));
    }

    public final csl a(String str) {
        boolean z;
        csl cslVar = (csl) this.d.remove(str);
        if (cslVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            cslVar = (csl) this.e.remove(str);
        }
        this.f.remove(str);
        if (z) {
            synchronized (this.i) {
                if (this.d.isEmpty()) {
                    Intent intent = new Intent(this.b, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.b.startService(intent);
                    } catch (Throwable th) {
                        cqc.b();
                        Log.e(j, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            }
        }
        return cslVar;
    }

    public final csl b(String str) {
        csl cslVar = (csl) this.d.get(str);
        if (cslVar == null) {
            return (csl) this.e.get(str);
        }
        return cslVar;
    }

    public final void c(cqs cqsVar) {
        synchronized (this.i) {
            this.h.add(cqsVar);
        }
    }

    public final void d(cqs cqsVar) {
        synchronized (this.i) {
            this.h.remove(cqsVar);
        }
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.i) {
            if (b(str) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final boolean g(bet betVar) {
        ArrayList arrayList = new ArrayList();
        Object obj = betVar.a;
        cvk cvkVar = (cvk) obj;
        String str = cvkVar.a;
        cvu cvuVar = (cvu) this.c.f(new cye(this, arrayList, str, 1, null));
        if (cvuVar == null) {
            cqc.b();
            String str2 = j;
            Objects.toString(obj);
            Log.w(str2, "Didn't find WorkSpec for id ".concat(obj.toString()));
            h(cvkVar);
            return false;
        }
        synchronized (this.i) {
            if (e(str)) {
                Set set = (Set) this.f.get(str);
                if (((cvk) ((bet) set.iterator().next()).a).b == ((cvk) obj).b) {
                    set.add(betVar);
                    cqc.b();
                    Objects.toString(obj);
                } else {
                    h((cvk) obj);
                }
            } else if (cvuVar.r != ((cvk) obj).b) {
                h((cvk) obj);
            } else {
                csl cslVar = new csl(new ilv(this.b, this.k, this.l, this, this.c, cvuVar, arrayList));
                jyz d = boy.d(((mmt) cslVar.j.d).plus(new mui(null)), new bea(cslVar, (mmx) null, 12, (byte[]) null));
                d.c(new ci(this, d, cslVar, 5, (char[]) null), this.l.c);
                this.e.put(str, cslVar);
                HashSet hashSet = new HashSet();
                hashSet.add(betVar);
                this.f.put(str, hashSet);
                cqc.b();
                getClass().getSimpleName();
                Objects.toString(obj);
                return true;
            }
            return false;
        }
    }
}
