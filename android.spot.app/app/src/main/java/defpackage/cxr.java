package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxr extends mnl {
    public Object a;
    public /* synthetic */ Object b;
    final /* synthetic */ ConstraintTrackingWorker c;
    public int d;
    public ConstraintTrackingWorker e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxr(ConstraintTrackingWorker constraintTrackingWorker, mmx mmxVar) {
        super(mmxVar);
        this.c = constraintTrackingWorker;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(this);
    }
}
