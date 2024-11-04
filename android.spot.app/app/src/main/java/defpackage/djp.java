package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djp implements djg {
    public final dpt a;

    public djp(InputStream inputStream, dlu dluVar) {
        dpt dptVar = new dpt(inputStream, dluVar);
        this.a = dptVar;
        dptVar.mark(5242880);
    }

    @Override // defpackage.djg
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.djg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        this.a.reset();
        return this.a;
    }
}
