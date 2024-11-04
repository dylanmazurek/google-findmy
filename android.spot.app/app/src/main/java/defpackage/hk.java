package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hk extends kf {
    final /* synthetic */ hl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(hl hlVar, View view) {
        super(view);
        this.a = hlVar;
    }

    @Override // defpackage.kf
    public final gx a() {
        hm hmVar = this.a.a.j;
        if (hmVar == null) {
            return null;
        }
        return hmVar.a();
    }

    @Override // defpackage.kf
    public final boolean b() {
        this.a.a.o();
        return true;
    }

    @Override // defpackage.kf
    public final boolean c() {
        ho hoVar = this.a.a;
        if (hoVar.m != null) {
            return false;
        }
        hoVar.l();
        return true;
    }
}
