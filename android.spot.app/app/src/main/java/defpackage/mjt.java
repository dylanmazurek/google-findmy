package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjt {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final mjo[] b;

    static {
        new mjt(new mjo[0]);
    }

    public mjt(mjo[] mjoVarArr) {
        this.b = mjoVarArr;
    }

    public static /* synthetic */ void b(mjt mjtVar) {
        int i = 0;
        while (true) {
            mjo[] mjoVarArr = mjtVar.b;
            if (i < mjoVarArr.length) {
                mjo mjoVar = mjoVarArr[i];
                i++;
            } else {
                return;
            }
        }
    }

    public final void a(long j) {
        int i = 0;
        while (true) {
            mjo[] mjoVarArr = this.b;
            if (i < mjoVarArr.length) {
                mjoVarArr[i].c(j);
                i++;
            } else {
                return;
            }
        }
    }
}
