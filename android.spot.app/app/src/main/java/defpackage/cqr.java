package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqr extends bwe {
    @Override // defpackage.bwe
    public final void q(ckd ckdVar) {
        ckdVar.d();
        try {
            ckdVar.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - cro.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ckdVar.h();
        } finally {
            ckdVar.f();
        }
    }
}
