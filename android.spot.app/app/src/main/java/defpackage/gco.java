package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gco implements gcn {
    public final List a;
    public final int b;
    private final int c;

    public gco(int i, List list, int i2) {
        this.b = i;
        this.a = DesugarCollections.unmodifiableList(list);
        this.c = i2;
        if (i == 3) {
            hwx.J(i2 == -1);
        } else {
            hwx.J(i2 != -1);
        }
    }

    @Override // defpackage.gcn
    public final /* synthetic */ gbs a() {
        return frx.w(this);
    }

    @Override // defpackage.gcn
    public final List b() {
        return this.a;
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        hwx.U(z);
        return this.c;
    }
}
