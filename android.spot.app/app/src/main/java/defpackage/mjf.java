package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mjf extends mbk {
    final /* synthetic */ mjg a;
    private final mbk b;

    public mjf(mjg mjgVar, mbk mbkVar) {
        this.a = mjgVar;
        this.b = mbkVar;
    }

    @Override // defpackage.mbk
    public final void a(mca mcaVar) {
        this.b.a(mcaVar);
        this.a.d.execute(new mgs(this, 13, null));
    }

    @Override // defpackage.mbk
    public final void b(mbl mblVar) {
        if (mblVar.b.a(mjg.b) == null) {
            mbk mbkVar = this.b;
            Collections.emptyList();
            List list = mblVar.a;
            mbi mbiVar = mblVar.c;
            lyn lynVar = new lyn(mblVar.b);
            lynVar.b(mjg.b, new njz(this.a, null));
            mbkVar.b(new mbl(list, lynVar.a(), mbiVar));
            return;
        }
        throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
    }
}
