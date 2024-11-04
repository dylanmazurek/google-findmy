package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class myw extends mzc {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.mzc
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        if (this.a.get() != null) {
            return false;
        }
        this.a.set(myv.a);
        return true;
    }

    @Override // defpackage.mzc
    public final /* bridge */ /* synthetic */ mmx[] b(Object obj) {
        this.a.set(null);
        return mzb.a;
    }
}
