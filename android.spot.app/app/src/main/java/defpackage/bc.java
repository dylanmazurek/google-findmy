package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bc implements bb {
    final int a;
    final int b;
    final /* synthetic */ be c;

    public bc(be beVar, int i, int i2) {
        this.c = beVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.bb
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        ag agVar = this.c.p;
        if (agVar != null && this.a < 0 && agVar.G().ad()) {
            return false;
        }
        return this.c.af(arrayList, arrayList2, null, this.a, this.b);
    }
}
