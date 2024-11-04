package defpackage;

import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccv {
    public static final ccu a = new cco();
    public static final ccu b = new ccp();
    public static final ccu c = new ccq();
    public static final ccu d = new ccr();
    public static final ccu e = new ccs();
    public static final ccu f = new ccn();
    public final Object j;
    public final ccw k;
    public final float o;
    public ccx r;
    public float s;
    private boolean u;
    public float g = 0.0f;
    public float h = Float.MAX_VALUE;
    public boolean i = false;
    public boolean l = false;
    public final float m = Float.MAX_VALUE;
    public final float n = -3.4028235E38f;
    private long t = 0;
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();

    public ccv(Object obj, ccw ccwVar) {
        this.j = obj;
        this.k = ccwVar;
        float f2 = 0.1f;
        if (ccwVar != c && ccwVar != d && ccwVar != e) {
            if (ccwVar == f) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (ccwVar != a && ccwVar != b) {
                    f2 = 1.0f;
                }
            }
        }
        this.o = f2;
        this.r = null;
        this.s = Float.MAX_VALUE;
        this.u = false;
    }

    private static void d(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }

    final void a(float f2) {
        this.k.b(this.j, f2);
        for (int i = 0; i < this.q.size(); i++) {
            if (this.q.get(i) != null) {
                throw null;
            }
        }
        d(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r26) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccv.b(long):void");
    }

    public final void c() {
        if (this.r.b > 0.0d) {
            if (ccm.a().b()) {
                if (this.l) {
                    this.u = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
