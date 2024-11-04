package androidx.work;

import android.content.Context;
import defpackage.bpe;
import defpackage.ckv;
import defpackage.cqc;
import defpackage.csb;
import defpackage.hph;
import defpackage.lrs;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements ckv {
    static {
        cqc.a("WrkMgrInitializer");
    }

    @Override // defpackage.ckv
    public final /* synthetic */ Object a(Context context) {
        cqc.b();
        hph hphVar = new hph(new lrs());
        context.getClass();
        csb.i(context, hphVar);
        return bpe.f(context);
    }

    @Override // defpackage.ckv
    public final List b() {
        return Collections.emptyList();
    }
}
