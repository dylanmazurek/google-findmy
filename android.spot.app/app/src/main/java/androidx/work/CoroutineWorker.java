package androidx.work;

import android.content.Context;
import defpackage.amr;
import defpackage.bea;
import defpackage.boy;
import defpackage.cpm;
import defpackage.cqb;
import defpackage.jyz;
import defpackage.mmx;
import defpackage.mnb;
import defpackage.mst;
import defpackage.mui;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends cqb {
    private final WorkerParameters e;
    private final mst f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = cpm.a;
    }

    @Override // defpackage.cqb
    public final jyz a() {
        return boy.d(this.f.plus(new mui(null)), new bea(this, (mmx) null, 9));
    }

    @Override // defpackage.cqb
    public final jyz b() {
        mnb mnbVar;
        if (!amr.i(this.f, cpm.a)) {
            mnbVar = this.f;
        } else {
            mnbVar = this.e.e;
        }
        mnbVar.getClass();
        return boy.d(mnbVar.plus(new mui(null)), new bea(this, (mmx) null, 10, (byte[]) null));
    }

    public abstract Object c(mmx mmxVar);
}
