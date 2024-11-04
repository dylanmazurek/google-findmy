package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class im extends kf {
    final /* synthetic */ ir a;
    final /* synthetic */ iu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(iu iuVar, View view, ir irVar) {
        super(view);
        this.b = iuVar;
        this.a = irVar;
    }

    @Override // defpackage.kf
    public final gx a() {
        return this.a;
    }

    @Override // defpackage.kf
    public final boolean b() {
        if (!this.b.b.x()) {
            this.b.b();
            return true;
        }
        return true;
    }
}
