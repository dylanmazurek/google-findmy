package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djo implements djf {
    private final dlu a;

    public djo(dlu dluVar) {
        this.a = dluVar;
    }

    @Override // defpackage.djf
    public final /* bridge */ /* synthetic */ djg a(Object obj) {
        return new djp((InputStream) obj, this.a);
    }

    @Override // defpackage.djf
    public final Class b() {
        return InputStream.class;
    }
}
