package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noc extends noi implements Serializable, nog {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long a;

    public noc(long j) {
        this.a = j;
    }

    @Override // defpackage.nog
    public final long a() {
        return this.a;
    }

    @Override // defpackage.nog
    public final nno b() {
        return npg.o;
    }

    public noc() {
        this.a = nnt.a();
    }
}
