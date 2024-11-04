package defpackage;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yv implements afq {
    public final long a;
    public final zn b;
    public yy c;
    public final aox d;
    private cu e;

    public yv(long j, zn znVar, yy yyVar) {
        this.a = j;
        this.b = znVar;
        this.c = yyVar;
        ob obVar = new ob(this, 10);
        yw ywVar = new yw(obVar, znVar, j);
        yx yxVar = new yx(obVar, znVar, j);
        aou aouVar = aox.d;
        this.d = aot.a(new SuspendPointerInputElement(yxVar, ywVar, new zl(yxVar, ywVar, (mmx) null, 0)), new PointerHoverIconModifierElement(yq.a));
    }

    @Override // defpackage.afq
    public final void c() {
        this.e = this.b.i();
    }

    @Override // defpackage.afq
    public final void h() {
        if (this.e != null) {
            this.b.h();
            this.e = null;
        }
    }

    @Override // defpackage.afq
    public final void i() {
        if (this.e != null) {
            this.b.h();
            this.e = null;
        }
    }
}
