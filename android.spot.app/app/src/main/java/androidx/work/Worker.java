package androidx.work;

import android.content.Context;
import defpackage.bcf;
import defpackage.boy;
import defpackage.bph;
import defpackage.cqb;
import defpackage.ctm;
import defpackage.jyz;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Worker extends cqb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.cqb
    public final jyz a() {
        return bph.c(f(), new bcf(17));
    }

    @Override // defpackage.cqb
    public final jyz b() {
        return bph.c(f(), new ctm(this, 1));
    }

    public abstract boy c();
}
